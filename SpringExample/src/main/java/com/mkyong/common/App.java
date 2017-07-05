package com.mkyong.common;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Compte;
import com.mkyong.stock.model.CompteCourant;
import com.mkyong.stock.model.Stock;

public class App 
{
    public static void main( String[] args )
    {
/*    	ApplicationContext appContext = 
    		new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	
    	StockBo stockBo = (StockBo)appContext.getBean("stockBo");
    	System.out.println(stockBo);
    	*//** insert **//*
    	Stock stock = new Stock();
    	stock.setStockCode("76268");
    	stock.setStockName("HAIO");
    	stockBo.saveOrUpdate(stock);
    	System.out.println(stock);
    	
    	*//** select **//*
    	Stock stock2 = stockBo.findByStockCode("7668");
    	System.out.println(stock2);
    	
    	*//** update **//*
    	stock2.setStockName("HAIO-1");
    	stockBo.update(stock2);
    	
    	*//** delete **//*
    	stockBo.remove(stock2);
    	
    	System.out.println("Done");*/
    	
    	//Integer[] tabInteger = {1, 3, 11, 33, 41, 9, 12, 45};
    	//Map result = plusGrandIndice(tabInteger);
    	//System.out.println(result);

    	Integer[] tab = new Integer[6];
    	System.out.println(tab.length);
    	tab[0] = 0;
    	tab[1] = 1;
    	tab[2] = 2;
    	tab[3] = 3;
    	tab[4] = 4;
    	
    }
    /**
     * 
     * @param tab
     * @return une map<indice, plus grande valeur>
     */
    public static Map<Integer, Integer> plusGrandIndice(Integer[] tab){
    	Map<Integer, Integer> mapIndicePlusGrand = new HashMap<Integer, Integer>();
    	
    	if (tab != null){
    		Integer tempIndice = 0; // indice temporaire
    		Integer tempPGrand = tab[0]; // plus grand nombre temporaire
    		for (int i = 0; i<tab.length ; i++){
    			if (tab[i] > tempPGrand)
    				tempPGrand = tab[i];
    				tempIndice = i;
    		}
    		mapIndicePlusGrand.put(tempIndice, tempPGrand);
    	}
    	
		return mapIndicePlusGrand;
    	
    }
    
    public Integer[] insertNumberInTab (Integer[] tab, Integer value){
    	
    	if (tab != null && tab[0] == null){
    		tab[0] = value;
    	} else {
    		for( int i = 0; i < tab.length; i++){
    			if (tab[i] < value)
    				continue;
    			else {
    				Integer tempIndice = i;
    				Integer tempVal = tab[i];
    				tab[i] = value;
    				for (int j = tempIndice+1; j < tab.length; j++){
    					Integer tempVal2 = tab[i];
    					tab[i] = tempVal;
    					tempVal = tempVal2;
    				}
    				break;
    			}
    		}
    	}
		return null;
    	
    }
}
