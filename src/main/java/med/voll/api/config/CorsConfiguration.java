package med.voll.api.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("moz-extension://b758dab2-d7e9-4362-a78b-d7d2f7fc0d29")
                .allowedMethods("GET", "POST", "PUT", "DELETE");
    }
}
