package FactoryDesignPattern;

import FactoryDesignPattern.Controller.HamburgerStore;
import FactoryDesignPattern.Model.CheeseBurger;
import FactoryDesignPattern.Model.Hamburger;
import FactoryDesignPattern.Model.JamHamburgerstore;
import FactoryDesignPattern.Model.MozHamburgerStore;

public class Main {

    public static void main(String[] args) {

        CheeseBurger cheeseBurger = new CheeseBurger();

        HamburgerStore mozambicanBurgerStore = new MozHamburgerStore();
        HamburgerStore jamaicanBurgerStore = new JamHamburgerstore();

        Hamburger hamburger = mozambicanBurgerStore.orderHamburger("cheese");
        System.out.println("Paulo ordered " + hamburger.getName() + "\n" );


        hamburger = jamaicanBurgerStore.orderHamburger("veggie");
        System.out.println("James Bond ordered: " + hamburger.getName() + "\n");




    }
}

