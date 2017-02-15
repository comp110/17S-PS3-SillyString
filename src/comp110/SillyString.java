package comp110;

/*
 * Author: <YOUR NAME>
 *
 * ONYEN: <YOUR ONYEN>
 *
 * UNC Honor Pledge: I certify that no unauthorized aids or assistance has been 
 * received or used in the completion of this work. I collaborated with
 * no one other than official COMP110 UTAs on this code.
 * 
 * WARNING: ANY use of Java's built-in methods within this file outside 
 * of the provided stencil code will result in a score of 0 for this assignment 
 * during final grade checks at the end of the semester.
 */
public class SillyString {

	///////////////////////////
	// Begin stencil code
	// You should understand this but should not modify any of it.

	// Fields
	private char[] _chars;

	// Constructors

	// SillyString has two constructors. You can construct a SillyString
	// from a native String or from an array of chars.

	public SillyString(String s) {
		// We are initializing the _chars field to be the array of characters
		// given to us by the String s.
		_chars = s.toCharArray();
	}

	public SillyString(char[] chars) {
		_chars = chars;
	}

	// Methods

	// toString is a special method in Java we will discuss soon.
	public String toString() {
		return new String(_chars);
	}

	// You can ask any SillyString for its chars
	public char[] getChars() {
		return _chars;
	}

	// End stencil code
	////////////////////////////

	// TODO: The methods you will implement are below.

	// Part 1

	// Section 1.

	public int size() {
		return -1;
	}

	public char charAt(int i) {
		return '?';
	}

	public int count(char c) {
		return -1;
	}

	public int countVowels() {
		return -1;
	}

	public int indexOf(char c, int start) {
		return -1;
	}

	public int lastIndexOf(char c, int start) {
		return -1;
	}

	public boolean contains(char c) {
		return false;
	}

	public boolean every(char c) {
		return false;
	}

	public boolean endsWith(char[] c) {
		return false;
	}

	public boolean isPalindrome() {
		return false;
	}

	// Part 2

	public boolean equals(SillyString other) {
		return false;
	}

	public SillyString clone() {
		return null;
	}

	public SillyString reverse() {
		return null;
	}

	public SillyString concatenate(SillyString other) {
		return null;
	}

	public SillyString repeat(int n) {
		return null;
	}

	public SillyString toUpperCase() {
		return null;
	}

	public SillyString substring(int start, int end) {
		return null;
	}

	public SillyString[] split(char delimiter) {
		return null;
	}

	public SillyString join(SillyString glue, SillyString[] pieces) {
		return null;
	}

	public SillyString splice(int offset, int length, SillyString other) {
		return null;
	}

	public SillyString replace(SillyString search, SillyString replace) {
		return null;
	}

	public SillyString replaceAll(SillyString search, SillyString replace) {
		return null;
	}

}