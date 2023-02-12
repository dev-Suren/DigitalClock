package com.digitalclock.functions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime extends Clock{
    //using private to encapsulate the variables.
    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat;
    private String currentTime;


    @Override
    //overriding nowtime method form abstract class
    public String nowTime() {
        simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        currentTime = simpleDateFormat.format(calendar.getInstance().getTime());
        return currentTime;
    }

}
