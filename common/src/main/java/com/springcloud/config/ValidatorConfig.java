//package com.springcloud.config;
//
//import com.sun.xml.internal.ws.developer.MemberSubmissionAddressing;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import javax.xml.validation.Validator;
//
//
///**
// * 配置hibernate Validator为快速失败返回模式
// * true  快速失败返回模式    false 普通模式（默认）
// * 普通模式(会校验完所有的属性，然后返回所有的验证失败信息)
// * 快速失败返回模式(只要有一个验证失败，则返回)
// *
// * @author zhongyong
// * @date 20181112
// * @since v1.0
// */
//@Configuration
//public class ValidatorConfig {
//    @Bean
//    public Validator validator() {
//        ValidatorFactory validatorFactory = MemberSubmissionAddressing.Validation.byProvider(HibernateValidator.class)
//                .configure()
//                .addProperty("hibernate.validator.fail_fast", "true")
//                .buildValidatorFactory();
//        return validatorFactory.getValidator();
//    }
//}