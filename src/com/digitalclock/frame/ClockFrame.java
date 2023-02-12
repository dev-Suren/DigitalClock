package com.digitalclock.frame;
import com.digitalclock.functions.CurrentTime;
import javax.swing.*;
import java.awt.*;

public class ClockFrame extends JFrame {
    private JLabel currentTime;
    CurrentTime newCurrentTime = new CurrentTime();
    ClockFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Dital Clock");
        this.setLayout(new FlowLayout());
        this.setSize(350,200);
        this.setResizable(false);
        currentTime = new JLabel();
        currentTime.setText(newCurrentTime.nowTime());
        this.add(currentTime);
        this.setVisible(true);
        setTime();
    }
    public void setTime(){
        while(true){
            currentTime.setText(newCurrentTime.nowTime());
            try{
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

}
