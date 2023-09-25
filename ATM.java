/**Normal Task
 3. ATM Interface
The objective of this project is to design and develop an interactive ATM interface that mimics
the functionality and user experience of a real ATM. The interface should allow users to
perform common banking tasks and transactions in a secure and user-friendly manner
 */






package project1;


	import java.util.Scanner;
	public class ATM {


	    public static void main(String args[]) {

	        int balance = 100000, withdraw, deposit;

	        try (Scanner sc = new Scanner(System.in)) {
	            while (true) {
	                System.out.println("Automated Teller Machine");
	                System.out.println("Choose 1 for Withdraw");
	                System.out.println("Choose 2 for Deposit");
	                System.out.println("Choose 3 for Check Balance");
	                System.out.println("Choose 4 for EXIT");
	                System.out.print("Choose the operation you want to perform:");

	                int choice = sc.nextInt();
	                switch (choice) {
	                    case 1:
	                        System.out.print("Enter money to be withdrawn:");

	                        withdraw = sc.nextInt();

	                        if (balance >= withdraw) {

	                            balance = balance - withdraw;
	                            System.out.println("Please collect your money  :)");
	                        } else {

	                            System.out.println("Insufficient Balance :(");
	                        }
	                        System.out.println("");
	                        break;

	                    case 2:

	                        System.out.print("Enter money to be deposited:");

	                        deposit = sc.nextInt();

	                        balance = balance + deposit;
	                        System.out.println("Your Money has been successfully deposited!!");
	                        System.out.println("");
	                        break;

	                    case 3:

	                        System.out.println("Balance : " + balance);
	                        System.out.println("");
	                        break;

	                    case 4:

	                        System.out.println("Thank you for visting Have a great day!!");
	                        System.exit(0);
	                }
	            }
	        }
	    }
	}
	