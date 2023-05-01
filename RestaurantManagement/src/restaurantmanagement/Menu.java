/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restaurantmanagement;

/**
 *
 * @author Srinath Ganesh
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class Menu {
    public static ArrayList<String> item_names = new ArrayList<>();
    public static ArrayList<Integer> item_prices = new ArrayList<>();
    
    public static void display(Connection c, Statement stmt) throws Exception {
        int counter = 0;
        try {
            Class.forName("org.postgresql.Driver");
            c = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/restaurant",
                            "postgres", "postgres");
            c.setAutoCommit(false);

            stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery("select * from menu;");
            while (rs.next()) {
                String name = rs.getString("dish");
                int price = rs.getInt("price");
                item_names.add(name);
                item_prices.add(price);
            }
            for(int i = 0; i < item_names.size();i++)
            {
                    System.out.println(counter++);
                    System.out.println("NAME = " + item_names.get(i));
                    System.out.println("PRICE = " + item_prices.get(i));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editMenu(Dish dish, Connection c, Statement stmt) throws Exception {
        Class.forName("org.postgresql.Driver");
        c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/restaurant",
                        "postgres", "postgres");
        c.setAutoCommit(false);

        stmt = c.createStatement();
        String sql = "insert into menu values (dish, price) '" + dish.name + "', " + Integer.parseInt(dish.price) + ");";
        stmt.executeUpdate(sql);
        c.commit();
    }
}
