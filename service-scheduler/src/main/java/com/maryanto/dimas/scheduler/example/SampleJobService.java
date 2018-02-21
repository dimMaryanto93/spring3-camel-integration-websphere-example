package com.maryanto.dimas.scheduler.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SampleJobService {

    private final static Logger console = LoggerFactory.getLogger(SampleJobService.class);

    public String messageInfo() {
        console.info("scheduler execution... at {}", new Date());
        return "message java version 1.8";
    }

}
