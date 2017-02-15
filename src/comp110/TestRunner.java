package comp110;

/*
 * Author: <YOUR NAME>
 *
 * ONYEN: <YOUR ONYEN>
 *
 * UNC Honor Pledge: I certify that no unauthorized aids or assistance has been 
 * received or used in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 */
public class TestRunner {

	public static void main(String[] args) {

		Console console = new Console();

		// Setup a few SillyStrings to test with
		SillyString empty = new SillyString("");
		SillyString letters = new SillyString("abcdef");
		SillyString phrase = new SillyString("the quick brown fox jumped");

		// Test our work by calling methods and comparing expected with actual

		// size Tests
		console.print("1.1 size - expect: 0 - actual: " + empty.size());
		console.print("1.1 size - expect: 6 - actual: " + letters.size());
		console.print("1.1 size - expect: 26 - actual: " + phrase.size());

		// charAt tests
		console.print("1.2 charAt - expect: a - actual: " + letters.charAt(0));
		console.print("1.2 charAt - expect: c - actual: " + letters.charAt(2));
		console.print("1.2 charAt - expect: f - actual: " + letters.charAt(5));

		// countVowels tests - uncomment the lines below once you get to count
		// console.print("1.3 countVowels - expect: 0 - actual: " + empty.countVowels());
		// console.print("1.3 countVowels - expect: 2 - actual: " + letters.countVowels());
		// console.print("1.3 countVowels - expect: 7 - actual: " + phrase.countVowels());

		// TODO: Write your own tests (like above) for the other methods below.

		// WARNING: In order to receive help from UTAs on this assignment you
		// must be able to demonstrate you are testing the method you are stuck
		// on in this file.
	}

}