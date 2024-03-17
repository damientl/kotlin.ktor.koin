package com.example


import com.example.application.BuyManager
import com.example.application.port.output.StockGateway
import com.example.infrastructure.db.StockAdapter
import org.koin.dsl.module

val appModule = module {

    // Will match StockGateway interface only. Cast is needed to inject interface
    single { StockAdapter() as StockGateway }

    // https://insert-koin.io/docs/reference/koin-core/injection-parameters/#resolving-injected-parameters-from-graph
    single { BuyManager(get()) } // `single` creates a singleton instance of BuyManager
    // Add more services or repositories here as needed



}