package com.devsuperior.bds03.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@Configuration
@EnableResourceServer
<<<<<<< HEAD
public class ResourceServerConfig extends ResourceServerConfigurerAdapter{
	
=======
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	@Autowired
	private Environment env;
	
	@Autowired
	private JwtTokenStore tokenStore;
	
	private static final String[] PUBLIC = { "/oauth/token", "/h2-console/**" };
	
<<<<<<< HEAD
	private static final String[] OPERATOR_GET = { "/departments**", "/employees/**" };
=======
	private static final String[] OPERATOR_GET = { "/departments/**", "/employees/**" };
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
	
	@Override
	public void configure(ResourceServerSecurityConfigurer resources) throws Exception {
		resources.tokenStore(tokenStore);
	}

	@Override
	public void configure(HttpSecurity http) throws Exception {
<<<<<<< HEAD
		
		//H2
=======

		// H2
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
		if (Arrays.asList(env.getActiveProfiles()).contains("test")) {
			http.headers().frameOptions().disable();
		}
		
		http.authorizeRequests()
		.antMatchers(PUBLIC).permitAll()
		.antMatchers(HttpMethod.GET, OPERATOR_GET).hasAnyRole("OPERATOR", "ADMIN")
		.anyRequest().hasAnyRole("ADMIN");
<<<<<<< HEAD
	}
	
	
=======
	}	
>>>>>>> e86b783781f59ad361e28764d7ea73cc3d8a2ed1
}
