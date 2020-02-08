package com.rahul.NewYearGift;

public class GiftDetails {
	int weight;
	int price;
	static int totalPrice=0;
	static int totalWeight=0;
	void details() {
		System.out.println("1.Snickers");
		System.out.println("2.Dairy Milk");
		System.out.println("3.Kit Kat");
		System.out.println("4.Mysore pak");
		System.out.println("5.Kaju katli");
	}
	void setPrice(int price) {
		this.price=price;
		totalPrice += price; 
	}
	void setWeight(int weight) {
		this.weight=weight;
		totalWeight += weight;
	}
	int getTotalPrice() {
		return totalPrice;
	}
	int getTotalWeight() {
		return totalWeight;
	}
}
