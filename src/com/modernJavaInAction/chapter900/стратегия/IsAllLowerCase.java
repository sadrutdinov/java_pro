package com.modernJavaInAction.chapter900.стратегия;

public class IsAllLowerCase implements ValidationStrategy {
    @Override
    public boolean execute(String s){
        return s.matches("[a-z]+");
    }
}
