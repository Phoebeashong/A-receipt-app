package com;

import java.util.Scanner;

public class phoebeunisexboutique {
        public static void main(String[] args) {
            double priceOneShirt, priceOneDress, priceAPairOfPants;
            String customerName, homePhone;
            int numberOfShirts, numberOfPants, numberOfDresses;
            int totalNumberOfItems;
            double subTotalShirts, subTotalPants, subTotalDresses;
            double totalOrders;
            short month, orderDay, year;

            final double discountRate = 0.15;

            Scanner sc = new Scanner(System.in);

            //Input customer details
            System.out.println("Welcome to Phoebe's Retails Services");
            System.out.print("Please enter customer's name: ");

            customerName = sc.nextLine();
            System.out.print("Please enter customer's home phone number: ");
            homePhone = sc.next();

            //Input price details
            System.out.print("\nEnter the price of one shirt: ");
            priceOneShirt = sc.nextDouble();
            System.out.print("Enter the price for a pair of pants: ");
            priceAPairOfPants = sc.nextDouble();
            System.out.print("Enter the price of one dress; ");
            priceOneDress = sc.nextDouble();

            //Input number of items bought
            System.out.print("\nEnter the number of shirts bought: ");
            numberOfShirts = sc.nextInt();
            System.out.print("Enter the number of pants bought: ");
            numberOfPants = sc.nextInt();
            System.out.print("Enter the number of dresses bought: ");
            numberOfDresses = sc.nextInt();

            //Input calendar details
            System.out.println("\nEnter details of transaction date below");
            System.out.println("***********************************************");
            System.out.print("Enter month number: ");
            month = sc.nextShort();
            System.out.print("Enter Day-number: ");
            orderDay = sc.nextShort();
            System.out.print("Enter year: ");
            year = sc.nextShort();

            //perform calculations
            totalNumberOfItems = numberOfShirts + numberOfPants + numberOfDresses;
            subTotalShirts = numberOfShirts * priceOneShirt;
            subTotalPants = numberOfPants * priceAPairOfPants;
            subTotalDresses = numberOfDresses * priceOneDress;

            totalOrders = subTotalShirts + subTotalPants + subTotalDresses;

            //Display invoice
            System.out.println("\n-/-\tPhoebe's Retail Services");
            System.out.println("==================================");
            System.out.println("Customer:" + customerName);
            System.out.println("Contact number:" + homePhone);
            System.out.println("Order Date:" + orderDay);
            System.out.println("-------------------------------------");
            System.out.println("Items\tQty\tUnits/Price\tSub-Total");

            System.out.println("Shirts\t" + numberOfShirts + "\t$" + priceOneShirt + "\t\t$" + subTotalShirts);
            System.out.println("Dresses\t" + numberOfDresses + "\t$" + priceOneDress + "\t\t$" + subTotalDresses);
            System.out.println("Pants\t" + numberOfPants + "\t$" + priceAPairOfPants + "\t\t$" + subTotalPants);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Number of Items: " + totalNumberOfItems);
            System.out.println("Total Order: $" + totalOrders);
            System.out.println("Total Discount: $" + totalOrders * discountRate);
            System.out.println("===========================================");
            System.out.println();
            System.out.println("Created by Phoebe Ashong, 01231906D");
        }
        }
