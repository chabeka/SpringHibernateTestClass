package com.mkyong.stock.dao;

import com.mkyong.stock.model.Stock;

public interface StockDao {
		
	Stock findByStockCode(String stockCode);

}
