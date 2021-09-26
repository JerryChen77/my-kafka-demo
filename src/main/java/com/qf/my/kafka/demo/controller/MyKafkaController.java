package com.qf.my.kafka.demo.controller;

/**
 * @author Cjl
 * @date 2021/8/24 19:15
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/msg")
public class MyKafkaController {

    private static final String TOPIC_NAME = "my-replicated-topic0";
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    @RequestMapping("/send")
    public String sendMessage(){
        kafkaTemplate.send(TOPIC_NAME,"key1","This is a new message from Jerry!!!");
        return "message sent";
    }



}
