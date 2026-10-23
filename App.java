import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello user");
        Scanner gameinput = new Scanner (System.in);
       
        System.out.println(" What game do you want to play?");
        System.out.println("Rocks,paper,scissor");
        System.out.println ("Number Guessing");
        System.out.println ("Choose 1,2,3");
        String choice = gameinput.nextLine();

        if (choice.equals ("1")) { 
             RPS.play();
             }
       else if (choice.equals ("2")){
         number_guessing.play(gameinput);
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
