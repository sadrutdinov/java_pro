package com.modernJavaInAction.chapter900.стратегия;

public class IsNumeric implements ValidationStrategy {
    @Override
    public boolean execute(String s){
        return s.matches("\\d+");
    }
}
