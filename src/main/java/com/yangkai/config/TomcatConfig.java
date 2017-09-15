package com.yangkai.config;

//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
//import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;

//import java.nio.charset.Charset;


/**
 * Created by yangkai on 2017-09-14.
 */
//@Configuration
public class TomcatConfig {
    /**
     * 这里可以通过@Value注解导入application.yml里面的配置
     */
//    @Value(value = "${mytomcat.server.port:2222}")
//    private int port;
//    @Value(value = "${mytomcat.tomcat.uri-encoding:UTF-8}")
//    private String uriEncoding;
//    @Value(value = "${mytomcat.tomcat.protocol:HTTP/1.1}")
//    private String protocol;
//    @Value(value = "${mytomcat.tomcat.max-threads:100}")
//    private int maxThreads;
//    @Value(value = "${mytomcat.tomcat.contextPath:/spring_test}")
//    private String contextPath;
//
//    /**
//     * tomcat配置
//     * @return
//     */
//    @Bean
//    public EmbeddedServletContainerFactory tomcatContainer(){
//        System.out.println("tomcatConfig配置：port==>"+port+" uri-encoding==>"+uriEncoding+" max_threads==>"+maxThreads);
//        TomcatEmbeddedServletContainerFactory tomcat = new TomcatEmbeddedServletContainerFactory();
//        tomcat.setUriEncoding(Charset.forName(uriEncoding));//编码
//        tomcat.setProtocol(protocol);//
//        tomcat.setContextPath(contextPath);//访问初始路径
//        tomcat.setPort(port);//访问端口号
//        return tomcat;
//    }
}
