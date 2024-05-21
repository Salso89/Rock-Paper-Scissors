import java.util.Scanner;

public class Player {

    private String name;
    private int counter;
    Scanner user_input = new Scanner(System.in);

    public void setNameFromInput(){
        System.out.println("Please enter your name");
        this.name = user_input.next();
    }

    public void setCounterFromInput(){
        System.out.println("How many games do you wish to play "+ name+"?");
        this.counter = user_input.nextInt();
    }

    public String getName (){
        return name;
    }

    public int getCounter (){
        return counter;
    }

}
