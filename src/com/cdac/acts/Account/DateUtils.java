package com.cdac.acts.Account;

	import java.util.Date;
	import java.text.ParseException;
	import java.text.SimpleDateFormat;

	public class DateUtils {
		
		private static final String FORMAT = "dd/MM/yyyy";
		private static final String EMPTY = "";
		
		public DateUtils () {
			
		}
		
		public static String getFormatteddate(Date date){
			if(null == date) {
				return null;
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
			return sdf.format(date);
			
		}
		
		public static Date getDate(String strDate) throws ParseException {
			if(null == strDate || EMPTY.equals(strDate)) {
				return null;
			}
			
			SimpleDateFormat sdf = new SimpleDateFormat(FORMAT);
			Date date = sdf.parse(strDate);
			return date;
		}

	}


