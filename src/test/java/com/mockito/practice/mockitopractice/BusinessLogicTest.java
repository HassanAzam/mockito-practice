package com.mockito.practice.mockitopractice;

import static org.junit.Assert.*;

import org.junit.Test;

public class BusinessLogicTest {

	@Test
	public void testfindGreatestFromAllData() {
		BusinessLogicImpl businessLogic = new BusinessLogicImpl(new DataServiceStub());
		assertEquals(4,businessLogic.findGreatestFromAllData());
	}

}

// stub works, but it is not good
// to test different scenarios, we have to write many stubs
// mockito takes care of this issue
class DataServiceStub implements DataService {
	public int[] retrieveAllData() {
		return new int[] {1,2,4};
	}
}
