package com.biubiu.feign;

import org.springframework.stereotype.Component;

/**
 * @author 张海彪
 * @create 2018-03-24 下午12:55
 */
@Component
public class ScheduleServiceHiHystrix implements ScheduleServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry " + name;
    }
}
