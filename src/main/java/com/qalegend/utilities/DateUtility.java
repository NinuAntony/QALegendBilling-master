package com.qalegend.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class DateUtility {
 public static String getSystemDate()
 {
	 DateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");
	 Date CurrentDateWithTime=new Date();
	 String SystemDate=dateFormat.format(CurrentDateWithTime);
	 return SystemDate;
 }
}
