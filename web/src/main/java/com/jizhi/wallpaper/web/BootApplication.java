package com.jizhi.wallpaper.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.jizhi.wallpaper"})
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class);
    }
}
