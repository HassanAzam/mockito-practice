package com.mockito.practice.mockitopractice;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ListTest {

	@Mock
	List listMock;
	
	@Test
	public void testSize() {
		
		when(listMock.size()).thenReturn(10);
		assertEquals(10,listMock.size());
	}

	@Test
	public void testSize_withMultipleReturns() {
		
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10,listMock.size());
		assertEquals(20,listMock.size());
	}
	
	@Test
	public void testGet_SpecificParameter() {
		when(listMock.get(0)).thenReturn("Hello");
		assertEquals("Hello",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	
	@Test
	public void testGet_GenericParameter() {
		when(listMock.get(Mockito.anyInt())).thenReturn("Hello");
		assertEquals("Hello",listMock.get(0));
		assertEquals("Hello",listMock.get(1));
	}
}
