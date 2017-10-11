package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import shapes.Circle;

public class CircleTest {
	private final double DELTA = 0.00000000000001;
	
	@Test
	public void testCalculateArea() {
		Circle a = new Circle(1);
		assertEquals(Math.PI * Math.pow(1, 2), a.calculateArea(), DELTA);
	}

	@Test
	public void testCircle() {
		Circle b = new Circle(1);
		assertEquals(1, b.getRadius(), DELTA);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void textNegativeCircle(){
		new Circle(-1);
	}

	@Test
	public void testGetRadius() {
		Circle c = new Circle(1);
		assertEquals(1, c.getRadius(), DELTA);
	}

}




