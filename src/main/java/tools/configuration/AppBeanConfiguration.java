package tools.configuration;

import javax.annotation.Resource;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

@Configuration
public class AppBeanConfiguration {
	
	@Resource
	private Environment env;
	
	
}
