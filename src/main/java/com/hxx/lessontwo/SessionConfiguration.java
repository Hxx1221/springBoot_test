package com.hxx.lessontwo;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
@Configuration
public class SessionConfiguration extends WebMvcConfigurerAdapter {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
     //   super.addInterceptors(registry);
    //    registry.addInterceptor(new SessionInterceptor()).addPathPatterns("/**").excludePathPatterns("/upLoad","/uploadImg");
       // registry.addInterceptor(new LoggerInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
      //  registry.addResourceHandler("/hxx/**").addResourceLocations("classpath:/static/");
         super.addResourceHandlers(registry);

    }
}