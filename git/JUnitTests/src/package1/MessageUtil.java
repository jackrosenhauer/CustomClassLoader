package package1;

/**
 * Created by jack on 2/12/14.
 */

/*
* This class prints the given message on console.
*/
public class MessageUtil {

    private String message;

    //Constructor
    //@param message to be printed
    public MessageUtil(String message){
        this.message = message;
    }

    public MessageUtil(){
        System.out.println("OMGOMGOMG");
    }

    // prints the message
    public String printMessage(){
        System.out.println(message);
        return message;
    }

    public static void main(String[] args){
        System.out.println("Some random string... duh");
    }
}
