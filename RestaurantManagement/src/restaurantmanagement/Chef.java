/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmanagement;

/**
 *
 * @author Srinath Ganesh
 */
public class Chef {
    private Order order;

    public Chef(Order order) {
        this.order = order;
    }

    public void MakeOrder() {
        for (Dish dish : order.list_of_dishes) {
            System.out.println();
            System.out.println(dish.name + " Preparing...");
            System.out.println(dish.name + " Done");
        }
    }
}
