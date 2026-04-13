package models;

import interfaces.Payable;

public class Guest extends Person implements Payable {
    @Override
    public void pay(double amount) throws Exception {

    }

    @Override
    public double getBalance() {
        return 0;
    }
}
