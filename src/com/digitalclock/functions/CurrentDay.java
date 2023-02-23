package com.digitalclock.functions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentDay implements Date{
    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat;
    private String todayDay;
    private String todayDate;

    @Override
    //overriding currentdate from date interface
    public String currentDate() {
        simpleDateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        todayDate = simpleDateFormat.format(calendar.getInstance().getTime());
        return todayDate;
    }


    private String today() {
        simpleDateFormat = new SimpleDateFormat("E");
        todayDay = simpleDateFormat.format(calendar.getInstance().getTime());
        return todayDay;
    }

    //using getter to get the data from private field. Encapsulation.
    public String getToday(){
        return today();
    }
}
