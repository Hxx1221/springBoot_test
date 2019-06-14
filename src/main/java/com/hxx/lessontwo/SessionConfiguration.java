package com.hxx.lessontwo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class SessionConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
     //   super.addInterceptors(registry);
        registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**");
    }
}