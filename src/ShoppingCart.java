/*
* James Staab
* IT333
* Shopping cart program
* */
							//As you will notice below, I am a member of the same line opening curly brace master race.
public class ShoppingCart{

	LineItem[] basket;

	//Create a new shopping cart and initialize array
	public ShoppingCart(){
		basket = new LineItem[10];

	}

	public void add(LineItem item){
		int count = 0;
		while (count < 10){
			if (basket[count] == null){
				basket[count] = item;
				break;
			}
			else count++;
		}
		if (count == 10){
			System.out.println("My cart is too full! Why can't I hold all of these limes?!?");
		}
	}

	public double getTotalCost(){
		double total = 0;
		for(LineItem item : basket){
			if (item != null) {
				total += item.getCost();
			}
		}

		return total;
	}

}