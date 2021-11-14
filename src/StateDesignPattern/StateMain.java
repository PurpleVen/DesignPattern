package StateDesignPattern;

import StateDesignPattern.Controller.CreditCardAlgorithm;
import StateDesignPattern.Controller.PaypalAlgorithm;
import StateDesignPattern.Controller.ShoppingCart;
import StateDesignPattern.Model.Product;

public class StateMain {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product pants = new Product("234", 25);
        Product shirt = new Product("987", 15);


        cart.addProduct(pants);
        cart.addProduct(shirt);


        //payment decisions
        cart.pay(new PaypalAlgorithm("paulo@buildappswithpaulo.com", "nowayman"));


        cart.pay(new CreditCardAlgorithm("Paulo", "238756464"));


    }
}
