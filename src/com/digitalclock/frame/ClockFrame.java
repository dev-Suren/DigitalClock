package com.digitalclock.frame;
import com.digitalclock.functions.CurrentDay;
import com.digitalclock.functions.CurrentTime;
import com.digitalclock.functions.Date;

import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;

//Extending JFrame library to make gui application.
public class ClockFrame extends JFrame {
    private JLabel currentTime;
    private JLabel todayDate;
    private JLabel todayDays;
    CurrentTime newCurrentTime;
    CurrentDay currentTodayDate;

    //creating ananomous class
    Date dates = new CurrentDay(){
        @Override
        public String currentDate() {
            return super.currentDate();
        }

    };
    ClockFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        //this.setResizable(false);
        //allocating current time
        currentTime = new JLabel();
        newCurrentTime = new CurrentTime();
        currentTime.setText(newCurrentTime.nowTime());
        currentTime.setFont(new Font("Verdana",Font.PLAIN,50));
        currentTime.setForeground(new Color(0x333333));
        currentTime.setBackground(new Color(0xf0f0ff));
        currentTime.setOpaque(true);
        this.add(currentTime);

        todayDays = new JLabel();
        currentTodayDate = new CurrentDay();
        todayDays.setText(currentTodayDate.getToday());
        todayDays.setFont(new Font("Ink Free",Font.PLAIN,35));
        todayDays.setForeground(new Color(0x333333));
        todayDays.setOpaque(true);
        this.add(todayDays);


        todayDate = new JLabel();
        todayDate.setText(dates.currentDate());
        todayDate.setFont(new Font("Verdana",Font.PLAIN,35));
        todayDate.setForeground(new Color(0x333333));
        todayDate.setBackground(new Color(0xf0f0ff));
        todayDate.setOpaque(true);
        this.add((todayDate));
        this.setVisible(true);
        setTime();
    }
    public void setTime(){
        while(true){
            currentTime.setText(newCurrentTime.nowTime());
            todayDays.setText(currentTodayDate.getToday());
            todayDate.setText(dates.currentDate());
            //using try and except for thread.
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
