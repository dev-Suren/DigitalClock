package com.digitalclock.functions;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CurrentDay implements Date{
    private Calendar calendar;
    private SimpleDateFormat simpleDateFormat;
    private String todayDay;
    private String todayDate;
    @Override
    public String currentDate() {
        simpleDateFormat = new SimpleDateFormat("MMMMM dd, yyyy");
        todayDate = simpleDateFormat.format(calendar.getInstance().getTime());
        return todayDate;
    }


    public String today() {
        simpleDateFormat = new SimpleDateFormat("E");
        todayDay = simpleDateFormat.format(calendar.getInstance().getTime());
        return todayDay;
    }

    public String getToday(){
        return today();
    }
}
