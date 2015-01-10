/**
* James Staab
* IT333
* Shopping cart program
* */
							
public class ShoppingCart{

	LineItem[] basket;

	
	/**
	 * this is the default constructor that takes no parameters and initializes an empty array of line Items named basked
	 * 
	 * @return [description]
	 */
	public ShoppingCart(){
		basket = new LineItem[0];

	}

	/**
	 * This is the method to add LineItems to the array
	 * @param item This is the LineItem to be added to the Shopping cart
	 */
	public void add(LineItem item){

		if (basket.length > 9) {
			System.out.println("My cart is too full! Why can't I hold all of these limes?!?");
		}
		else{
			LineItem[] tempBasket = new LineItem[basket.length + 1];
			int count = 0;
			for (LineItem thing : basket) {
				tempBasket[count] = thing;
				count++;
			}
			System.out.println("adding a(n) " + item.getName() + " it's cost is " + item.getCost());
			tempBasket[count] = item;
			basket = tempBasket;
		}


	}

	/**
	 * This is a method that returns a double of the total cost
	 * @return returns the total cost of the items in the basket
	 */
	public double getTotalCost(){
		double total = 0;
		for(LineItem item : basket){
				total += item.getCost();
		}

		return total;
	}

}