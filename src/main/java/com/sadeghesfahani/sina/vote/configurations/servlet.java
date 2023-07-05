package com.sadeghesfahani.sina.vote.configurations;

import com.networknt.handler.OrchestrationHandler;
import com.sadeghesfahani.sina.vote.user.controllers.UserController;
import io.undertow.servlet.api.DeploymentInfo;
import org.springframework.boot.web.embedded.undertow.UndertowDeploymentInfoCustomizer;
import org.springframework.boot.web.embedded.undertow.UndertowServletWebServerFactory;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.networknt.handler.Handler;

@Configuration
public class servlet {

    @Bean
    public ServletRegistrationBean<UserController> exampleServletBean() {
        ServletRegistrationBean<UserController> bean = new ServletRegistrationBean<>(
                new UserController(), "/user/*");
        bean.setLoadOnStartup(1);
        return bean;
    }

//    @Bean
//    UndertowServletWebServerFactory embeddedServletContainerFactory() {
//        UndertowServletWebServerFactory factory = new UndertowServletWebServerFactory();
//        factory.addDeploymentInfoCustomizers(new UndertowDeploymentInfoCustomizer() {
//            @Override
//            public void customize(DeploymentInfo deploymentInfo) {
//                Handler.init();
//                deploymentInfo.addInitialHandlerChainWrapper(OrchestrationHandler::new);
//            }
//        });
//        return factory;
//    }
}
