package com.jwt.dao;

import com.jwt.model.TimeStamp;

public interface TimeStampDAO {
	
	public void addTimeStamp(TimeStamp timestamp);

	public void deleteAllTimeStamp();

}
