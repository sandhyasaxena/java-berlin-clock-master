package com.ubs.opsit.interviews.util;

import com.ubs.opsit.interviews.exception.InvalidInputException;

/**
 * @author sandhya.saxena
 * Utility class wherein internal methods are defined
 *
 */
public class TimeConverterUtil {

	/**
	 * @return
	 * Generates default time in berlin clock format
	 */
	public String generateDefaultBerlinClockTime()
	{
		String lDefTimeIndResult=null;
		StringBuilder lDeftTimeInd=new StringBuilder();
		lDeftTimeInd.append(TimeConverterConstants.YELLOW_LAMP_IND_VAL_DEF).append(TimeConverterConstants.NEW_LINE_PARAM);
		lDeftTimeInd.append(TimeConverterConstants.HOUR_DEF_TIME).append(TimeConverterConstants.NEW_LINE_PARAM);
		lDeftTimeInd.append(TimeConverterConstants.HOUR_DEF_TIME).append(TimeConverterConstants.NEW_LINE_PARAM);
		lDeftTimeInd.append(TimeConverterConstants.MINUTE_DEFTIME_1ST_ROW).append(TimeConverterConstants.NEW_LINE_PARAM);
		lDeftTimeInd.append(TimeConverterConstants.MINUTE_DEFTIME_2ND_ROW);
		lDefTimeIndResult=lDeftTimeInd.toString();
		return lDefTimeIndResult;
	}


	/**
	 * @param pInputTime
	 * @return
	 * @throws InvalidInputException
	 * Validates Input time
	 */
	public boolean isValidInputTime(String pInputTime)throws InvalidInputException
	{
		boolean lResult=false;
		String lHoursTime=null;
		String lMinutesTime=null;
		String lSecondsTime=null;
		String lHourTimeSeparator=null;
		String lMinuteTimeSeparator=null;

		if(pInputTime==null || pInputTime.equals(TimeConverterConstants.BLANK_STRING))
			throw new InvalidInputException(TimeConverterConstants.INSUFFICIENTINPUTEXDEC);
		else if(pInputTime.length()!=8)
			throw new InvalidInputException(TimeConverterConstants.INPUTFORMATEXDESC);
		else
		{
			lHoursTime=pInputTime.substring(0,2);
			lMinutesTime=pInputTime.substring(3,5);
			lSecondsTime=pInputTime.substring(6,8);
			lHourTimeSeparator=pInputTime.substring(2,3);
			lMinuteTimeSeparator=pInputTime.substring(5,6);
			if(!lHoursTime.matches(TimeConverterConstants.NUMBER_REGEX)||!lMinutesTime.matches(TimeConverterConstants.NUMBER_REGEX)||!lSecondsTime.matches(TimeConverterConstants.NUMBER_REGEX))
				throw new InvalidInputException(TimeConverterConstants.INPUTFORMATEXDESC);
			else if(!lHourTimeSeparator.equals(TimeConverterConstants.TIME_SEPARATOR)||!lMinuteTimeSeparator.equals(TimeConverterConstants.TIME_SEPARATOR))
				throw new InvalidInputException(TimeConverterConstants.INPUTFORMATEXDESC);
			else if(Integer.parseInt(lHoursTime)>TimeConverterConstants.MAX_HOUR_TIME || Integer.parseInt(lMinutesTime)>TimeConverterConstants.MAX_MINUTE_TIME|| Integer.parseInt(lSecondsTime)>TimeConverterConstants.MAX_SECOND_TIME )
				throw new InvalidInputException(TimeConverterConstants.INVALIDINPUTEXDESC);

		}
		lResult=true;
		return lResult;
	}

	/**
	 * @param pInputTime
	 * @return
	 * Generates yellow lamp indicator Value of Berlin clock based on seconds component in input time
	 */
	public String generateYellowLampIndValue(String pInputTime)
	{
		String lSecondsTime=null;
		int lSecondsTimeInt=0;
		String lResult=null;
		lSecondsTime=pInputTime.substring(6,8);
		lSecondsTimeInt=Integer.parseInt(lSecondsTime);
		if(lSecondsTimeInt%2==0)
			lResult=TimeConverterConstants.YELLOW_LAMP_IND_VAL_ON;
		else
			lResult=TimeConverterConstants.YELLOW_LAMP_IND_VAL_DEF;

		return lResult;
	}

	/**
	 * @param pInputTime
	 * @return
	 * Generates hours time indicator value of Berlin clock based on hours component in input time
	 */
	public  String generateHoursTime(String pInputTime)
	{
		String lHoursTime=null;
		int lHoursTimeInt=0;
		int lDivResult=0;
		int lDivMod=0;
		String lResult=TimeConverterConstants.BLANK_STRING;
		String lFirstRowVal=TimeConverterConstants.HOUR_DEF_TIME;
		String lSecondRowVal=TimeConverterConstants.HOUR_DEF_TIME;
		lHoursTime=pInputTime.substring(0,2);
		lHoursTimeInt=Integer.parseInt(lHoursTime);
		lDivResult=lHoursTimeInt/5;
		lDivMod=lHoursTimeInt%5;
		if(lDivResult>0)
		{
			lFirstRowVal=TimeConverterConstants.HOUR_MAX_TIME.substring(0,lDivResult);
			if(lDivResult<4)
				lFirstRowVal=lFirstRowVal+TimeConverterConstants.HOUR_DEF_TIME.substring(lDivResult);
		} 
		if(lDivMod>0)
		{
			lSecondRowVal=TimeConverterConstants.HOUR_MAX_TIME.substring(0,lDivMod);
			if(lDivMod<4)
				lSecondRowVal=lSecondRowVal+TimeConverterConstants.HOUR_DEF_TIME.substring(lDivMod);
		}

		lResult=lFirstRowVal+TimeConverterConstants.NEW_LINE_PARAM+lSecondRowVal;
		return lResult;
	}


	/**
	 * @param pInputTime
	 * @return
	 * Generates minutes time indicator value of Berlin clock based on minutes component in input time
	 */
	public String generateMinutesTime(String pInputTime)
	{
		String lMinutesTime=null;
		int lMinutesTimeInt=0;
		int lDivResult=0;
		int lDivMod=0;
		String lResult=TimeConverterConstants.BLANK_STRING;
		String lFirstRowVal=TimeConverterConstants.MINUTE_DEFTIME_1ST_ROW;
		String lSecondRowVal=TimeConverterConstants.MINUTE_DEFTIME_2ND_ROW;
		lMinutesTime=pInputTime.substring(3,5);
		lMinutesTimeInt=Integer.parseInt(lMinutesTime);
		lDivResult=lMinutesTimeInt/5;
		lDivMod=lMinutesTimeInt%5;
		if(lDivResult>0)
		{
			lFirstRowVal=TimeConverterConstants.MINUTE_MAXTIME_1ST_ROW.substring(0,lDivResult);
			if(lDivResult<11)
				lFirstRowVal=lFirstRowVal+TimeConverterConstants.MINUTE_DEFTIME_1ST_ROW.substring(lDivResult);
		} 
		if(lDivMod>0) {
			lSecondRowVal=TimeConverterConstants.MINUTE_MAXTIME_2ND_ROW.substring(0,lDivMod);
			if(lDivMod<4)
				lSecondRowVal=lSecondRowVal+TimeConverterConstants.MINUTE_DEFTIME_2ND_ROW.substring(lDivMod);
		}

		lResult=lFirstRowVal+TimeConverterConstants.NEW_LINE_PARAM+lSecondRowVal;
		return lResult;
	}

}
