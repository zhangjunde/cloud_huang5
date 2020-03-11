package com.iotek.histrixdashboard;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;

@EnableHystrixDashboard
@SpringCloudApplication
public class HistrixDashboardApplication {

    public static void main(String[] args) {
        SpringApplication.run(HistrixDashboardApplication.class, args);
    }
    @Bean
    public ServletRegistrationBean getServlet(){
        HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
        ServletRegistrationBean registrationBean = new ServletRegistrationBean(streamServlet);
        registrationBean.setLoadOnStartup(1);
//        registrationBean.addUrlMappings("/actuator/hystrix.stream");  // 这里指定的urlMapping 就是我们在仪表盘中monitor Stream 的地址后缀
        registrationBean.addUrlMappings("/test/hystrix.stream");
        registrationBean.setName("HystrixMetricsStreamServlet");
        return registrationBean;
    }
}
