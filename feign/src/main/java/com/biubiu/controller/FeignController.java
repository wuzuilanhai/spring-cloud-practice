package com.biubiu.controller;

import com.biubiu.feign.ScheduleServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 张海彪
 * @create 2018-03-24 下午12:29
 */
@RestController
public class FeignController {

    @Autowired
    private ScheduleServiceHi scheduleServiceHi;

    @GetMapping("/hi")
    public String sayHi(@RequestParam String name) {
        return scheduleServiceHi.sayHiFromClientOne(name);
    }

}
