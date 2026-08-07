//package com.api.parking_control.configs;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.format.annotation.DateTimeFormat;
//import tools.jackson.databind.ObjectMapper;
//import tools.jackson.databind.ext.javatime.ser.LocalDateTimeSerializer;
//
//@Configuration
//public class DateConfig {
//    public static final String DATETIME_FORMAT = "dd/MM/yyyy HH:mm:ss";
//    public static final LocalDateTimeSerializer LOCAL_DATE_TIME_SERIALIZER = new LocalDateTimeSerializer(DateTimeFormat.ofPattern(DATETIME_FORMAT));
//
//    @Bean
//    @Primary
//    public ObjectMapper objectMapper() {
//        JavaTimeModule module = new JavaTimeModule();
//        module.addSerializer(LOCAL_DATE_TIME_SERIALIZER);
//        return new ObjectMapper()
//                .registeredModules(module);
//
//    }
//}
