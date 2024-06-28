package org.example.smarthospital_back;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        // 配置外部文件夹为静态资源路径
        registry.addResourceHandler("/mappic/**")
                .addResourceLocations("file:/home/newtest/mappic/");
    }
}

