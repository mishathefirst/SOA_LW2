package springforsoa.demo.services;

import springforsoa.demo.entities.Greeting;

import java.util.List;

public interface GreetingService {

    void create(Greeting greeting);

    List<Greeting> readAll();

    Greeting read(int id);

    boolean update(Greeting greeting, int id);

    boolean delete(int id);

}
