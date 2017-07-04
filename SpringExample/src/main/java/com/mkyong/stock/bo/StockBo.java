package com.mkyong.stock.bo;

import com.mkyong.dao.GenericDAO;
import com.mkyong.stock.model.Stock;

public interface StockBo extends GenericDAO<Stock, Long>{
		
	Stock findByStockCode(String stockCode);

}
