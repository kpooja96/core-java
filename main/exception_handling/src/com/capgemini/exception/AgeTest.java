package com.capgemini.exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AgeTest {

	@Test
	//(expected = IllegalArgumentException.class)
    public void canVote_throws_AgeNotWithinRangeException_between_15_and_21() {
        Age a = new Age();
        a.canVote(0);
    }
	}