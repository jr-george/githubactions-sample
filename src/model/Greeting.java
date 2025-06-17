package model;

public class Greeting {
    private String name;
    private String message;
    private String currentTime;

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    public String getGreeting() {
        return message +", " + name + " the current time is " + currentTime;
    }
}
