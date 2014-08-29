package org.nick;

public class Triangle {
	private String type;
	
   public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

public Triangle() {};
   
   public void draw() {
	   System.out.println(getType() + " Trangle drawing.");
   }
}
