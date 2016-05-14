/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cn.edu.uestc.factorymethodpattern.pizzafm;

/**
 *
 * @author Liranan
 */
class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Clam Pizaa";
        dough = "Extra Thick Crust Pizza";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella cheese");
        toppings.add("Frozen Clams from Chesapeake Bay");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
