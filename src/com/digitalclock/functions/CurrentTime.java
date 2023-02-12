package com.digitalclock.functions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentTime extends Clock{
    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat;
    private String currentTime;


    @Override
    public String nowTime() {
        simpleDateFormat = new SimpleDateFormat("hh:mm:ss a");
        currentTime = simpleDateFormat.format(calendar.getInstance().getTime());
        return currentTime;
    }

}
