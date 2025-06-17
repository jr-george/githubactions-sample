package model;

public class Greeting {
    private String name;
    private String message;

    public void setName(String name) {
        this.name = name;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getGreeting() {
        return message +", " + name;
    }
}
