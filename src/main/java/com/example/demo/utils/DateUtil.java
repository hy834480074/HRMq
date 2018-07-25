package com.example.demo.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {


    public static String dateYear(){
        Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;

        String a=year + "-";
        String b=month + "";
        if(b.length()!=2){
            b = "0"+b;
        }
        String datetime = a+b;
        return datetime;
    }

    public static Timestamp datetime(){
        Date time= new java.sql.Date(new java.util.Date().getTime());
        String nowTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(time);
        Timestamp gooddate =Timestamp.valueOf(nowTime);
        return gooddate;
    }


}
