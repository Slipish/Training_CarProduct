package ru.slipish.carproduct;

public class Car {
	
	String name;
	int yearOFProduction;
	int price;
	int weigth;
	String color;
	
	public Car(String name, int yearOFProduction, int price, int weigth, String color) {
		this.name = name;
		this.yearOFProduction = yearOFProduction;
		this.price = price;
		this.weigth = weigth;
		this.color = color;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", yearOFProduction=" + yearOFProduction + ", price=" + price + ", weigth="
				+ weigth + ", color=" + color + "]";
	}

}
