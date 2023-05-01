/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmanagement;
public class Waiter {
    private int delivery_id;
    private int table_number;

    Waiter(int delivery_id, int table_number) {
        this.delivery_id = delivery_id;
        this.table_number = table_number;
    }

    public void Deliver() {
        System.out.println();
        System.out.println("Delivery number " + delivery_id + " delivered to table number " + table_number);
        System.out.println();
    }
}

class WaiterFactory {
    public Waiter createWaiter(int delivery_id, int table_number) {
        return new Waiter(delivery_id, table_number);
    }
}
/**
 *
 * @author Srinath Ganesh
 */

/*
public class Waiter {
    private int delivery_id;
    private int table_number;

    public Waiter(int delivery_id, int table_number) {
        this.delivery_id = delivery_id;
        this.table_number = table_number;
    }

    public void Deliver() {
        System.out.println();
        System.out.println("Delivery number " + delivery_id + " delivered to table number " + table_number);
        System.out.println();
    }
}
*/

