package com.example.application

import com.example.application.domain.Cart
import com.example.application.domain.Order
import com.example.application.port.output.StockGateway

class BuyManager(private val stockGateway: StockGateway) {

    fun buy() : String {

        val stock = stockGateway.loadStock()
        val cart = Cart()
        val order = Order(stock, cart)
        if(!order.validate()){
            return "invalid"
        }
        return "stock:${stock.quantity} transactId"
    }
}