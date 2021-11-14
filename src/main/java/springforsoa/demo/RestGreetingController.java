package springforsoa.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springforsoa.demo.entities.Greeting;
import springforsoa.demo.services.GreetingService;

@RestController
public class RestGreetingController {

    private final GreetingService greetingService;

    @Autowired
    public RestGreetingController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping(value = "/restgreeting")
    public ResponseEntity<Greeting> read() {
        final Greeting greeting = greetingService.read(1);

        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

}
