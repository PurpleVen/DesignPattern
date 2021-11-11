package JavaDecoratorDesignPattern.Model;

import JavaDecoratorDesignPattern.Controller.IceCream;
import JavaDecoratorDesignPattern.Controller.IceCreamDecorator;

public class MintIceCream extends IceCreamDecorator {
    public MintIceCream(IceCream iceCream) {
        super(iceCream);
    }

    @Override
    public double cost() {
        System.out.println("Adding Mint Ice-Cream!");
        return  1.50 +super.cost();
    }
}
