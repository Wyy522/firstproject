package com.ease.archiecture.springannotation;


import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = "com.ease.archiecture.springannotation")
@PropertySource("classpath:mysql.properties")
public class BeanConfig {


    @Bean
    public Person person() {
        Person bcd = new Person();
        bcd.setName("bcd");
        return bcd;
    }
}
