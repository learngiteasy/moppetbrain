package com.rajnish;

import org.springframework.stereotype.Component;

@Component
public class Card {

	private int cardNo;
	private String cardName;
	public Card() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("Constructing Card object::");
	}
	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", cardName=" + cardName + "]";
	}
	public String getCardName() {
		return cardName;
	}
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
}
