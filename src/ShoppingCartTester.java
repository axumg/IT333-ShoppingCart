/**
* James Staab
* IT333
* Shopping cart program
* */
public class ShoppingCartTester {

    public static void main(String[] args){
        ShoppingCart singleItemCart = new ShoppingCart();
        ShoppingCart typicalCart = new ShoppingCart();
        ShoppingCart fullCart = new ShoppingCart();
        ShoppingCart overflowCart = new ShoppingCart();
        ShoppingCart emptyCart = new ShoppingCart();

        LineItem lime = new LineItem("Lime", 4, .10);
        LineItem coconut = new LineItem("Coconut", 2, 2.25);


        //test the LineItem first before testing it with the carts
        System.out.println("First lets start by testing the Items by getting the cost of the lime, changing the quantity from 4 to 5, get getting the cost again to verify");
        System.out.println(lime.getCost());
        lime.setQuantity(5);
        System.out.println(lime.getCost());
        System.out.println("As you can see we are able to change the quantity of the items in the LineItem class. \n \n ");


        System.out.println("now lets test the various carts cases available");
        //testing singleItemCart
        System.out.println("The Single Item Cart test case is meant to check if the cart functions with 1 item contained");
        singleItemCart.add(lime);
        System.out.println("Single Item Cart total cost: $" +singleItemCart.getTotalCost() + "\n \n ");

        //testing typicalCart
        System.out.println("The Typical Cart test case is meant to check if the cart functions with 5 items contained");
        typicalCart.add(lime);
        typicalCart.add(lime);
        typicalCart.add(coconut);
        typicalCart.add(lime);
        typicalCart.add(coconut);
        System.out.println("Typical 5 item cart total cost: $"+typicalCart.getTotalCost()+ "\n \n ");

        //testing fullCart
        System.out.println("The Full Cart test case is meant to check if the cart functions with 10 items contained");
        for (int i = 0; i < 5; i++){
            fullCart.add(lime);
            fullCart.add(coconut);
        }
        System.out.println("Full 10 item cart cost: $" + fullCart.getTotalCost()+ "\n \n ");

        //testing overflowCart
        System.out.println("The Overflow Cart test case is meant to check if the cart functions with the 10 item boundary that was set");
        for (int i = 0; i < 12; i++){
            overflowCart.add(coconut);
        }
        System.out.println("Overflow 10 Item cart cost: $" + overflowCart.getTotalCost()+ "\n \n ");

        System.out.println("The Empty Cart test case is meant to check if the cart functions with 0 items added");
        System.out.println("Empty Cart cost: $" + emptyCart.getTotalCost()+ "\n \n ");


    }

}
