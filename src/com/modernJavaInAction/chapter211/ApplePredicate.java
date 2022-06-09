package com.modernJavaInAction.chapter211;

import com.modernJavaInAction.chapter132.Apple;

public interface ApplePredicate<T>{
    boolean test (T t);
}
