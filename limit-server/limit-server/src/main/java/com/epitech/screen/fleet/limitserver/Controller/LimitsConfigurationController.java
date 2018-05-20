package com.epitech.screen.fleet.limitserver.Controller;

import com.epitech.screen.fleet.limitserver.Model.Configuration;
import com.epitech.screen.fleet.limitserver.Model.LimitConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitsConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limit-service")
    public LimitConfiguration retriveLimitFromConfiguration(){
        return new LimitConfiguration(configuration.getMinimum(),configuration.getMaximum());
    }
}
