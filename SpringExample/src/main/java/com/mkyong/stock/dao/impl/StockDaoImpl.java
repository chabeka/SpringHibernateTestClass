package com.mkyong.stock.dao.impl;

import org.hibernate.Query;

import com.mkyong.dao.impl.GenericDAOImpl;
import com.mkyong.stock.dao.StockDao;
import com.mkyong.stock.model.Stock;

public class StockDaoImpl extends GenericDAOImpl<Stock, Long> implements StockDao{
	
	
	public Stock findByStockCode(String stockCode){
		String sql = "from Stock where stockCode=?";
		Query query = currentSession().createQuery(sql);
		query.setString(0, stockCode);
		Stock stock = (Stock) query.uniqueResult();
		return stock;
	}

}
