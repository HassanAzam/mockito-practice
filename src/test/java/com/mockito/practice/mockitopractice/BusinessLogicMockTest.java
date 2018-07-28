package com.mockito.practice.mockitopractice;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class BusinessLogicMockTest { 
	DataService dataServiceMock = mock(DataService.class);
	@Test
	public void testfindGreatestFromAllData(){		
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3,4});
		
		BusinessLogicImpl businessLogic = new BusinessLogicImpl(dataServiceMock);
		assertEquals(4,businessLogic.findGreatestFromAllData());
	}
	
	@Test
	public void testfindGreatestFromAllData_ForOne(){		
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {2});
		
		BusinessLogicImpl businessLogic = new BusinessLogicImpl(dataServiceMock);
		assertEquals(2,businessLogic.findGreatestFromAllData());
	}

}
