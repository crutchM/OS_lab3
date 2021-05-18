package com.company;

public class StateSummator {
    private int sum;

    public synchronized void add(double value){
        sum += value;
    }

    public synchronized double getSum(){
        return sum;
    }
}
