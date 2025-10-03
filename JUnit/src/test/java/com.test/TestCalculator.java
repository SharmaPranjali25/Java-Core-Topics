package com.test;
 
import static org.junit.jupiter.api.Assertions.assertEquals;
 
import java.util.Arrays;
import java.util.List;
 
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
 
import org.junit.jupiter.api.Assertions;

 
 
public class TestCalculator {
	
	Calculator obj; // declares a reference to Calculator object that you will test
	
	@BeforeAll
	 public static void beforeAll() {
		 	System.out.println("before all test cases");
		 }
		 @AfterAll
		 public static void afterAll() {
		 	System.out.println("after all test cases");
		 }
		 @BeforeEach
		 public void setUp() {
		 	System.out.println("before test method");
		 	obj=new Calculator();
		 }
		  
		 @AfterEach
		 public void setDown() {
		 	System.out.println("after test method");
		 	obj=null;
		 }
		 
		 
		 @Test
		 @DisplayName("test method add with 2 args")
		 public void testAdd() {
		 	System.out.println("add method");
		 	int act=obj.add(30,20);
		 	int expected=50;
		 	
		 	Assertions.assertEquals(expected, act);
		 }
		  
		 @Test
		 @DisplayName("test method sub with 2 args")
		 public void testSub() {
		 	System.out.println("add method");
		 	int act=obj.sub(30,20);
		 	int expected=10;
		 	
		 	Assertions.assertEquals(expected, act);
		 }
		  
		 @Test
		 @DisplayName("test method mul with 2 args")
		 public void testMul() {
		 	System.out.println("mul method");
		 	int act=obj.mul(30,20);
		 	int expected=600;
		 	
		 	Assertions.assertEquals(expected, act);
		 }
		  
		 @Test
		 @DisplayName("test method nameCount with list input")
		 public void testNameCount() {
		 	System.out.println("name count method");
		 	List<String> list=Arrays.asList("rohit","kohli","sky");
		 	
		 	int act=obj.nameCount(list);
		 	int expected=3;
		 	
		 	Assertions.assertEquals(expected, act);
		 }
		  
		 @Test
		 @DisplayName("test method greetUser string input")
		 public void testGreetUser() {
		 	System.out.println("GreetUser method");
		 	String act = obj.greetUsers("Hello");
		 	String expected = "Hello";
		 	Assertions.assertEquals(expected, act);

		 	
		 	
		 }
	
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
 
}
	
 
 
