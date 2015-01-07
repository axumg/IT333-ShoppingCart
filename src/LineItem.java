/*
* James Staab
* IT333
* Shopping cart program
* */

public class LineItem {


	//we have set this to private so these items may not be edited directly and can only be done with getter and setter methods.
	private String name;
	private int quantity;
	private double pricePerUnit;


	public LineItem(String name, int quantity, double pricePerUnit){
		this.name = name;
		this.pricePerUnit = pricePerUnit;
		this.quantity = quantity;
	
	}

	public double getCost(){
		return pricePerUnit * quantity;
	}

	public void setQuantity(int newQuantity){
		this.quantity = newQuantity;
	}

}