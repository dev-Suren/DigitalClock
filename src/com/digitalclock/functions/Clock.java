package com.digitalclock.functions;

//Creating abstract class Clock
public abstract class Clock {
    //creatig abstract class
    public abstract String nowTime();

    public int stopWatch(int second){
        return second -1;
    }

}
