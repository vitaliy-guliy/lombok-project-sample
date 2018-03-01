package org.codesolt;

import org.junit.Test;

public class ModelTest {
	
	private ModelInterface model;
	
	@Test
	public void testJava() {
		model = new ModelImp("Hello Java", 6);
		
	}
	
	@Test
	public void testLombokData() {
		model = new ModelLombokData("Hello Java", 6);
	}
	
	@Test
	public void testLombokValue() {
		model = new ModelLombokValue("Hello Java", 6);
	}	
}
