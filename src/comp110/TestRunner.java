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
		SillyString abcdef = new SillyString("abcdef");
		SillyString phrase = new SillyString("the quick brown fox jumped");

		// Test our work by calling methods and comparing expected with actual

		// size Tests
		console.print("1.1 size - expected: 0 - actual: " + empty.size());
		console.print("1.2 size - expected: 6 - actual: " + abcdef.size());
		console.print("1.3 size - expected: 26 - actual: " + phrase.size());

		// charAt tests
		console.print("2.1 charAt - expected: a - actual: " + abcdef.charAt(0));
		console.print("2.2 charAt - expected: c - actual: " + abcdef.charAt(2));
		console.print("2.3 charAt - expected: f - actual: " + abcdef.charAt(5));

		// count tests - uncomment the lines below once you get to count
		// console.print("3.1 count - expected: 0 - actual: " + phrase.count('z'));
		// console.print("3.2 count - expected: 1 - actual: " + phrase.count('q'));
		// console.print("3.3 count - expected: 2 - actual: " + phrase.count('e'));

		// TODO: Write your own tests (like above) for the other methods below.

		// WARNING: In order to receive help from UTAs on this assignment you
		// must be able to demonstrate you are testing the method you are stuck
		// on in this file.
	}

}