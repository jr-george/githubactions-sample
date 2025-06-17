import model.Greeting;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Greeting myGreeting = new Greeting();
        String greeting;
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = sc.nextLine();

        if (LocalDateTime.now().getHour()<12){
            greeting="Good Morning";
        }
        else{
            greeting="Good Afternoon";
        }

        myGreeting.setName(name);
        myGreeting.setMessage(greeting);
        System.out.println(myGreeting.getGreeting());
    }
}
