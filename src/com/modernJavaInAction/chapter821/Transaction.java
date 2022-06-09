package com.modernJavaInAction.chapter821;

public class Transaction {
    private String referenceCode;

    public Transaction(String referenceCode) {
        this.referenceCode = referenceCode;
    }

    public String getReferenceCode() {
        return referenceCode;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "referenceCode='" + referenceCode + '\'' +
                '}';
    }
}
