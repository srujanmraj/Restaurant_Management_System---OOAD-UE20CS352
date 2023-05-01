/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmanagement;

/**
 *
 * @author Srinath Ganesh
 */
import java.util.*;

public interface IBill {
    int getCost();
}

class Bill implements IBill {
    protected int id;
    private List<Dish> list_of_dishes;

    public Bill(List<Dish> list_of_dishes) {
        this.list_of_dishes = list_of_dishes;
    }

    @Override
    public int getCost() {
        int sum = 0;
        for (Dish dish : list_of_dishes) {
            try {
                sum += Integer.parseInt(dish.price);
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }
        System.out.println("Total Cost " + sum);

        return sum;
    }
}

class ServiceChargeDecorator implements IBill {
    private IBill bill;
    private int serviceChargePercentage;

    public ServiceChargeDecorator(IBill bill) {
        this.bill = bill;
        this.serviceChargePercentage = 10;
    }

    @Override
    public int getCost() {
        int cost = bill.getCost();
        int serviceCharge = cost * serviceChargePercentage / 100;
        System.out.println("Service Charge " + serviceCharge);
        return cost + serviceCharge;
    }
}
/*
public class Bill {
    protected int id;
    private List<Dish> list_of_dishes;

    public Bill(List<Dish> list_of_dishes) {
        this.list_of_dishes = list_of_dishes;
    }

    public int getCost() {
        int sum = 0;
        for (Dish dish : list_of_dishes) {
            try {
                sum += Integer.parseInt(dish.price);
            } catch (NumberFormatException e) {
                System.err.println(e);
            }
        }

        System.out.println("Total Cost " + sum);

        return sum;
    }
}
*/