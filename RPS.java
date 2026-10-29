import java.util.Scanner;
public class RPS {
    public static void play (Scanner input) { 
         String play_again = "yes";
        while (play_again.equals("yes")) {
        System.out.println ("Rock Paper Scissors played");
        System.out.println ("Enter rock,paper,scissor");
        String user = input.nextLine().toLowerCase();
        String [] choices = {"rock","paper","scissor"}; // AI helped me with creating this choice list
        String computer = choices[(int)(Math.random() * choices.length)];
        System.out.println ("Computer chose: "+ computer);
       
     
        if(user.equals (computer)) {
            System.out.println ("That is a tie!");
        }
        else if ((user.equals ("rock")&& computer.equals ("scissor"))||
    (user.equals ("paper")&& computer.equals ("rock"))||
(user.equals ("scissor")&& computer.equals ("paper"))){
        System.out.println("You won");
}
        else if (user.equals("rock") || user.equals("paper") ||
user.equals("scissor")) {
            System.out.println("You lose!");
        }
        else {
            System.out.println("Invalid input");
        }
        System.out.println ("Play again? " );
        play_again = input.nextLine().toLowerCase();
    }
    System.out.println ("Thanks for playing");

}
}