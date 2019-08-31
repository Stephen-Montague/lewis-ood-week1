package edu.lewis.ood.week1.baking;

public class TopMixedBerry extends CakeDecorator {

	public TopMixedBerry(Cake cake) {
		this.cake = cake;
	}
 
	public String getDescription() {
		return cake.getDescription() + ", Mixed Berries";
	}
 
	public double cost() {
		return cake.cost() + 2.00;
	}
}
