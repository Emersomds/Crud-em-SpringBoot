package wm.projetos.Wm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EntityScan(basePackages = "wm.projetos.Model")
@ComponentScan(basePackages = {"wm.*"})
@EnableJpaRepositories(basePackages= {"wm.projetos.Repository"})
@EnableTransactionManagement
public class WmApplication {

	public static void main(String[] args) {
		SpringApplication.run(WmApplication.class, args);
	}

}
