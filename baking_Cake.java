package edu.lewis.ood.week1.baking;

public abstract class Cake {
	String description = "Custom Cake";
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
}
