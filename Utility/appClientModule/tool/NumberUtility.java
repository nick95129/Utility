package tool;

public class NumberUtility {
	  boolean oddPrinted = false;
	  
	   public synchronized void printOdd(int number) {
	  
	       while (oddPrinted == true) {
	           try {
	               wait();   // waits until notified by even thread 
	           } catch (InterruptedException e) {
	               e.printStackTrace();
	           }
	       }
	  
	       System.out.println("printOdd() " + number);
	       oddPrinted = true;
	       notifyAll();  //notify all waiting threads
	  
	   }
	  
	   public synchronized void printEven(int number) {
	       while (oddPrinted == false) {
	           try {
	               wait();  //waits until notified by the odd thread
	  
	           } catch (InterruptedException e) {
	  
	           }
	       }
	  
	       oddPrinted = false;
	       System.out.println("printEven() " + number);
	       notifyAll();  //notify all waiting threads
	   }
}
