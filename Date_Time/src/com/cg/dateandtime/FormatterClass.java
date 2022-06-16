package com.cg.dateandtime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FormatterClass {
	public static void main(String[] args)
	{
		LocalDateTime myDataObj = LocalDateTime.now();
		System.out.println("Before Formatting what is your date?" + myDataObj);
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
			String formattedDate = myDataObj.format(myFormatObj);
			System.out.println("After formatting what is your date?" +formattedDate);
		
	}

}
