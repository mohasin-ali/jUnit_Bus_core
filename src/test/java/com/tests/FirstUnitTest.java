package com.tests;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class FirstUnitTest {

    @Test
    public void whenThis_thenThat() {
        assertTrue(true);
    }

    @Test
    public void whenSomething_thenSomething() {
		/*
		 * Span span = GlobalTracer.get().activeSpan(); if (span != null) {
		 * span.setTag("test_owner", "mohasin_team"); }
		 */
    	try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertTrue(true);
    }

    @Test
    public void whenSomethingElse_thenSomethingElse() {
		/*
		 * Span span = GlobalTracer.get().activeSpan(); if (span != null) {
		 * span.setTag("test_span_tag", "mohasin_tag"); }
		 */
    	try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        assertTrue(true);
    }
}