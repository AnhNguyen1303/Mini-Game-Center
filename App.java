import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello user");
        Scanner gameinput = new Scanner (System.in);
       
        System.out.println(" What game do you want?");
        System.out.println("Hangman");
        System.out.println ("Wordle");
        System.out.println ("Choose 1,2,3");
        String choice = gameinput.nextLine();

        if (choice.equals ("1")) { 
             Hangman.play();
             }
       else if (choice.equals ("2")){
             Wordle.play(); 
             }
        else if (choice.equals("3")){
            System.out.println ("GoodBye");
        }
        else {
            System.out.println("Invalid");
        }
        gameinput.close();
    
}
}
