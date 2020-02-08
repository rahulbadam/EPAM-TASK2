package com.rahull.NewYearGift;

public class Chocolate extends GiftDetails{
	void details(int quantity,int item) {
		if(item == 1) {
			this.setPrice(quantity*30);
			this.setWeight(quantity*48);
		}else if(item == 2) {
			this.setPrice(quantity*20);
			this.setWeight(quantity*30);
		}else if(item == 3) {
			this.setPrice(quantity*10);
			this.setWeight(quantity*40);
		}
	}
}
