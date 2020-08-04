package com.drips.consul;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author lijb
 */
@SpringBootApplication
public class ConsulServerApplication {

    public static void main(String[] args){
        new SpringApplicationBuilder(ConsulServerApplication.class)
                .web(true)
                .run(args);
    }

}
