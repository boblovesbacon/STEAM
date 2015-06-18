import java.util.Scanner;
public class Restaurant{

    final static String COLOR_ITEM = "\u001B[100m";
    final static String COLOR_PRICE = "\u001B[40m";
    final static String COLOR_ALLOWANCE = "\u001B[40m";
    final static String COLOR_FAILURE = "\u001B[41m";
    final static String COLOR_RESET = "\u001B[0m";
    final static String COLOR_GREEN = "\u001B[42m";    
    public static void printMenu(){
        int i = 1;
        String amt;
        for(Menu item: Menu.values()){
            amt = String.format("%.2f",item.price());
            System.out.print(COLOR_ITEM + i + ") " + item + ":\t " + amt + COLOR_RESET + "\n");
            ++i;
        }

        System.out.print(COLOR_ITEM + i + ") EXIT" + COLOR_RESET + "\n");
    }

    public static void printAllowance(double allowance){
        String amt = String.format("%.2f", allowance);
        System.out.print(COLOR_ALLOWANCE + "You have $" + amt + " remaining." + COLOR_RESET + "\n");
    }

    public static void printFailure(String item){
        System.out.print(COLOR_FAILURE + "You do not have enough money" + COLOR_RESET +"\n" + COLOR_FAILURE + "remaining to purchase " + item + COLOR_RESET + "\n");
    }

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int input = 0;
        double allowance = 10.00;
        double pizzaPrice = 2.50;
        double iceCreamPrice = 2.00;
        double sodaPrice = 1.50;

            while(allowance >= 1.5){ // FIX WHILE CONDITION
                printAllowance(allowance);
                printMenu();
                input = scan.nextInt();
                if(input==1){
                    if(allowance < pizzaPrice){
                        printFailure("PIZZA");
                    }
                    else{
                    
                    allowance -= pizzaPrice;
                    }
                }
                else if(input==2){
                    if(allowance < iceCreamPrice){
                        printFailure("ICE CREAM");
                    }
                    else{
                        allowance -= iceCreamPrice;
                    }
                 }
                else if(input==3){
                    if(allowance < sodaPrice){
                        printFailure("SODA");
                    }
                    else{
                         allowance -= sodaPrice;
                    }
                 }
                else if(input==10){
                    System.out.println(COLOR_GREEN + "Hey mom! May I please have more allowance?"+ COLOR_RESET);
                    allowance = 10;
                }
                else if(input==20){
                    System.out.println(COLOR_GREEN + "Hey mom! May I please have more allowance?"+ COLOR_RESET);
                	allowance = 20;
                }
                else if(input==30){
                    System.out.println(COLOR_GREEN + "Hey mom! May I please have more allowance?"+ COLOR_RESET);
                	allowance = 30;
                }
                else if(input==99999){
                    System.out.println(COLOR_GREEN + "Hey bank manager! May I please have more allowance?"+ COLOR_RESET);
                    allowance = 10000;
                }
                else{
                    
                    System.out.println(COLOR_FAILURE + "You left the restaurant. Have a good day!"+ COLOR_RESET);
                    break;
                }
     
            



            /**
             *
             * ENTER YOUR CODE HERE
             *
             * HINTS:
             * printFailure("Soda"); -- prints "You do not have enough money remaining to purchase Soda"
             * printFailure("Ice Cream"); -- prints "You do not have enough money remaining to purchase Ice Cream"
             * printFailure("Pizza"); -- prints "You do not have enough money remaining to purchase Pizza"
             *
             */
        }

    }
}
