package com.mu.boot.configswitch;

import com.mu.boot.configswitch.enable.EnableLog;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableLog
public class ConfigSwitchApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigSwitchApplication.class, args);
    }

}
