package com.mockito.practice.mockitopractice;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class BusinessLogicMockAnnotationsTest { 
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	BusinessLogicImpl businessLogic;
	
	@Test
	public void testfindGreatestFromAllData(){		
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3,4});
		
		assertEquals(4,businessLogic.findGreatestFromAllData());
	}
	
	@Test
	public void testfindGreatestFromAllData_ForOne(){		
		
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {2});
		
		assertEquals(2,businessLogic.findGreatestFromAllData());
	}

}
