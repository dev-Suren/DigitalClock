package com.digitalclock.functions;
public abstract class Clock {
    public abstract String nowTime();

    public int stopWatch(int second){
        return second -1;
    }

}
