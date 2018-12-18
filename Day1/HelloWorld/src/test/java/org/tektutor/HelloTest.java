package org.tektutor;

import org.junit.Test;
import static org.junit.Assert.*;

<<<<<<< HEAD

=======
>>>>>>> 3628f612a0b9d84c4248672804e79f80a7002641
public class HelloTest {

	@Test
	public void testSayHello() {
<<<<<<< HEAD
	
	Hello obj = new Hello();

	String actualOutput = obj.sayHello();
	String expectedOutput = "Hello Java3";

	assertEquals ( expectedOutput, actualOutput );

=======

		Hello obj = new Hello();

		String actualOutput = obj.sayHello();
		String expectedOutput = "Hello Java!";

		assertEquals ( expectedOutput, actualOutput );
		
>>>>>>> 3628f612a0b9d84c4248672804e79f80a7002641
	}

}
