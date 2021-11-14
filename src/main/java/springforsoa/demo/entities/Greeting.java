package springforsoa.demo.entities;

public class Greeting {

    private String name;
    private String greetingWord;

    public void setName(String name) {
        this.name = name;
    }

    public void setGreetingWord(String greetingWord) {
        this.greetingWord = greetingWord;
    }

    public String getName() {
        return name;
    }

    public String getGreetingWord() {
        return greetingWord;
    }

    public Greeting() {};

    public Greeting(String name, String greetingWord) {
        this.name = name;
        this.greetingWord = greetingWord;
    }
}
