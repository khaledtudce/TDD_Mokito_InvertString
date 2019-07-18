package com.mavenproject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

class InvertStringTest {

	String text = "something";
	InvertString obj;
	
	public InvertStringTest() {
		IStringMaker stringMaker = mock(IStringMaker.class);
		when(stringMaker.makeString(text, 0)).thenReturn("s");
		when(stringMaker.makeString(text, 1)).thenReturn("o");
		when(stringMaker.makeString(text, 2)).thenReturn("m");
		when(stringMaker.makeString(text, 3)).thenReturn("e");
		when(stringMaker.makeString(text, 4)).thenReturn("t");
		when(stringMaker.makeString(text, 5)).thenReturn("h");
		when(stringMaker.makeString(text, 6)).thenReturn("i");
		when(stringMaker.makeString(text, 7)).thenReturn("n");
		when(stringMaker.makeString(text, 8)).thenReturn("g");
		obj = new InvertString();
		obj.setStringMaker(stringMaker);
	}

	@Test
	void ShouldNotReturnSameString() {
		assertNotEquals(obj.ReturnSomething(text), text);
	}
	
	@Test
	void ShouldReturnSameLength() {
		assertEquals(obj.ReturnSomething(text).length(), text.length());
	}
	
	@Test
	void FirstCharacterOfGivenString_ShouldBeLastCharacterOfReturnedCharacter() {
		assertEquals(obj.ReturnSomething("something").charAt(0), "something".charAt(text.length()-1));
	}
	
	@Test
	void SecondCharacterOfGivenString_ShouldBeSecondLastCharacterOfReturnedCharacter() {
		assertEquals(obj.ReturnSomething("something").charAt(1), "something".charAt(text.length()-2));
	}
	
	@Test
	void ShouldExtractACharacterAnd_MakeItString() {
		assertEquals(obj.extractCharacterAndMakeString("something", 0), "s");
	}
	
	@Test
	void ShouldConcatenate_MultipleString() {
		assertEquals(obj.concatenateString("some", "thing"), "something");
	}
	
	@Test
	void ShouldReverse_String() {
		assertEquals(obj.ReturnSomething("something"), "gnihtemos");
	}

}
