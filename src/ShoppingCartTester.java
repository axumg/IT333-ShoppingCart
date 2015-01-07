/**
 * Created by Zak on 1/6/2015.
 */
public class ShoppingCartTester {

    public static void main(String[] args){
        ShoppingCart singleItemCart = new ShoppingCart();
        ShoppingCart typicalCart = new ShoppingCart();
        ShoppingCart fullCart = new ShoppingCart();
        ShoppingCart overflowCart = new ShoppingCart();
        ShoppingCart emptyCart = new ShoppingCart();

        LineItem lime = new LineItem("Lime", 4, .10);
        LineItem coconut = new LineItem("Coconut", 2, 2.25);

        //testing singleItemCart
        singleItemCart.add(lime);
        System.out.println("Single Item Cart total cost: $" +singleItemCart.getTotalCost());

        //testing typicalCart
        typicalCart.add(lime);
        typicalCart.add(lime);
        typicalCart.add(coconut);
        typicalCart.add(lime);
        typicalCart.add(coconut);

        System.out.println("Typical 5 item cart total cost: $"+typicalCart.getTotalCost());

        //testing fullCart

        for (int i = 0; i < 5; i++){
            fullCart.add(lime);
            fullCart.add(coconut);
        }
        System.out.println("Full 10 item cart cost: $" + fullCart.getTotalCost());

        //testing overflowCart

        for (int i = 0; i < 12; i++){
            overflowCart.add(coconut);
        }
        System.out.println("Overflow 10 Item cart cost: $" + overflowCart.getTotalCost());

        System.out.println("Empty Cart cost: $" + emptyCart.getTotalCost());
    }

}
