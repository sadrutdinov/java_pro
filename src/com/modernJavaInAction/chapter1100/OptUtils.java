package com.modernJavaInAction.chapter1100;

import com.solid.isp.isp_violation.I;

import java.util.Optional;

public class OptUtils {
    public static Optional<Integer> stringToInt(String s) {
        try {
            return Optional.of(Integer.parseInt(s));
        } catch (NumberFormatException e) {
            return Optional.empty();
        }
    }
}
