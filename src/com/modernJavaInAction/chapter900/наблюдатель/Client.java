package com.modernJavaInAction.chapter900.наблюдатель;

public class Client {
    public static void main(String[] args) {
        Feed f = new Feed();
        f.registerObserver((String tweet) -> {
            if (tweet != null && tweet.contains("money")) {
                System.out.println("Breaking news in NY! " + tweet);
            }
        });

        f.registerObserver((String tweet) -> {
            if(tweet != null && tweet.contains("queen")){
                System.out.println("Yet more news from London... " + tweet);
            }
        });


        f.notifyObservers("The queen said her favourite book is Modern Java in Action!");
    }


}
