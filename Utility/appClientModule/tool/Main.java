package tool;

public class Main {
	public static void main(String[] args) {
	      NumberUtility numUtility = new NumberUtility(); //single instance shared by oddGen and evenGen threads
	      final int MAX_NUM = 10; 
	  
	      //create 2 threads, one to generate odd numbers and the other to generate even numbers
	      NumberGenerator oddGen  = new NumberGenerator(numUtility, MAX_NUM, false);
	      NumberGenerator evenGen = new NumberGenerator(numUtility, MAX_NUM, true);
	       
	      oddGen.start();  //start the thread - invokes the run() method on NumberGenerator
	      evenGen.start(); //start the thread - invokes the run() method on NumberGenerator
	}

	/* (non-Java-doc)
	 * @see java.lang.Object#Object()
	 */
	public Main() {
		super();
	}

}