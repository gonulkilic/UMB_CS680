package edu.umb.cs.cs680.hw11;

public class PiechartObserver implements Observer {
	

	public void update(Observable obs,Object arg) {
		if(arg instanceof DJIAEvent) {
			DJIAEvent dJIAEvent = (DJIAEvent) arg;
			System.out.println("PieChartObserver-instance of DJIAEvent class.\n");
			System.out.println("DJIA :" +dJIAEvent.getDjia() +" \n");
		}else if(arg instanceof StockEvent) {
			StockEvent stockevent = (StockEvent) arg;
			System.out.println("PieChartObserver-instance of StockEvent class.\n");
			System.out.println(stockevent.getTicker()+ "  "+ stockevent.getQuote()+" \n");
		}

}
}