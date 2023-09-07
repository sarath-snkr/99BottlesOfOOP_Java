package com.bottles.bottlesOOP_BottleNumber;
// based on 1.1.4, Shameless Green
// new requirement: say "1 six-pack" in place of "6 bottles"


public class Bottles_SixPack_BottleNumber {
    public String song() {
        return this.verses(99, 0);
    }

    public String verses(int upper, int lower) {
        StringBuilder result = new StringBuilder();
        for (int i = upper; i >= lower; i--) {
            result.append(this.verse(i));
            if (i != lower) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public String verse(int number) {
    	BottleNumber bottleNumber = new BottleNumber(number);
    	BottleNumber nextBottleNumber = new BottleNumber(bottleNumber.successor());
    	
                return capitalize(bottleNumber.quantity()) + " " + bottleNumber.container() + " of beer on the wall, " +
                		bottleNumber.quantity() + " " + bottleNumber.container() + " of beer.\n" +
                		bottleNumber.action() +
                		nextBottleNumber.quantity() + " " + nextBottleNumber.container() + " of beer on the wall.\n";
    }
    
    public String capitalize(String phrase) {
    	return phrase.substring(0,1).toUpperCase() + phrase.substring(1);
    }
}
/*
 * This chapter continued the quest to make Bottles open to the six-pack requirement. It
 *	recognized that many methods in Bottles obsessed on number, and undertook the Extract Class
 *	refactoring to cure this obsession. The refactoring created a new class named BottleNumber.
 */
