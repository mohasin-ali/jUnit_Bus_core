package com.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Random;

import org.junit.jupiter.api.Test;

public class SecondUnitTest {
	Random random = new Random();
	
    @Test
    public void whenSomething_thenSomething() {
    	try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	int ran = random.nextInt(100);
    	if(ran%4==0) {
    		assertTrue(false);
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
    	int ran = random.nextInt(100);
    	if(ran%5==0) {
    		assertTrue(false);
    	}
        assertTrue(true);
    }
}