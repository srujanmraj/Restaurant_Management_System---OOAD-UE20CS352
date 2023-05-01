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
class Order {
    public List<Dish> list_of_dishes;
    public int status; // 1 if order is delivered 0 if still under preparation

    public Order(List<Dish> list_of_dishes, int status) {
        this.list_of_dishes = list_of_dishes;
        this.status = status;
    }
    public void AddItem(Scanner input, List<Dish> list) {
        int number;
        try {
            System.out.println("\n");
            System.out.println("Enter Dish Number: ");
            number = Integer.parseInt(input.nextLine());
            list_of_dishes.add((Dish) list.toArray()[number]);
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public List<Dish> RemoveItem(Scanner input, List<Dish> list) {
        int number;
        try {
            System.out.println("\n");
            System.out.println("Enter Dish Number: ");
            number = Integer.parseInt(input.nextLine());
            list_of_dishes.remove((Dish) list.toArray()[number]);
        } catch (Exception e) {
            System.err.println(e);
        }

        return list_of_dishes;
    }
}