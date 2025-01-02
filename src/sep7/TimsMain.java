package sep7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TimsMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<TimsItems> cart = new ArrayList<>();
        double totalPrice =0;

        TimsMerchendise mug = new TimsMerchendise("Mug",10,"Red Mug");
        TimsMerchendise coffeePowder = new TimsMerchendise("CoffeePowder",12,"Arabic coffee");
        TimsMerchendise giftCard = new TimsMerchendise("Gift card",50,"Can redeem at any Tim outlet");

        TimsConsumable coffee = new TimsConsumable("Coffee",5,100);
        TimsConsumable donut = new TimsConsumable("Donut",5,500);
        TimsConsumable sandwich = new TimsConsumable("Sandwich",5,400);

        boolean order = true;
       
        while (order) {

            System.out.println("Welcome to Tim's! Please select from our menu: ");
            System.out.println("**********************************");
            System.out.println("1.Tims Merchendise");
            System.out.println("2.Tims Consumable");
            System.out.println("3.Done Ordering");

            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    System.out.println("1.Mugs");
                    System.out.println("2.Coffee Powder");
                    System.out.println("3.Gift cards");
                    System.out.println("Please select the item: ");
                    int merchInput = scanner.nextInt();
                    switch (merchInput) {
                        case 1:

                            System.out.println(mug);
                            cart.add(mug);
                            totalPrice += mug.getPrice();
                            break;

                        case 2:

                            System.out.println(coffeePowder);
                            cart.add(coffeePowder);
                            totalPrice += coffeePowder.getPrice();
                            break;

                        case 3:

                            System.out.println(giftCard);
                            cart.add(giftCard);
                            totalPrice += giftCard.getPrice();
                            break;

                        default:
                            System.out.println("Invalid Selection.");
                            break;


                    }
                    break;


                case 2:
                    System.out.println("1.Coffee");
                    System.out.println("2.Donut");
                    System.out.println("3.Sandwich");
                    System.out.println("Please select the item");
                    int consumInput = scanner.nextInt();
                    switch (consumInput) {
                        case 1:

                            System.out.println(coffee);
                            cart.add(coffee);
                            totalPrice += coffee.getPrice();
                            break;

                        case 2:

                            System.out.println(donut);
                            cart.add(donut);
                            totalPrice += donut.getPrice();
                            break;

                        case 3:

                            System.out.println(sandwich);
                            cart.add(sandwich);
                            totalPrice += sandwich.getPrice();
                            break;

                        default:
                            System.out.println("Invalid Selection.");
                            break;

                    }
                    break;

                case 3:
                    order = false;
                    break;

                default:
                    System.out.println("Invalid Selection.");
                    break;


            }
            if(order){
                System.out.println("\nDo you want to continue shopping?(Yes/No)");
                String continueShopping = scanner.next();
                if(continueShopping.equalsIgnoreCase("no")){
                    order = false;
                }
            }
        }

        System.out.println("\nYour Order: ");
        System.out.println("*************");
        for(TimsItems items: cart){
            System.out.println(items);
        }
        System.out.println("\nTotal Price: "+totalPrice);
        System.out.println("\nProceed to payment?(Yes/no): ");
        String proceedPayment = scanner.next();

        if(proceedPayment.equalsIgnoreCase("yes")){
            System.out.println("Enter card number: ");
            String cardNo = scanner.next();
            System.out.println("Enter ccv number: ");
            String ccvNo = scanner.next();

            if(cardNo.length()==16 && ccvNo.length()==3){
                System.out.println("Payment Successful! Thank you for your Order");
            }else {
                System.out.println("Invalid Card details");
            }
        }else {
            System.out.println("Order Cancelled.");
        }
        scanner.close();

    }
}
