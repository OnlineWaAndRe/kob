package com.kob.backend.controller.pk;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/pk/")
public class BotInfoController {
    @RequestMapping("getbotinfo/")
    public List<String> getBotInfo(){
        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("word");
        list.add("apple");
        Map<String, String> ha  =  new HashMap<>();

        return list;
    }
}
