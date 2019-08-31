package edu.lewis.ood.week1.baking;

/*
 * Stephen Montague
 * Object Oriented Development
 * Fall 2019 - Term 1
 * Week 1 - Baking Decorator
 *
 * Summary:
 *     Demonstrates a Decorator Pattern using a baking theme.
 *     Slightly mods original Pizza-themed code from course textbook -
 *     Head First Design Patterns, by Freeman, et al., available from -
 *     https://www.wickedlysmart.com/head-first-design-patterns/
 */

public class Bakery {
		public static void main(String args[]) {
			// Prints 2 cakes, as decorated, with each total cost.

			Cake cake1 = new FlavorAngelFood();
			Cake frostedCake1 = new TopFrostingWhite(cake1);
			Cake candlesCake1 = new TopCandles(frostedCake1);
			System.out.println(candlesCake1.getDescription()
					+ " $" + String.format("%.2f", (double)candlesCake1.cost()));

			Cake cake2 = new FlavorDevilsFood();
			Cake frostedCake2 = new TopFrostingChoco(cake2);
			Cake mixedBerryCake2 = new TopMixedBerry(frostedCake2);
			System.out.println(mixedBerryCake2.getDescription()
					+ " $" + String.format("%.2f", (double)mixedBerryCake2.cost()));
	}
}
