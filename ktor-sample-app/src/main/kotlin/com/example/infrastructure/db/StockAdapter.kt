package com.example.infrastructure.db

import com.example.application.port.output.StockGateway
import com.example.application.valueobject.StockData

class StockAdapter : StockGateway {
    override fun loadStock(): StockData {
        return StockData(3)
    }
}