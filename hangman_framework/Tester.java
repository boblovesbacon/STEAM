import java.util.Scanner;

public class Tester{

    public static void main(String [] args){
        System.out.println("Enter the word to guess");
        Scanner scan = new Scanner(System.in);
        String inputWord = scan.nextLine();

        String lettersGuessed= "";
        Board board = new Board(inputWord);

        String input;

        boolean correct = false;
        
        while (board.getLives() > 0)  /* FIX THIS WHILE LOOP CONDITION */
        {
           if(board.allLettersFilled() == true)
           {
            break;
            } 
        
       int remaining_lives = board.getLives();
                if(remaining_lives == 6)
                {
                        System.out.println(Hangman.base());
                }
                
                else if(remaining_lives == 5)
                {
                        System.out.println(Hangman.strikeOne());
                }
                else if (remaining_lives == 4)
                {
                        System.out.println(Hangman.strikeTwo());
                }

                else if (remaining_lives == 3)
                {
                        System.out.println(Hangman.strikeThree());
                }
                
                else if (remaining_lives == 2)
                {
                        System.out.println(Hangman.strikeFour());
                }
                else if (remaining_lives == 1)
                {
                        System.out.println(Hangman.strikeFive());
                }
            /**
             *
             *
             * ENTER YOUR CODE HERE
             *
             */

            if(!board.getIncorrectGuesses().equals("\n")){
                System.out.println("Letters Guessed: " + board.getIncorrectGuesses());
            }

            System.out.println(board.toString());
            System.out.println("Enter your guess");

            input = scan.nextLine();
            input = input.substring(0,1);

            correct = board.setMove(input);
            board.updateNumberOfLives(correct);
            

            if(!correct){
                lettersGuessed += input + " ";
           }
        }


        if(!correct){
            System.out.println(Hangman.strikeSix());
        }
        else{
            System.out.println(board.toString());
            System.out.println("VICTORY!");
        }
    }
}
