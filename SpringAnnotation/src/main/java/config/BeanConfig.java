package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import container.Address;

@Configuration
public class BeanConfig {
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
}
