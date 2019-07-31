package com.riahi.presentation

interface DataRepository {
    val members: String?
    var onRefreshListener: List<()-> Unit>

    suspend fun update()
}