package bt.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@ComponentScan
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BtApplication extends SpringBootServletInitializer {

//	public static void main(String[] args) {
//		SpringApplication.run(BtApplication.class, args);
//	}
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(BtApplication.class);
		application.run(args);
	}

	@Override // 为了打包springboot项目
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}

}
