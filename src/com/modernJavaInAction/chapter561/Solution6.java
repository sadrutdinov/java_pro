package com.modernJavaInAction.chapter561;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Solution6 {
    public static void main(String[] args) {
        // Вывести суммы всех транзакций трейдеров из Кембриджа.
        List<Transaction> transactions = SimpleTransactionFabric.getTransactions();

        transactions.stream()
                .filter(transaction -> "Cambridge".contains(transaction.getTrader().getCity()))
                .forEach(transaction -> System.out.println(transaction.getValue()));

//        Какова максимальная сумма среди всех транзакций?


        Optional<Integer> max = transactions.stream().max(Comparator.comparing(Transaction::getValue)).map(Transaction::getValue);
        Optional<Integer> min = transactions.stream().min(Comparator.comparing(Transaction::getValue)).map(Transaction::getValue);

        Optional<Integer> reduce = transactions.stream().map(Transaction::getValue).reduce(Integer::max);
        Optional<Integer> reduce2 = transactions.stream().map(Transaction::getValue).reduce(Integer::min);

        System.out.println("max: " + max.get());
        System.out.println("min: " + min.get());
        System.out.println("max: " + reduce.get());
        System.out.println("min: " + reduce2.get());

    }
}
