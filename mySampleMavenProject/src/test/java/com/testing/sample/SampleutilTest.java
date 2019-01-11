package com.testing.sample;

import static org.junit.Assert.*;

import org.junit.Test;

public class SampleutilTest {
	@Test
	public void testAdd(){
		System.out.println("Add");
		Integer a = 10;
		Integer b = 15;
		Integer expResult = 25;
		Integer result = SampleUtli.add(a,b);
		assertEquals(expResult,result);	
		
		
			
		
	}
	
	@Test
	public void testAdd2(){
		assertEquals(null,SampleUtli.add(15,null));
	}
	@Test
	public void testAdd3(){
		assertEquals(null,SampleUtli.add(null,10));
	}
	@Test
	public void testAdd4(){
		assertEquals(null,SampleUtli.add(null,null));	
	
}

	

	}


