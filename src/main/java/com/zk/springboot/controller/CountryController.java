package com.zk.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * @author zpf
 * @date 2019/1/11 16:09
 */
@RestController
@RequestMapping(path = "/country")
public class CountryController {
    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @RequestMapping(path = "/name", method = RequestMethod.POST)
    public void query(@RequestParam String city) {

    }


}
