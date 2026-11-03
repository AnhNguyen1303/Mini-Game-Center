import java.util.Scanner;
public class RPS {
    public static void play (Scanner input) { 
         String play_again = "yes";
        while (play_again.equals("yes")) {
        System.out.println ("Welcome to Rock Paper Scissors!");
        System.out.println ("Enter rock,paper,scissor");
        String user = input.nextLine().trim().toLowerCase(); // trim and convert to Lowercase so accidentally spacing wont make the input invalid
        int word_length = user.length();
        System.out.println("Did you know that your word contains "+ word_length + " letters?");
        String [] choices = {"rock","paper","scissor"}; // AI helped me with creating this choice list
        String computer = choices[(int)(Math.random() * choices.length)]; // choice.length allows this list to be able to work for a bigger list or any type of list that has different amounts
        String first_letter = computer.substring (0,1).toUpperCase();
        String rest = computer.substring (1).toLowerCase();
        System.out.println ("Computer chose: "+ first_letter +rest);
       
     
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
        play_again = input.nextLine().trim().toLowerCase();
    }
    System.out.println ("Thanks for playing");

}
}