package com.internousdev.ecsite.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {

	public String getDate(){
		Date date=new Date();
		SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		/*y→年,M→月,ddHH→月における日１日における時,mmss→分秒*/

		return simpleDateFormat.format(date);
	}

}
