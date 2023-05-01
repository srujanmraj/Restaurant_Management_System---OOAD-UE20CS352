/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmanagement;

/**
 *
 * @author Srinath Ganesh
 */
public class Payment {
    private int amount;

    public Payment(int amount) {
        this.amount = amount;
    }

    public void PaymentDone() {
        System.out.println("\nProcessing...");
        System.out.println("Payment of " + amount + " Done\n");
        System.out.println("Visit Again!");
    }
}