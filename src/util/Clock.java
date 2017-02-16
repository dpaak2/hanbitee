package util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Clock {
	public String now() {
		return new SimpleDateFormat("yyyy: mm:dd: a hh : mm: ss").format(new Date());
	}
}