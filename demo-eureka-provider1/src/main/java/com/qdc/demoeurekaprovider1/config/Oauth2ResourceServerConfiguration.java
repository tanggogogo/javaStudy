package com.qdc.demoeurekaprovider1.config;

//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
//import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
//import org.springframework.security.oauth2.provider.token.RemoteTokenServices;

//@Configuration
//public class Oauth2ResourceServerConfiguration extends ResourceServerConfigurerAdapter {
//    private static final String URL = "http://localhost:3333/oauth/check_token";
//
//    public void configure(ResourceServerSecurityConfigurer resources) throws Exception{
//        RemoteTokenServices tokenServices = new RemoteTokenServices();
//
//        tokenServices.setCheckTokenEndpointUrl(URL);
//        tokenServices.setClientId("test");
//        tokenServices.setClientSecret("123456");
//
//        resources.tokenServices(tokenServices);
//        resources.resourceId("userall").stateless(true);
//    }
//
//}
