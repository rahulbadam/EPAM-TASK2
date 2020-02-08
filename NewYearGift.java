package com.rahul.NewYearGift;
import java.util.Scanner;
public class NewYearGift {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GiftDetails gDetails = new GiftDetails();
		gDetails.details();
		Chocolate []chocolates = new Chocolate[3];
		Sweet []sweets = new Sweet[2]; 
		System.out.println("There are total 5 types of gifts 3 types of chocolates and 2 types of sweets");
		System.out.println("Enter 5 positive integers the no.of units of each gift: ");
		int[] unitsOfEachGift = new int[5];
		int giftCount=0;
		for(int i=0; i<5; i++) {
			unitsOfEachGift[i] = sc.nextInt();
		}
		for(int i=0; i<5; i++) {
			if(i<3) {
				chocolates[i] = new Chocolate();
				chocolates[i].details(unitsOfEachGift[i],i+1);
			}else {
				sweets[i-3] = new Sweet();
				sweets[i-3].detais(unitsOfEachGift[i],i+1);
			}
			giftCount += unitsOfEachGift[i];
		}
		System.out.println("\nTotal cost of " + giftCount + " gifts is " + gDetails.getTotalPrice() + " rupees and weight is " + gDetails.getTotalWeight() + " grams");
		sc.close();
	}
}
