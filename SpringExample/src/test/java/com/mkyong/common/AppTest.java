package com.mkyong.common;


import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mkyong.stock.bo.StockBo;
import com.mkyong.stock.model.Stock;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="/spring/config/BeanLocations.xml")
public class AppTest extends TestCase {
	
	static ApplicationContext appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	static StockBo stockBo = (StockBo)appContext.getBean("stockBo");
	
	@Autowired
	StockBo stockBo2;
	
	
	public static void initHibernate() throws Exception{
		appContext = new ClassPathXmlApplicationContext("spring/config/BeanLocations.xml");
	    stockBo = (StockBo)appContext.getBean("stockBo");
	}
	
	@Before
    public  void avantTests() {
        System.out.println("------------------------");
        System.out.println("Avant Tests");
        System.out.println("------------------------");
    }
	
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
        assertNotNull(stockBo);
        
        Stock stc = stockBo.findByStockCode("76268");
        assertNotNull(stc);
        assertEquals(stc.getStockName(), "HAIO");
        //assertNotNull(stockBo2);
    }
}
