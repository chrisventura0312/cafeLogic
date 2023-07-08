import java.util.ArrayList;

public class TestCafe {
    public static void main(String[] args) {
        CafeUtil appTest = new CafeUtil();
        /* ============ App Test Cases ============= */
    
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n", appTest.getStreakGoal());

        System.out.println("\n----- Streak Goal numWeek Test -----");
        System.out.printf("Purchases needed by week 15: %s \n\n", appTest.getStreakGoal(15));
    
        System.out.println("----- Order Total Test-----");
        double[] lineItems = {3.5, 1.5, 4.0, 4.5};
        System.out.printf("Order total: %s \n",appTest.getOrderTotal(lineItems));
    
        System.out.println("\n----- Display Menu w/ Prices Test-----");
        ArrayList<String> menu = new ArrayList<String>(); //create arraylist
        menu.add("drip coffee"); //add elements
        menu.add("cappucino");
        menu.add("latte");
        menu.add("mocha");
        ArrayList<Double> prices = new ArrayList<Double>(); //create arraylist
        prices.add(1.5); //add elements
        prices.add(3.5);
        prices.add(4.5);
        prices.add(3.5);
        appTest.displayMenu(menu, prices); //call method

        System.out.println("\n----- Print Price Chart Test-----");
        appTest.printPriceChart("Chai Latte Mix", 4.5, 3); //call method

        System.out.println("\n----- Add Customer Test-----"); //call method
        ArrayList<String> customers = new ArrayList<String>(); //create arraylist
        appTest.addCustomers(customers); //call method
        }
    }
