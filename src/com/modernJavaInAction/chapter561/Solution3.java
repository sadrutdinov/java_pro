package com.modernJavaInAction.chapter561;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution3 {

    public static void main(String[] args) {

        List<Transaction> transactions = SimpleTransactionFabric.getTransactions();
//    Найти всех трейдеров из Кембриджа и отсортировать их по именам.

        List<Trader> traderNames = transactions.stream()
                .map(Transaction::getTrader)
                .distinct()
                .filter(trader -> "Cambridge".contains(trader.getCity()))
                .sorted(Comparator.comparing(Trader::getName))
                .collect(Collectors.toList());


        //4. Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.
        String reduce = transactions.stream()
                .map(transaction -> transaction.getTrader().getName())
                .distinct()
                .reduce("", (n1, n2) -> n1 + n2);

        System.out.println(reduce);

    }
}
