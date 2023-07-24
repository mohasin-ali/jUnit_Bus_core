package com.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SecondUnitTest {

    @Test
    public void whenSomething_thenSomething() {
    	try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertTrue(true);
    }

    @Test
    public void whensomethingElse_thenSomethingElse() {
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertTrue(true);
    }
}