package demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

public class FeignClientConfig {

    @Bean
    public OAuthRequestInterceptor requestInterceptor() {
        return new OAuthRequestInterceptor();
    }

}
