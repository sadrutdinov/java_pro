package com.modernJavaInAction.chapter821;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Test {
    public static void main(String[] args) {
        List<Transaction> transactionList = new ArrayList<>();

        Transaction transaction = new Transaction("1sddew");
        Transaction transaction1 = new Transaction("2sddew");
        Transaction transaction2 = new Transaction("def");
        Transaction transaction3 = new Transaction("dwef");

        transactionList.add(transaction);
        transactionList.add(transaction1);
        transactionList.add(transaction2);
        transactionList.add(transaction3);

        System.out.println(transactionList);

        transactionList.removeIf(tr -> Character.isDigit(tr.getReferenceCode().charAt(0)));

        transactionList.replaceAll(tr -> new Transaction(tr.getReferenceCode().toUpperCase(Locale.ROOT)));

        System.out.println(transactionList);
    }
}
