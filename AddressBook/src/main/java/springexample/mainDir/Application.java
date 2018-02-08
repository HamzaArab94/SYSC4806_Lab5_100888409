package springexample.mainDir;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



/**
 * Created by hamzaarab on 2/8/2018.
 */

@SpringBootApplication
public class Application {
    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {

        SpringApplication.run(Application.class,args);
    }

    @Bean
    public CommandLineRunner demo(BuddyInfoRepository repository) {
        return (args) -> {
            // save a couple of customers
            repository.save(new BuddyInfo("Hersi", "954382"));
            repository.save(new BuddyInfo("Asma", "137324"));
            repository.save(new BuddyInfo("Mariam", "183625"));
            repository.save(new BuddyInfo("Biftu", "594624"));
            repository.save(new BuddyInfo("Aqeel", "484404"));

            // fetch all customers
            log.info("Customers found with findAll():");
            log.info("-------------------------------");
            for (BuddyInfo buddy : repository.findAll()) {
                log.info(BuddyInfo.class.getName());
            }
            log.info("");

            // fetch an individual customer by ID
            BuddyInfo customer = repository.findOne("954382");
            log.info("Customer found with findOne(1L):");
            log.info("--------------------------------");
            log.info(customer.toString());
            log.info("");

        };
    }
}
