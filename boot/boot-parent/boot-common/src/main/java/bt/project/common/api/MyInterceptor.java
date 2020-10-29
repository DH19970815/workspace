package bt.project.common.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MyInterceptor implements WebMvcConfigurer {
	
	@Bean
	public CorsFilter corsFilter() {
		//添加映射路径
		final UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
		//添加Cors配置信息
		final CorsConfiguration corsConfiguration = new CorsConfiguration();
		/* 是否允许发送cookie信息 */
		corsConfiguration.setAllowCredentials(true);
		/* 允许访问的客户端域名 不要写*否则cookie无法使用 */
		corsConfiguration.addAllowedOrigin("*");
		/* 允许服务端访问的客户端请求头 */
		corsConfiguration.addAllowedHeader("*");
		/* 允许访问的方法名,GET POST等 */
		corsConfiguration.addAllowedMethod("*");
		//拦截一切请求
		urlBasedCorsConfigurationSource.registerCorsConfiguration("/**", corsConfiguration);
		//返回新的CorsFilter
		return new CorsFilter(urlBasedCorsConfigurationSource);
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		// TODO Auto-generated method stub
		WebMvcConfigurer.super.addResourceHandlers(registry);
	}


}
