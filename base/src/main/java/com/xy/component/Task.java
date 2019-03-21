package com.xy.component;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Task {
	
	@Scheduled(fixedRate = 5000)
	public void taak() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E").format(new Date()));
	}
}
