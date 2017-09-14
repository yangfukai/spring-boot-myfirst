package com.yangkai.config;

import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by yangkai on 2017-09-14.
 */
@Configuration
public class MyConfig {
    private int tomcat_port = 2223;
    @Bean
    public EmbeddedServletContainerFactory servletContainer(){
        return new TomcatEmbeddedServletContainerFactory(this.tomcat_port);
    }
}
