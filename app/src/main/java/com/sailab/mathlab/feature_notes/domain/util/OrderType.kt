package com.sailab.mathlab.feature_notes.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}