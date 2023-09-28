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
        //work on method later
    }

    public void addCustomer(ArrayList<String> customers){
        //work on method later
    }




}
