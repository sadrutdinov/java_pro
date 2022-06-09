package com.modernJavaInAction.chapter561;

import java.util.List;

public class Solution5 {
    public static void main(String[] args) {
        // Выяснить, существует ли хоть один трейдер из Милана.
        List<Transaction> transactions = SimpleTransactionFabric.getTransactions();

        boolean b = transactions.stream()
                .anyMatch(transaction -> "Milan".contains(transaction.getTrader().getCity()));

        System.out.println(b);
    }
}
