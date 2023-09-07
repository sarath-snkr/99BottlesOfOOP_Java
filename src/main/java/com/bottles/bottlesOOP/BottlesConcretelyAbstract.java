package com.bottles.bottlesOOP;

public class BottlesConcretelyAbstract {
	    public String song() {
	        return this.verses(99, 0);
	    }

	    public String verses(int bottlesAtStart, int bottlesAtEnd) {
	        StringBuilder result = new StringBuilder();
	        for (int i = bottlesAtStart; i >= bottlesAtEnd; i--) {
	            result.append(this.verse(i));
	            if (i != bottlesAtEnd) {
	                result.append("\n");
	            }
	        }
	        return result.toString();
	    }

	    public String verse(int bottles) {
	        Round round = new Round(bottles);
	        return round.toString();
	    }
	}

	class Round {
	    private int bottles;

	    public Round(int bottles) {
	        this.bottles = bottles;
	    }

	    public String toString() {
	        return this.challenge() + this.response();
	    }

	    private String challenge() {
	        return capitalize(this.bottlesOfBeer()) + " " +
	                this.onWall() + ", " +
	                this.bottlesOfBeer() + ".\n";
	    }

	    private String response() {
	        return this.goToTheStoreOrTakeOneDown() + ", " +
	                this.bottlesOfBeer() + " " +
	                this.onWall() + ".\n";
	    }

	    private String bottlesOfBeer() {
	        return this.anglicizedBottleCount() + " " +
	                this.pluralizedBottleForm() + " of " +
	                this.beer() + " ";
	    }

	    private String beer() {
	        return "beer";
	    }

	    private String onWall() {
	        return "on the wall";
	    }

	    private String pluralizedBottleForm() {
	        return this.isLastBeer() ? "bottle" : "bottles";
	    }

	    private String anglicizedBottleCount() {
	        return this.isAllOut() ? "no more" : Integer.toString(this.bottles);
	    }

	    private String goToTheStoreOrTakeOneDown() {
	        if (this.isAllOut()) {
	            this.bottles = 99;
	            return this.buyNewBeer();
	        } else {
	            String lyrics = this.drinkBeer();
	            this.bottles--;
	            return lyrics;
	        }
	    }

	    private String buyNewBeer() {
	        return "Go to the store and buy some more";
	    }

	    private String drinkBeer() {
	        return "Take " + this.itOrOne() + " down and pass it around";
	    }

	    private String itOrOne() {
	        return this.isLastBeer() ? "it" : "one";
	    }

	    private boolean isAllOut() {
	        return this.bottles == 0;
	    }

	    private boolean isLastBeer() {
	        return this.bottles == 1;
	    }

	    private String capitalize(String string) {
	        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
	    }
	}

