package maxwell.springbootvuelast;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringbootVueLastApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootVueLastApplication.class, args);
        
    }

}
