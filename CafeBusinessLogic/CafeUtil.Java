//!Important: Here we will code all of the following methods in our CafeUtil.java file.

import java.util.ArrayList;

public class CafeUtil{
    public int getStreakGoal(){
        int result = 0;
        for(int i = 1; i <= 10; i++){
            result = result + i;
        }
        return result;
    }

    public double getOrderTotal(double[] prices){
        double sum = 0;
        for(int i =0; i < prices.length; i++){
            sum += prices[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        //*Note: in Java the arraylist length is size()
        for(int i = 0; i < menuItems.size(); i++){
            System.out.println(i +" - " + menuItems.get(i));
        }
    }

    // Per programming with Michael W.for add customer.

    public void addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "! There are " + customers.size() + " people in front of you" );
        customers.add(username);
        System.out.println(customers);
    }
}
