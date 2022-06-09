package com.modernJavaInAction.chapter561;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        List<Transaction> transactions = SimpleTransactionFabric.getTransactions();

//        Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
        List<Transaction> collect = transactions.stream()
                .filter(transaction -> transaction.getYear() == 2011)
                .sorted(Comparator.comparingInt(Transaction::getValue))
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
