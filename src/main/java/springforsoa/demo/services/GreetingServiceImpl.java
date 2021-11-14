package springforsoa.demo.services;

import org.springframework.stereotype.Service;
import springforsoa.demo.entities.Greeting;

import java.util.List;

@Service
public class GreetingServiceImpl implements GreetingService{

    @Override
    public void create(Greeting greeting) {

    }

    @Override
    public Greeting read(int id) {
        return new Greeting("Hi", "New");
    }


    @Override
    public boolean delete(int id) {
        return false;
    }


    @Override
    public boolean update(Greeting greeting, int id) {
        return false;
    }

    @Override
    public List<Greeting> readAll() {
        return null;
    }
}
