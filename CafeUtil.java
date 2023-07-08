import java.util.ArrayList;
import java.util.Locale;
import java.text.NumberFormat;
import java.util.Scanner;

public class CafeUtil{
    public int getStreakGoal(){ //no parameters
        int sum = 0; //initialize sum
        for(int i = 1; i <= 10; i++){ //loop through 10 weeks
            sum += i; //add each week to sum
        } 
        return sum; //return sum
    }

    //overload for getStreakGoal to take in a number of weeks
    public int getStreakGoal(int numWeeks){ //takes in an int
        int sum = 0; //initialize sum
        for(int i = 1; i <= numWeeks; i++){ //loop through numWeeks
            sum += i; //add each week to sum
        } 
        return sum; //return sum
    }

    // Order Total Calculator
    public String getOrderTotal(double[] prices){ //takes in an array of doubles
        double sum = 0;  //initialize sum
        for(int i = 0; i < prices.length; i++){ //loop through array
            sum += prices[i]; //add each element to sum
        } 
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String formattedSum = currencyFormat.format(sum);
        return formattedSum; //return sum
    }

    public void displayMenu(ArrayList<String> menu){ //takes in an arraylist of strings
        for(int i = 0; i < menu.size(); i++){ //loop through arraylist
            String menuItem = menu.get(i); //get each element
            System.out.println(i + ": " + menuItem); //print each element
        }
    }

    public void displayMenu(ArrayList<String> menu, ArrayList<Double> prices){ //takes in two arraylists
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        for(int i = 0; i < menu.size(); i++){ //loop through arraylist
            String menuItem = menu.get(i); //get each element
            double price = prices.get(i); //get each element
            String formattedPrice = currencyFormat.format(price);
            System.out.println(i + ": " + menuItem + " --" + formattedPrice); //print each element
        }
    }
// triple ninja bonus round ;p
    public void printPriceChart(String product, double price, int maxQuantity){ //takes in a string, double, and int
        System.out.println(product); //print product

        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);//format price
        System.out.println("Price: " + currencyFormat.format(price));//print price

        for (int i = 1; i <= maxQuantity; i++) { //loop through maxQuantity
            double updatedPrice = price - (0.5 * (i - 1)); //Subtract 50 cents for each additional item
            String formattedPrice = currencyFormat.format(updatedPrice * i); //format price
            System.out.println(i + " - " + formattedPrice); //print price
        }
    }
    //add customers with ninja bonus
    public void addCustomers(ArrayList<String> customers) { //takes in an arraylist
    Scanner scanner = new Scanner(System.in); //initialize scanner

    System.out.println("Please enter customer names. Type 'q' to finish."); //prompt user

    while (true) { //loop until user types 'q'
        String name = scanner.nextLine(); //get user input

        if (name.equalsIgnoreCase("q")) { //if user types 'q'
            break; //break out of loop
        }

        customers.add(name); //add name to arraylist
        System.out.println("\nHello " + name + "! There are " + customers.size() + " people ahead of you."); //print message
        System.out.println("Please enter the next customer's name or type 'q' to finish.\n"); //prompt user
    }

    System.out.println("\nCustomer entry complete. Total customers: " + customers.size()); //print message
    scanner.close(); //close scanner
    }

}