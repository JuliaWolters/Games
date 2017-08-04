package fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class FizzbuzzTest {

	@Test
	public void testFizz3() {
		Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(3));
	}

	@Test
	public void testFizz9() {
		Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(9));
	}

	@Test
	public void testFizz27() {
		Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(27));
	}

	@Test
	public void testFizz99() {
		Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(99));
	}

	@Test
	public void testFizz111() {
		Assert.assertEquals("Fizz", FizzBuzz.fizzBuzz(111));
	}

	@Test
	public void testBuzz5() {
		Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(5));
	}

	@Test
	public void testBuzz10() {
		Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(10));
	}

	@Test
	public void testBuzz50() {
		Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(50));
	}

	@Test
	public void testBuzz100() {
		Assert.assertEquals("Buzz", FizzBuzz.fizzBuzz(100));
	}


	@Test
	public void testFizzBuzz15() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(15));
	}

	@Test
	public void testFizzBuzz45() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(45));
	}

	@Test
	public void testFizzBuzz30() {
		Assert.assertEquals("FizzBuzz", FizzBuzz.fizzBuzz(30));
	}

	@Test
	public void testI1() {
		Assert.assertEquals("1", FizzBuzz.fizzBuzz(1));
	}

	@Test
	public void testI47() {
		Assert.assertEquals("47", FizzBuzz.fizzBuzz(47));
	}
	

	@Test
	public void testI32() {
		Assert.assertEquals("32", FizzBuzz.fizzBuzz(32));
	}



}
