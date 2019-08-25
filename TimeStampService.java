package com.jwt.service;

import java.util.List;

import com.jwt.model.TimeStamp;

public interface TimeStampService {
	
	public void addTimeStamp(TimeStamp timestamp);

	public void deleteAllTimeStamp();
	
	public List<TimeStamp> getAllTimeStamp();

}
