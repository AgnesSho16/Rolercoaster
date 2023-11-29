import java.util.Arrays;
import java.util.Scanner;
public class Rollercoaster {
    public static void main (String [] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Would you like to purchase the ticket for a rollercoaster ride? Input 1 if yes or 0 if no.");
    int answer = input.nextInt();
    while (answer != 1 && answer != 0) {
    	System.out.println("Input invalid, please input 1 if you want to purchase the ticket or 0 if not.");
    	answer = input.nextInt();
    }
    switch (answer) {
    case 1:
System.out.println("You have chosen to purchase the ticket. Which rollercoaster ride would you like to buy the ticket of? Input the number of the respective ride you would like to buy the ticket of.");
System.out.println("1. Wavecrasher Harbor: Rp. 20.000 per person");
System.out.println("2. Sandstorm Canyon: Rp. 15.000 per person");
		System.out.println("3. Abyssal Nightmare: Rp. 25.000 per person");
		int ride = input.nextInt();
		switch (ride) {
		default:
			System.out.println("Input invalid, input 1 for Wavecrasher Harbor: Rp. 20.000 per person, 2 for Sandstorm Canyon: Rp. 15.000 per person, or 3 for Abyssal Nightmare: Rp. 25.000 per person.");
	    	ride = input.nextInt();
		case 1:
			 System.out.println("You have chosen to purchase the ticket for Wavecrasher Harbor. How many tickets would you like to purchase?");
		     int ticket = input.nextInt();
		     int cost = 20000 * ticket;
		     System.out.println("You have chosen to purchase " + ticket + " ticket(s) for the total price of " + cost + ". With which method of payment would you like to purchase the ticket(s)? Input 1 for cash or 2 for credit.");
		     int payment = input.nextInt();
		     while (payment != 1 && payment != 2) {
		    	 System.out.println("Input invalid, please input 1 if you want to pay with cash or 2 if credit.");
		     	 payment = input.nextInt();
		     }
		     if (payment == 1) {
		    	 System.out.println("You have chosen to pay with cash. Input your total cash for payment:");
		    	 int cash = input.nextInt();
		    	 if (cash < cost) {
		    		 System.out.println("Amount of cash is insufficient. Transaction canceled.");

		    		 break;
		    	 }
		    	 int cashChange = cash - cost;
		    	 System.out.println("Your change is Rp. " + cashChange + " with denominations as follows:");
		    	 int remainingChange = cashChange;
		         int oneHundredThousand = remainingChange / 100000;
		         remainingChange = remainingChange % 100000;
		         int fiftyThousand = remainingChange / 50000;
		         remainingChange = remainingChange % 50000;
		         int twentyThousand = remainingChange / 20000;
		         remainingChange = remainingChange % 20000;
		         int tenThousand = remainingChange / 10000;
		         remainingChange = remainingChange % 10000;
		         int fiveThousand = remainingChange / 5000;
		         remainingChange = remainingChange % 5000;
		         int twoThousand = remainingChange / 2000;
		         remainingChange = remainingChange % 2000;
		         int oneThousand = remainingChange / 1000;
		         remainingChange = remainingChange % 1000;
		         int fiveHundred = remainingChange / 500;
		         remainingChange = remainingChange % 500;
		         int twoHundred = remainingChange / 200;
		         remainingChange = remainingChange % 200;
		         int oneHundred = remainingChange / 100;
		         remainingChange = remainingChange % 100;
		         System.out.println("Rp 100.000: " + oneHundredThousand);
		         System.out.println("Rp 50.000: " + fiftyThousand);
		         System.out.println("Rp 20.000: " + twentyThousand);
		         System.out.println("Rp 10.000: " + tenThousand);
		         System.out.println("Rp 5.000: " + fiveThousand);
		         System.out.println("Rp 2.000: " + twoThousand);
		         System.out.println("Rp 1.000: " + oneThousand);
		         System.out.println("Rp 500: " + fiveHundred);
		         System.out.println("Rp 200: " + twoHundred);
		         System.out.println("Rp 100: " + oneHundred);
		         System.out.println("You must be 155 cm or taller to ride the Wavecrasher Harbor rollercoaster. Input the heights of you and other ticket buyers if there are any.");
			     int amount = ticket;
			     int arrayOne[] = new int[amount]; 
			     int index = 0;
			     while (index < amount) {
			    	 arrayOne[index] = input.nextInt();
			    	 if (arrayOne[index] < 155) {
			    		 System.out.println("We regret to inform you that the ticket buyer with " + arrayOne[index] + " cm height is not allowed to ride this rollercoaster.");
			    	 }
			    	 else {
			    		 System.out.println("Ticket buyer with " + arrayOne[index] + " cm height is allowed to ride this rollercoaster. We hope you enjoy.");
			    	 }
			    	 index++;
			     }
			     System.out.println("Thank you for purchasing our tickets.");
		     }
			     else {
		    	 System.out.println("You have chosen to pay with credit. Input your total credit for payment:");
		    	 int credit = input.nextInt();
		    	 int creditChange = credit - cost;
		    	 if (credit < cost) {
		    		 System.out.println("Amount of credits insufficient. Transaction canceled.");
		    		 break;
		    	 }
		    	 System.out.println("Your change is " + creditChange + ".");
		    	 System.out.println("You must be 155 cm or taller to ride the Wavecrasher Harbor rollercoaster. Input the heights of you and other ticket buyers if there are any.");
			     int amount = ticket;
			     int arrayTwo[] = new int[amount]; 
			     int index = 0;
			     while (index < amount) {
			    	 arrayTwo[index] = input.nextInt();
			    	 if (arrayTwo[index] < 155) {
			    		 System.out.println("We regret to inform you that the ticket buyer with " + arrayTwo[index] + " cm height is not allowed to ride this rollercoaster.");
			    	 }
			    	 else {
			    		 System.out.println("Ticket buyer with " + arrayTwo[index] + " cm height is allowed to ride this rollercoaster. We hope you enjoy.");
			    	 }
			    	 index++;
			     }
			     System.out.println("Thank you for purchasing our tickets.");
		    }
		    break;
		case 2:
			 System.out.println("You have chosen to purchase the ticket for Sandstorm Canyon. How many tickets would you like to purchase?");
		     ticket = input.nextInt();
		     cost = 15000 * ticket;
		     System.out.println("You have chosen to purchase " + ticket + " ticket(s) for the total price of " + cost + ". With which method of payment would you like to purchase the ticket(s)? Input 1 for cash or 2 for credit.");
		     payment = input.nextInt();
		     while (payment != 1 && payment != 2) {
		    	 System.out.println("Input invalid, please input 1 if you want to pay with cash or 2 if credit.");
		     	 payment = input.nextInt();
		     }
		    if (payment == 1){
		    	 System.out.println("You have chosen to pay with cash. Input your total cash for payment:");
		    	 int cash = input.nextInt();
		    	 if (cash < cost) {
		    		 System.out.println("Amount of cash is insufficient. Transaction canceled.");
		    		 break;
		    	 }
		    	 int cashChange = cash - cost; 
		    	 System.out.println("Your change is Rp. " + cashChange + " with denominations as follows:");
		    	 int remainingChange = cashChange;
		         int oneHundredThousand = remainingChange / 100000;
		         remainingChange = remainingChange % 100000;
		         int fiftyThousand = remainingChange / 50000;
		         remainingChange = remainingChange % 50000;
		         int twentyThousand = remainingChange / 20000;
		         remainingChange = remainingChange % 20000;
		         int tenThousand = remainingChange / 10000;
		         remainingChange = remainingChange % 10000;
		         int fiveThousand = remainingChange / 5000;
		         remainingChange = remainingChange % 5000;
		         int twoThousand = remainingChange / 2000;
		         remainingChange = remainingChange % 2000;
		         int oneThousand = remainingChange / 1000;
		         remainingChange = remainingChange % 1000;
		         int fiveHundred = remainingChange / 500;
		         remainingChange = remainingChange % 500;
		         int twoHundred = remainingChange / 200;
		         remainingChange = remainingChange % 200;
		         int oneHundred = remainingChange / 100;
		         remainingChange = remainingChange % 100;
		         System.out.println("Rp 100.000: " + oneHundredThousand);
		         System.out.println("Rp 50.000: " + fiftyThousand);
		         System.out.println("Rp 20.000: " + twentyThousand);
		         System.out.println("Rp 10.000: " + tenThousand);
		         System.out.println("Rp 5.000: " + fiveThousand);
		         System.out.println("Rp 2.000: " + twoThousand);
		         System.out.println("Rp 1.000: " + oneThousand);
		         System.out.println("Rp 500: " + fiveHundred);
		         System.out.println("Rp 200: " + twoHundred);
		         System.out.println("Rp 100: " + oneHundred);
		         System.out.println("You must be 155 cm or taller to ride the Sandstorm Canyon rollercoaster. Input the heights of you and other ticket buyers if there are any.");
			     int amount = ticket;
			     int arrayThree[] = new int[amount]; 
			     int index = 0;
			     while (index < amount) {
			    	 arrayThree[index] = input.nextInt();
			    	 if (arrayThree[index] < 155) {
			    		 System.out.println("We regret to inform you that the ticket buyer with " + arrayThree[index] + " cm height is not allowed to ride this rollercoaster.");
			    	 }
			    	 else {
			    		 System.out.println("Ticket buyer with " + arrayThree[index] + " cm height is allowed to ride this rollercoaster. We hope you enjoy.");
			    	 }
			    	 index++;
			     }
			     System.out.println("Thank you for purchasing our tickets.");
		    }
		    else {
		    	 System.out.println("You have chosen to pay with credit. Input your total credit for payment:");
		    	 int credit = input.nextInt();
		    	 int creditChange = credit - cost;
		    	 if (credit < cost) {
		    		 System.out.println("Amount of credit is insufficient. Transaction canceled.");
		    		 break;
		    	 }
		    	 System.out.println("Your change is Rp. " + creditChange + ".");
		    	 System.out.println("You must be 155 cm or taller to ride the Sandstorm Canyon rollercoaster. Input the heights of you and other ticket buyers if there are any.");
			     int amount = ticket;
			     int arrayFour[] = new int[amount]; 
			     int index = 0;
			     while (index < amount) {
			    	 arrayFour[index] = input.nextInt();
			    	 if (arrayFour[index] < 155) {
			    		 System.out.println("We regret to inform you that the ticket buyer with " + arrayFour[index] + " cm height is not allowed to ride this rollercoaster.");
			    	 }
			    	 else {
			    		 System.out.println("Ticket buyer with " + arrayFour[index] + " cm height is allowed to ride this rollercoaster. We hope you enjoy.");
			    	 }
			    	 index++;
			     }
			     System.out.println("Thank you for purchasing our tickets.");
		     }
		    break;
		case 3:
			 System.out.println("You have chosen to purchase the ticket for Abyssal Nightmare. How many tickets would you like to purchase?");
		     ticket = input.nextInt();
		     cost = 30000 * ticket;
		     System.out.println("You have chosen to purchase " + ticket + " ticket(s) for the total price of " + cost + ". With which method of payment would you like to purchase the ticket(s)? Input 1 for cash or 2 for credit.");
		     payment = input.nextInt();
		     while (payment != 1 && payment != 2) {
		    	 System.out.println("Input invalid, please input 1 if you want to pay with cash or 2 if credit.");
		     	 payment = input.nextInt();
		     }
		    if (payment == 1){
		    	 System.out.println("You have chosen to pay with cash. Input your total cash for payment:");
		    	 int cash = input.nextInt();
		    	 if (cash < cost) {
		    		 System.out.println("Amount of cash is insufficient. Transaction canceled.");
		    		 break;
		    	 }
		    	 int cashChange = cash - cost;
		    	 System.out.println("Your change is Rp. " + cashChange + " with denominations as follows:");
		    	 int remainingChange = cashChange;
		         int oneHundredThousand = remainingChange / 100000;
		         remainingChange = remainingChange % 100000;
		         int fiftyThousand = remainingChange / 50000;
		         remainingChange = remainingChange % 50000;
		         int twentyThousand = remainingChange / 20000;
		         remainingChange = remainingChange % 20000;
		         int tenThousand = remainingChange / 10000;
		         remainingChange = remainingChange % 10000;
		         int fiveThousand = remainingChange / 5000;
		         remainingChange = remainingChange % 5000;
		         int twoThousand = remainingChange / 2000;
		         remainingChange = remainingChange % 2000;
		         int oneThousand = remainingChange / 1000;
		         remainingChange = remainingChange % 1000;
		         int fiveHundred = remainingChange / 500;
		         remainingChange = remainingChange % 500;
		         int twoHundred = remainingChange / 200;
		         remainingChange = remainingChange % 200;
		         int oneHundred = remainingChange / 100;
		         remainingChange = remainingChange % 100;
		         System.out.println("Rp 100.000: " + oneHundredThousand);
		         System.out.println("Rp 50.000: " + fiftyThousand);
		         System.out.println("Rp 20.000: " + twentyThousand);
		         System.out.println("Rp 10.000: " + tenThousand);
		         System.out.println("Rp 5.000: " + fiveThousand);
		         System.out.println("Rp 2.000: " + twoThousand);
		         System.out.println("Rp 1.000: " + oneThousand);
		         System.out.println("Rp 500: " + fiveHundred);
		         System.out.println("Rp 200: " + twoHundred);
		         System.out.println("Rp 100: " + oneHundred);
		         System.out.println("You must be 155 cm or taller to ride the rollercoaster. Input the heights of you and other ticket buyers if there are any.");
		         int amount = ticket;
		         int arrayFive[] = new int[amount]; 
			     int index = 0;
			     while (index < amount) {
			    	 arrayFive[index] = input.nextInt();
			    	 if (arrayFive[index] < 155) {
			    		 System.out.println("We regret to inform you that the ticket buyer with " + arrayFive[index] + " cm height is not allowed to ride this rollercoaster.");
			    	 }
			    	 else {
			    		 System.out.println("Ticket buyer with " + arrayFive[index] + " cm height is allowed to ride this rollecoaster. We hope you enjoy.");
			    	 }
			    	 index++;
			     }
			     System.out.println("Thank you for purchasing our tickets.");
		    }
		    else {
		    	 System.out.println("You have chosen to pay with credit. Input your total credit for payment:");
		    	 int credit = input.nextInt();
		    	 int creditChange = credit - cost;
		    	 if (credit < cost) {
		    		 System.out.println("Amount of credit is insufficient. Transaction canceled.");
		    		 break;
		    	 }
		    	 System.out.println("Your change is Rp. " + creditChange + ".");
		    	 System.out.println("You must be 155 cm or taller to ride the rollercoaster. Input the heights of you and other ticket buyers if there are any.");
		    	 int amount = ticket;
		    	 int arraySix[] = new int[amount]; 
		    	 int index = 0;
		    	 while (index < amount) {
		    		 arraySix[index] = input.nextInt();
		    		 if (arraySix[index] < 155) {
		    			 System.out.println("We regret to inform you that the ticket buyer with " + arraySix[index] + " cm height is not allowed to ride this rollercoaster.");
		    		 }
		    	 else {
		    		 System.out.println("Ticket buyer with " + arraySix[index] + " cm height is allowed to ride this rollercoaster. We hope you enjoy.");
		    	 }
		    	 index++;
		     }
		         System.out.println("Thank you for purchasing our tickets.");
		}
	}
		break;
    case 0:
		System.out.println("Thank you for your time.");
		System.out.println("We hope you enjoyed our rollercoaster ride. We hope you have a great day ahead. Goodbye!");
	}
   }
}  

