package IteratorDesignPattern;

import IteratorDesignPattern.Model.Catalog;
import IteratorDesignPattern.Model.Seller;

import java.util.ArrayList;

public class IteratorMain {

    public static void main(String[] args) {

        Catalog devStoreCatalog = new DevStoreCatalog();
        Catalog geekyStoreCatalog = new DevStoreCatalog();




        Seller seller = new Seller(geekyStoreCatalog, devStoreCatalog);
        seller.printCatalog();


//        //loop through dev Catalog - Array
//        for (int i = 0; i < devCatalog.length; i++) {
//            Product product = devCatalog[i];
//            System.out.print(product.getName() + " ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice());
//        }
//
//        System.out.println("---------");
//        //loop through geeky catalog - ArrayList
//        for (int i = 0; i < geekyCatalog.size(); i++) {
//            Product product = (Product)geekyCatalog.get(i);
//            System.out.print(product.getName() + " ");
//            System.out.print(product.getDescription() + " ");
//            System.out.println(product.getPrice());
//
//        }




    }
}
