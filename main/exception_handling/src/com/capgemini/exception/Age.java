package com.capgemini.exception;

public class Age {
    public boolean canVote(int age) {
        int i = 0;
		if (i<=0) throw new IllegalArgumentException("age should be +ve");
        if (i<18) return false;
        else return true;
    }
}
