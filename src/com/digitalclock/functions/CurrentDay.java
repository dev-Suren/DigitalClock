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
        simpleDateFormat = new SimpleDateFormat("MM dd, yyyy");
        todayDate = simpleDateFormat.format(calendar.getInstance().getTime());
        return todayDate;
    }


    private String today() {
        simpleDateFormat = new SimpleDateFormat("EEEE");
        todayDay = simpleDateFormat.format(calendar.getInstance().getTime());
        return todayDay;
    }

    public String getToday(){
        return today();
    }
}
