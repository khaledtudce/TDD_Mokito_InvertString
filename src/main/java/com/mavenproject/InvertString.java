package com.mavenproject;

public class InvertString {

	IStringMaker stringMaker;
	
	public String ReturnSomething(String text) {
		
		String reversedText = "";
		for(int i=text.length()-1; i>=0; i--) {
			reversedText = concatenateString(reversedText, extractCharacterAndMakeString(text, i));
		}
		
		return reversedText;
	}

	String concatenateString(String text1, String text2) {
		return text1.concat(text2);
	}

	String extractCharacterAndMakeString(String text, int i) {
		return stringMaker.makeString(text, i);
	}

	public void setStringMaker(IStringMaker stringMaker) {
		this.stringMaker = stringMaker;
	}

}
