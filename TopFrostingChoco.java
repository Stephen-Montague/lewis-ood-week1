package edu.lewis.ood.week1.baking;

public class TopFrostingChoco extends CakeDecorator {

    public TopFrostingChoco(Cake cake) {
        this.cake = cake;
    }

    public String getDescription() {
        return cake.getDescription() + ", Chocolate Frosting";
    }

    public double cost() {
        return cake.cost(); // Frosting is free.
    }
}
