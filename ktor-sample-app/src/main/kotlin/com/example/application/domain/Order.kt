package com.example.application.domain

import com.example.application.valueobject.StockData

class Order (private val stock: StockData, private val cart: Cart){
    fun validate() : Boolean {
        return getQuantity(stock) >= getCartItems(cart)
    }

    private fun getQuantity(stock: StockData): Int {
        return stock.quantity
    }

    private fun getCartItems(cart: Cart): Int {
        // TODO get from Cart
        return 1
    }
}