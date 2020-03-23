package com.dhanifudin.cashflow;

import com.dhanifudin.cashflow.models.Account;
import com.dhanifudin.cashflow.models.Session;

public class Application extends android.app.Application {

    private static Account account;
    private static Session session;


    @Override
    public void onCreate() {

        super.onCreate();
        account = new Account("Larasatizka");
        session = new Session(this);

    }

    public static Account getAccount() {
        return account;
    }

    public static Session getSession() {
        return session;
    }

}
