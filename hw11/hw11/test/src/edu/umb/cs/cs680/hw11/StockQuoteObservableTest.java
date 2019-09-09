package edu.umb.cs.cs680.hw11;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.HashMap;


public class StockQuoteObservableTest {

	StockQuoteObservable stockObservable = new StockQuoteObservable();
	HashMap<String, Float> map = new HashMap<>();
	
	public void setup()
	{
		stockObservable.addObservers(new PiechartObserver());
		stockObservable.addObservers(new TableObserver());
		stockObservable.addObservers(new ThreeDObserver());
	}
	
	@Test
	public void testObserver()
	{
		
		stockObservable.changeQuote("Microsoft",65);
		stockObservable.changeQuote("Dell", 72);
		stockObservable.changeQuote("Microsoft",80 );
		
		map.put("Microsoft",(float) 65);
		map.put("Dell",(float)  72);
		map.put("Microsoft",(float) 80);
		
		//object check
		assertEquals(stockObservable.getMap(),map);
		
		//size check
		assertEquals(stockObservable.getMap().size(),2);
		
		//check contain same key		
		assertTrue(stockObservable.getMap().keySet().containsAll((map.keySet())));
		
		//check two map object mapping same or not?			
		assertTrue(map.equals(stockObservable.getMap()));
	}
}


