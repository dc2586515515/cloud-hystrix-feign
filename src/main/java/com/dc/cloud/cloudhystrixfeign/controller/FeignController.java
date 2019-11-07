package com.dc.cloud.cloudhystrixfeign.controller;

import com.dc.cloud.cloudhystrixfeign.service.UserFeignHystrixClient;
import com.dc.cloud.cloudhystrixfeign.vo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author DC
 * @Date 2019-11-07
 */
@RestController
public class FeignController {
    @Autowired
    private UserFeignHystrixClient userFeignClient;

    @GetMapping("feign/{id}")
    public User findByIdFeign(@PathVariable Long id) {
        User user = this.userFeignClient.findByIdFeign(id);
        return user;
    }
}
