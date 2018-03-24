package com.biubiu.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author 张海彪
 * @create 2018-03-24 下午12:27
 */
@FeignClient(value = "eureka-client", fallback = ScheduleServiceHiHystrix.class)
public interface ScheduleServiceHi {
    @GetMapping(value = "/client")
    String sayHiFromClientOne(@RequestParam("name") String name);
}
