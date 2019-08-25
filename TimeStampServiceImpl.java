package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.TimeStampDAO;
import com.jwt.model.TimeStamp;

@Service
@Transactional
public class TimeStampServiceImpl implements TimeStampService {

	@Autowired
	private TimeStampDAO timeStampDAO;

		

	@Override
	@Transactional
	public void addTimeStamp(TimeStamp timestamp) {
		timeStampDAO.addTimeStamp(timestamp);
		
	}
	
	@Override
	@Transactional
	public void deleteAllTimeStamp() {
		timeStampDAO.deleteAllTimeStamp();
	}

	@Override
	public List<TimeStamp> getAllTimeStamp() {
		// TODO Auto-generated method stub
		return null;
	}


}
