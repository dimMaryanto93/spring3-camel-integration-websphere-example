package com.maryanto.dimas.scheduler.example;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService extends RouteBuilder {

    @Override
    public void configure() throws Exception {

        from("quartz://myGroupName/myTimerName?cron=0/5+*+*+*+*+?")
                .process(new Processor() {
                    @Override
                    public void process(Exchange exchange) throws Exception {
                        System.out.println("I'm running every 5 sec...");
                    }
                });
    }
}
