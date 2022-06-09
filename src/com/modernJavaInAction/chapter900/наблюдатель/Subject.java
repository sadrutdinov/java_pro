package com.modernJavaInAction.chapter900.наблюдатель;

public interface Subject {
    void registerObserver(Observer o);
    void notifyObservers(String tweet);
}
