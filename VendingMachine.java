package KarthikaProject1;

import java.util.*;

public class VendingMachine{
	public Product myProducts[] = new Product[5];
	public int noOfProducts;
	private int cashPaid;
	 

public VendingMachine() {
        this.cashPaid = 0;
        this.noOfProducts=0;
    }

public void addToCart(String productName){
	if(noOfProducts==5)
		System.out.println("Cannot add to cart....No of products is already 5");

	else
	{
		System.out.println("Successfully added");
		noOfProducts++;
	}
}
public void billing() {
	for(int i=0; i<noOfProducts; i++)
	cashPaid = cashPaid + myProducts[i].itemPrice;
	}

}



 	
 	


