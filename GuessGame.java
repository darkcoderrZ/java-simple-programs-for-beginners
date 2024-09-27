import java.util.Random;
import java.util.Scanner;
class Game
    {
       private int noOfGuesses=0;
       public int guessedno;
       public int randomNumber;
        public void setguess(){
            noOfGuesses++;
        }
        public int getguess(){
           return noOfGuesses;
        }
         public Game()
        {
            Random rc=new Random();
            randomNumber=rc.nextInt(100);
          
        }
        public void takeUserInput()
        {
                Scanner sc = new Scanner(System.in);
                guessedno=sc.nextInt();
        }
        public boolean isCorrectNumber()
        {
            if(guessedno==randomNumber){
                return false;
            }
            else{
                return true;
            }
        }
    }
public class GuessGame
{
	public static void main(String[] args) {
		Game gc=new Game();
		gc.takeUserInput();
		gc.setguess();
		while(gc.isCorrectNumber()){
		    if(gc.guessedno>gc.randomNumber){
		        System.out.println("guessed too high");
		    }
		    else if(gc.guessedno<gc.randomNumber){
		        System.out.println("guessed too low");
		    }
		    gc.takeUserInput();
		    gc.setguess();
		}
		System.out.println("you win no of guesses taken by you are "+gc.getguess());
		
	}
}
