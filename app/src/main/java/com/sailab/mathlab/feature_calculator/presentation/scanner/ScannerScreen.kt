package com.sailab.mathlab.feature_calculator.presentation.scanner

import android.graphics.Bitmap
import android.graphics.ImageDecoder
import android.net.Uri
import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.activity.result.launch
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.FilterQuality
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.google.mlkit.vision.common.InputImage
import com.google.mlkit.vision.text.TextRecognition
import com.google.mlkit.vision.text.latin.TextRecognizerOptions
import kotlinx.coroutines.launch
import org.mariuszgromada.math.mxparser.Expression


@Composable
fun ScannerScreen() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    var imageUri by remember { mutableStateOf<Uri?>(null) }
    var bitmap by remember { mutableStateOf<Bitmap?>(null) }
    val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)
    val extractedTextList = mutableListOf<String>()
    var text by remember { mutableStateOf("") }
    var processing by remember { mutableStateOf(false) }

    val launcher = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.GetContent()
    ) {
        imageUri = it
        bitmap =
            it?.let { it1 ->
                ImageDecoder.createSource(
                    context.contentResolver,
                    it1
                )
            }?.let { it2 ->
                ImageDecoder.decodeBitmap(
                    it2
                )
            }
    }

    val launcher2 = rememberLauncherForActivityResult(
        contract = ActivityResultContracts.TakePicturePreview()
    ) {
        bitmap = it
    }

    Column(
        modifier = Modifier
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier
        ) {
            Button(onClick = { launcher.launch("image/*") }) {
                Text("Gallery")
            }
            Spacer(modifier = Modifier.width(20.dp))

            Button(onClick = {
                launcher2.launch()
            }) {
                Text(text = "Camera")
            }
        }

        bitmap?.let {
            Image(
                bitmap = bitmap?.asImageBitmap()!!,
                contentDescription = "img",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
                    .padding(top = 40.dp),
                contentScale = ContentScale.Fit,
                filterQuality = FilterQuality.High
            )

            val image = InputImage.fromBitmap(bitmap!!, 0)

            if (processing) {
                //
            } else {
                processing = true
                recognizer
                    .process(image)
                    .addOnSuccessListener { result ->
                        for (block in result.textBlocks) {
                            for (line in block.lines) {
                                for (element in line.elements) {
                                    val elementText = element.text
                                    extractedTextList.add(elementText)
                                }
                            }
                        }
                        text = extractedTextList.joinToString(separator = " ")
                        processing = false
                    }
            }
            val exp = Expression(text)
            val resultTxt = exp.calculate()
            if(!resultTxt.isNaN()) {
                Text(
                    text = "$text=$resultTxt",
                    modifier = Modifier.padding(40.dp),
                    fontSize = MaterialTheme.typography.displaySmall.fontSize
                )
            } else {
                scope.launch {
                    Toast.makeText(context, "Please Try Again", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}