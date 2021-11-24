import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello human! I'm an AI"); 

        Scanner myObj = new Scanner(System.in);
        System.out.println("Whats your name?");
        String userName = myObj.nextLine();
 
        System.out.println("Good morning! " + userName); 
    }
}