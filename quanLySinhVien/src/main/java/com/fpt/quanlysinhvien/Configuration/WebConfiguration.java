package com.fpt.quanlysinhvien.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.resource.PathResourceResolver;
import org.springframework.web.servlet.view.BeanNameViewResolver;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

@Configuration
public class WebConfiguration implements WebMvcConfigurer {
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
    }

    @Bean
    public ViewResolver viewResolver() {
        System.out.println("init view resolver");
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setViewClass(JstlView.class);
        internalResourceViewResolver.setPrefix("/WEB-INF/view/");
        internalResourceViewResolver.setSuffix(".jsp");
        internalResourceViewResolver.setOrder(2);
        return internalResourceViewResolver;
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/resources/**").addResourceLocations("/", "/resources/")
                .setCachePeriod(3000)
                .resourceChain(true)
                .addResolver(new PathResourceResolver());
    }
    @Bean
    public BeanNameViewResolver beanNameViewResolver() {
        BeanNameViewResolver beanNameViewResolver = new BeanNameViewResolver();
        beanNameViewResolver.setOrder(1);
        return beanNameViewResolver;
    }
    @Bean("studentDao")
    public StudentDao initStudentDao() {
        StudentDao studentDao = new StudentDao();
        return studentDao;
    }
}
