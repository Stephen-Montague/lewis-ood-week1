package edu.lewis.ood.week1.baking;

public abstract class CakeDecorator extends Cake {
	Cake cake;
	public abstract String getDescription();
}
