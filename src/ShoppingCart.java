/**
* James Staab
* IT333
* Shopping cart program
* */
							//As you will notice below, I am a member of the same line opening curly brace master race.
public class ShoppingCart{

	LineItem[] basket;

	//Create a new shopping cart and initialize array
	public ShoppingCart(){
		basket = new LineItem[0];

	}

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
			System.out.println("adding a(n) " + item.name + " it's cost is " + item.getCost());
			tempBasket[count] = item;
			basket = tempBasket;
		}


	}

	public double getTotalCost(){
		double total = 0;
		for(LineItem item : basket){
				total += item.getCost();
		}

		return total;
	}

}