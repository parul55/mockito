package com.zensar.mockito;

import static org.junit.Assert.assertEquals;

import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

public class CalculatorTest {
	@Mock
	private Calculator calculator;
	
	@Rule
	public MockitoRule rule=MockitoJUnit.rule();
	
	@Test
	public void additionTest() {
		//Mockito.when(calculator.add(3, 7)).thenReturn(11);
		
		Mockito.when(calculator.add(3, 7)).thenCallRealMethod();
		assertEquals(11, calculator.add(3, 7));
	}
	
}
