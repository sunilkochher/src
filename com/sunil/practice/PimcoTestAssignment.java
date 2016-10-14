package com.sunil.practice;

import java.util.*;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;


/* Test: Create an Iterator filtering framework: (1) IObjectTest interface with a single bool Test(object o) method and (2) an 
implementation of IEnumerator (let's call it FilteringEnumerator) which is initialized with another Enumerator and an 
IObjectTest instance: new FilteringEnumerator(myEnumerator, myTest). Your FilteringEnumerator will then allow 
iteration over 'myEmumerator', but skipping any objects which don't pass the 'myTest' test. Create a simple unit test 
for this framework */


/* Interface for simple test method*/

interface IObjectTest {
	public boolean test(Object O);
}

/* class that implements the Interface for test method.
 * Test method takes simple object, a string value, and compares it with the existing array of string.
 * This is just a simple test case. If string exists in the given array, it returns true, else false.
 * */

class IObjectTestImpl implements IObjectTest {

	public boolean test(Object o) {

		String[] strArray = new String[] { "one", "two" };

		boolean b = false;

		for (int i = 0; i < strArray.length; i++) {
			if (strArray[i] == o.toString()) {
				b = true;
				break;
			}
		}
		return b;
	}

}

/* This class implements filter method and uses Test method in its operation.
 * The method returns a resulting filtered list based on the test pass or fail.
 * */


class FilteringEnumerator {

	List currentlist;
	IObjectTest iObjectTest;

	FilteringEnumerator(List l, IObjectTest iObjectTest) {
		this.currentlist = l;
		this.iObjectTest = iObjectTest;
	}

	List filter() {
		List filteredList = new ArrayList();

		for (int i = 0; i < currentlist.size(); i++) {
			if (iObjectTest.test(currentlist.get(i))) {
				filteredList.add(currentlist.get(i));
			}

		}
		return filteredList;
	}
}

/* A main class that runs JUnit test
 * 
 * */
public class PimcoTestAssignment {

	public static void main(String[] args) {
		
		Result result = JUnitCore.runClasses(PimcoTestAssignment.class);		
		System.out.println(result.wasSuccessful());

	}
	
	/* Simple JUnit test that compares the filtered result with the expected result*/
	
	@Test
    public void testMethod() {
		
		List l = new ArrayList();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");

		IObjectTest iObjectTest = new IObjectTestImpl();
		FilteringEnumerator filteringEnumerator=new FilteringEnumerator(l,iObjectTest);

		List filteredList=filteringEnumerator.filter();
		
		List expectedResultList=new ArrayList();
		expectedResultList.add("one");
		expectedResultList.add("two");
		
		
        assertEquals(expectedResultList.size(), filteredList.size());

    }

}