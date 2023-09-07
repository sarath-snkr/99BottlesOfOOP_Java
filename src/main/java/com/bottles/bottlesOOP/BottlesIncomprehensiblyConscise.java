package com.bottles.bottlesOOP;

import java.util.ArrayList;
import java.util.List;

public class BottlesIncomprehensiblyConscise {
    public String song() {
        return this.verses(99, 0);
    }

    public String verses(int hi, int lo) {
        List<Integer> numbers = downTo(hi, lo);
        List<String> verses = new ArrayList<>();
        for (int n : numbers) {
            verses.add(verse(n));
        }
        return String.join("\n", verses);
    }

    public String verse(int n) {
        return String.format(
                "%s bottle%s of beer on the wall, %s bottle%s of beer.\n%s, %s bottle%s of beer on the wall.\n",
                n == 0 ? "No more" : n,
                n == 1 ? "" : "s",
                n == 0 ? "no more" : n,
                n == 1 ? "" : "s",
                n > 0 ? "Take " + (n > 1 ? "one" : "it") + " down and pass it around" : "Go to the store and buy some more",
                n - 1 < 0 ? 99 : n - 1 == 0 ? "no more" : n - 1,
                n - 1 == 1 ? "" : "s"
        );
    }

    public List<Integer> downTo(int max, int min) {
        List<Integer> numbers = new ArrayList<>();
        for (int n = max; n >= min; n--) {
            numbers.add(n);
        }
        return numbers;
    }
}
