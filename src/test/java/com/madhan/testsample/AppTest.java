package com.madhan.testsample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void testCompareString() {
		assertEquals(1,App.compareString("madhan", "madhan"));
	}
	
	@Test
	void testSum() {
		int arr[]  = {1,2,3,4};
		assertEquals(10, App.sum(arr));
	}


}
