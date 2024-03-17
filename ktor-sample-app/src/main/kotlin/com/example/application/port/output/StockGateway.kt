package com.example.application.port.output

import com.example.application.valueobject.StockData

interface StockGateway {
    fun loadStock(): StockData
}