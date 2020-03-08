package com.dhanifudin.cashflow.models;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private int balance;
    private List<Transaction> transactions;

    public Account(String name) {
        this.name = name;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void addTransaction(Transaction transaction) {
        if (transaction.getType() == Transaction.Type.CREDIT) {
            balance += transaction.getAmount();
        } else {
            balance -= transaction.getAmount();
        }
        this.transactions.add(transaction);
    }

    public void removeTransaction(int index) {
        Transaction transaction = transactions.get(index);
        if (transaction.getType() == Transaction.Type.CREDIT) {
            balance -= transaction.getAmount();
        } else {
            balance += transaction.getAmount();
        }
        this.transactions.remove(transaction);
    }

    public void updateTransaction(int index, Transaction transaction) {
        this.transactions.set(index, transaction);
        this.balance = 0;
        for (Transaction t : transactions) {
            if (t.getType() == Transaction.Type.CREDIT) {
                balance += transaction.getAmount();
            } else {
                balance -= transaction.getAmount();
            }
        }
    }
}
