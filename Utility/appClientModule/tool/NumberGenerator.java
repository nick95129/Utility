package tool;

public class NumberGenerator extends Thread  {
	  private NumberUtility numberUtility;
	  private int maxNumber;
	  private boolean isEvenNumber;
	   
	  
	  public NumberGenerator(NumberUtility numberUtility, int maxNumber, boolean isEvenNumber) {
	      this.numberUtility = numberUtility;
	      this.maxNumber = maxNumber;
	      this.isEvenNumber = isEvenNumber;
	  }
	  
	  public void run() {
	      int i = (isEvenNumber == true) ? 2 : 1;
	      
	      while (i <= maxNumber) {
	          if(isEvenNumber == true) {
	              numberUtility.printEven(i);
	          }
	          else {
	              numberUtility.printOdd(i);   
	          }
	           
	          i = i + 2;
	      }
	  }
	  
	  public static void main(String[] args) {
	       
	  } 
}
