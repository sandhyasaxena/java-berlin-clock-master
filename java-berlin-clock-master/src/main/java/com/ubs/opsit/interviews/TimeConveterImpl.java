package com.ubs.opsit.interviews;
import com.ubs.opsit.interviews.exception.*;
import com.ubs.opsit.interviews.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author sandhya.saxena
 * Implementation class of Interface TimeConverter
 *
 */
public class TimeConveterImpl implements TimeConverter{

	private static final Logger log = LoggerFactory.getLogger(TimeConveterImpl.class);

	/* (non-Javadoc)
	 * @see com.ubs.opsit.interviews.TimeConverter#convertTime(java.lang.String)
	 * Converts input time of format 00:00:00 into Berlin clock time format
	 */
	public String convertTime(String pInputTime) 
	{
		String lOutputTime=null;
		TimeConverterUtil lUtilObj=new TimeConverterUtil();
		String lYellowLampIndVal=null;
		String lHoursTime=null;
		String lMinutesTime=null;
		try {
			if(lUtilObj.isValidInputTime(pInputTime))
			{
				lYellowLampIndVal=lUtilObj.generateYellowLampIndValue(pInputTime)+TimeConverterConstants.NEW_LINE_PARAM;
				lHoursTime=lUtilObj.generateHoursTime(pInputTime)+TimeConverterConstants.NEW_LINE_PARAM;
				lMinutesTime=lUtilObj.generateMinutesTime(pInputTime);
				lOutputTime=lYellowLampIndVal+lHoursTime+lMinutesTime;

			}
		}
		catch(InvalidInputException pEx)
		{
			log.error(pEx.toString());
			lOutputTime=lUtilObj.generateDefaultBerlinClockTime();
		}

		return lOutputTime;
	}
}
