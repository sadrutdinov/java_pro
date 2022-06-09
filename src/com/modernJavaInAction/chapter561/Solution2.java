package com.modernJavaInAction.chapter561;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution2 {
    public static void main(String[] args) {
        // Вывести список неповторяющихся городов, в которых работают трейдеры.
        List<Transaction> transactions = SimpleTransactionFabric.getTransactions();

        List<String> cities = transactions.stream().map(t -> t.getTrader().getCity()).distinct().collect(Collectors.toList());


        System.out.println(cities);


    }
}
