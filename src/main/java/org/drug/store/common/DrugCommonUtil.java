package org.drug.store.common;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.util.StringUtils;


public class DrugCommonUtil {
	private static DateTimeFormatter DATEFORMAT_DATETIME = DateTimeFormatter.ofPattern("yyyyMMDDHHmmss");
	private static DateTimeFormatter DATEFORMAT_DATE = DateTimeFormatter.ofPattern("yyyyMMdd");
	
	public static Timestamp dateTimeStringToTimestamp(String srcString) {
		if(isEmpty(srcString)) {
			return null;
		}try {
			LocalDateTime dateTime = LocalDateTime.parse(srcString, DATEFORMAT_DATETIME);
			return Timestamp.valueOf(dateTime);
		}catch(DateTimeParseException e){
			return dateStringToTimestamp(srcString);
		}
	}
	
	public static Timestamp dateStringToTimestamp(String srcString) {
		if(isEmpty(srcString)) {
			return null;
		}try {
			LocalDate date = LocalDate.parse(srcString, DATEFORMAT_DATE);
			return Timestamp.valueOf(date.atTime(LocalTime.MIN));
		}catch(DateTimeParseException e) {
			return null;
		}
	}
	
	public static boolean isEmpty(String val) {
		if(StringUtils.isEmpty(val)||StringUtils.pathEquals(val, "null")) {
			return true;
		}
		return false;
	}
	
}
