package ibbl.lu.microservice_lims;

import ibbl.lu.microservice_lims.service.ConrepBoxService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MicroserviceLimsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceLimsApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ConrepBoxService conrepBoxService){
        return args -> {
            System.out.println("-------------------test----------------------");
            conrepBoxService.getAllBoxes().forEach(b ->{
                System.out.println(b.getBarcode());
            });
        };
    }

}
