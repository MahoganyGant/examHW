package exam_homework;
import java.util.Scanner;

public class examHW {//create methods below here
public static void printFullName(String firstName,String lastName){
    System.out.println(firstName + " " + lastName);
}

public static int getPrice(int min, int max){
    int randomPrice = min +(int)(Math.random()*(max-min)+1);
return randomPrice;
}

public static void printSizes(char[] sizes){
    System.out.println("This item comes in the folowing sizes:");
    for(int i = 0; i < sizes.length; i++){
        System.out.print(sizes[i]);
        if(i < sizes.length - 1){
            System.out.print(",");
        }
    }
}

public static void printOrder(){
    Scanner scanner = new Scanner(System.in);
double tipAmount = 0;
String dineOption;
    System.out.println("\nWelcome to Weenie Hut Jr. Burger Joint. \n Is it true or false that your order will be to go? ");
    //add scanner to read response, store response
    String dineInOrOut = scanner.nextLine();
    if(dineInOrOut.equals ("true")){
        dineOption = "Dine In";
    }else{
        dineOption = "Order to go";
    }
    System.out.println("What type of burger do you want today? Cheese,ham, or turkey? ");
    //add scanner to read response, store response
    String burgerType = scanner.nextLine();
    System.out.println("Please choose a tip percentage:\n 0%,5%,10%, 15% or 20%");
    //add scanner to read response, store response
    String tipPercent = scanner.nextLine();
    if(tipPercent.equals ("0%")){
  tipAmount = 0.0;
    }else if(tipPercent.equals ("5%")){
        tipAmount = 0.05;
    }else if(tipPercent.equals("10%")){
        tipAmount = 0.1;
    }else if(tipPercent.equals("15%")){
        tipAmount = 0.15;
    }else if(tipPercent.equals("20%")){
        tipAmount = 0.2;
    }
    System.out.println("What is the name for your order?");
    //add scanner to read response, store response
    String orderName = scanner.nextLine();

    double price = getPrice(5,15);
    double orderTotal = price + (price * tipAmount);

    //print out the results of their order plus the price
    System.out.println("Okay you got a " + dineOption +" "+burgerType + "burger\n For " + orderName);
    System.out.println("Your total is: $" + orderTotal);
}
    public static void main(String[] args) { //beginning of main method

        String firstName = "Mahogany";
        String lastName = "Gant";
        char[] sizes = {'S','M','L'};
final double EXPIRATIONDATE = 10.13;
        printFullName(firstName,lastName);
        System.out.println(getPrice(5,15));
        printSizes(sizes);
        printOrder();
    }
}
