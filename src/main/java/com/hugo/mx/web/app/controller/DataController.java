package com.hugo.mx.web.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hugo.mx.web.app.data.Record;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/data")
public class DataController {
	
	private final static Logger logger = LoggerFactory.getLogger(DataController.class);

	@RequestMapping(method = RequestMethod.GET)
	public List<Record> getAllData(){
		List<Record> list = new ArrayList<Record>(0);
		
		list.add(new Record(1, "JUGO"));
		list.add(new Record(2, "TOTO"));
		list.add(new Record(3, "TUCAN"));
		
		return list;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public void createDate(@RequestBody Record record){
		logger.info(String.format("RECORD => %s", record.toString()));
	}

	
}
