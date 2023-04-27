package ApiRest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBD {
    private static final Logger log = LoggerFactory.getLogger(LoadBD.class);

    @Bean
    CommandLineRunner applicationRunner(EmployeeRepository employeerepository){
      return args -> {
          log.info("Log of event save user 1: " + employeerepository.save(new Employee("Maria Silva","Chefe","Avenida silveira dutra 2234" )));
          log.info("Log of event save user 2: " + employeerepository.save(new Employee("Juca Pinto","Mecanico","Marechal rondon 2311" )));
      };
    }
}
