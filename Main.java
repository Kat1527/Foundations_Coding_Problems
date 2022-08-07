package KarthikaProject1;

import java.util.*;

public class Main {
	public static void main(String[] args)
	{
	System.out.println(" *********************************************");
    System.out.println("     WELCOME TO THE VENDING MACHINE           ");
    System.out.println(" *********************************************");
    System.out.println("            Products available:               ");
    System.out.println("                                              ");
	System.out.println("    1.Maaza - Rs 45");
	System.out.println("    2.Pepsi - Rs 40");
    System.out.println("	3.Lays - Rs 30");
	System.out.println("	4.Bovonto - Rs 70");
    System.out.println("	5.Doritos - Rs 30");
    System.out.println("	6.Kurkure - Rs 20");
    VendingMachine karthika;
	karthika.addToCart("Maaza");
	karthika.addToCart("Lays");
	karthika.addToCart("Doritos");
	karthika.billing();
	System.out.println("Cash to be paid"+cashPaid);

}
