package edu.lewis.ood.week1.baking;

public class TopFrostingWhite extends CakeDecorator {
	
 
	public TopFrostingWhite(Cake cake) {
		this.cake = cake;
	}
 
	public String getDescription() {
		return cake.getDescription() + ", White Frosting";
	}
 
	public double cost() {
		return cake.cost(); // Frosting is free.
	}
}
