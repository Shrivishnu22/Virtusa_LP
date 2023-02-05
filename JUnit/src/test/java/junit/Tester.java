package junit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

@DisplayName("Calculator")
public class Tester {
	@BeforeAll
	static void display() {
		System.out.println("Welcome");
	}
	
	@BeforeEach
	void starter() {
		System.out.println("Addition Test case started");
	}
	
	@Disabled("It's under maintainence")
	@DisplayName("Add")
	@Test
	public void addTest() {
		Add obj = new Add();
		int res = obj.add(1, 99);
		Assertions.assertEquals(100,res);
	}
	
	@AfterEach
	void end() {
		System.out.println("Addition Test case end");
	}
	
	@BeforeEach
	void starter1() {
		System.out.println("Subtraction Test case started");
	}
	
	@Disabled("It's under maintainence")
	@DisplayName("Subtract")
	@Test
	public void subTest() {
		Sub obj = new Sub();
		int res = obj.sub(1, 99);
		Assertions.assertEquals(-98,res);
	}
	
	@AfterEach
	void end1() {
		System.out.println("Subtraction Test case end");
	}
	
	@ParameterizedTest
	@CsvSource({"1,2,3","4,5,9","15,11,26"})
	public void paramAdd(int a, int b, int c) {
		ParamAdd p = new ParamAdd();
		int res = p.paramAdd(a, b, c);
		Assertions.assertEquals(c, res);
	}
	
	@AfterAll
	static void footer() {
		System.out.println("Thank you");
	}
	
}
