package com.bottles.bottlesOOP_TDD;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class BottlesTest_TDD {
	@Test
    public void testVerse99() {
        String expected = "99 bottles of beer on the wall, " +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n";
        assertEquals(expected, new Bottles_TDD().verse(99));
    }
	
	@Test
	public void testAnotherVerse() {
		String expected = "3 bottles of beer on the wall, " +
                "3 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "2 bottles of beer on the wall.\n";
		assertEquals(expected, new Bottles_TDD().verse(3));
	}
	
	@Test
	public void testVerse2() {
		String expected = "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n";
		assertEquals(expected, new Bottles_TDD().verse(2));
	}
	@Test
	public void testVerse1() {
		String expected = "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n";
		assertEquals(expected, new Bottles_TDD().verse(1));
	}
	@Test
	public void testVerse0() {
		String expected = "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";
		assertEquals(expected, new Bottles_TDD().verse(0));
	}
    @Test
    public void testVerses99to98() {
        String expected = "99 bottles of beer on the wall, " +
                "99 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "98 bottles of beer on the wall.\n" +
                "\n" +
                "98 bottles of beer on the wall, " +
                "98 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "97 bottles of beer on the wall.\n";
        assertEquals(expected, new Bottles_TDD().verses(99, 98));
    }
    @Test
    public void testVerses2to0() {
        String expected = "2 bottles of beer on the wall, " +
                "2 bottles of beer.\n" +
                "Take one down and pass it around, " +
                "1 bottle of beer on the wall.\n" +
                "\n" +
                "1 bottle of beer on the wall, " +
                "1 bottle of beer.\n" +
                "Take it down and pass it around, " +
                "no more bottles of beer on the wall.\n" +
                "\n" +
                "No more bottles of beer on the wall, " +
                "no more bottles of beer.\n" +
                "Go to the store and buy some more, " +
                "99 bottles of beer on the wall.\n";
        assertEquals(expected, new Bottles_TDD().verses(2, 0));
    }
    
}
