import java.util.ArrayList;

public class CafeUtil {
    
    public int getStreakGoal(){
        int sum = 0;
        for (int i = 0; i<=10; i++){
            sum +=i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for (int i = 0; i<=lineItems.length-1; i++){
            sum +=lineItems[i];
        }
        return sum;
    }

    public void displayMenu(ArrayList<String> menuItems){
        for (int i=0; i <menuItems.size(); i++){
            System.out.println(i + menuItems.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers){
        for (int i=-1; i <customers.size(); i++){
        System.out.println("Please enter your name:");
        String userName = System.console().readLine();
        System.out.println("Hello," + userName+"!");
            System.out.println("There are "+ (i+1) +" people in front of you");
            customers.add(userName);
            System.out.println(customers);
        }
    }
}