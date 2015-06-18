import java.util.Scanner;

public class Decoding{

        public static void main(String [] args){
            Scanner scan = new Scanner(System.in);
            String input = scan.nextLine();
            String output = "";
            String currLetter = ""; 
            int i = 0;
            while(i<input.length()){
               
                currLetter += input.substring(i, i+1); 
                i++;
                if(currLetter.length() == 5){  
                    if(currLetter.equals("00000")){
                        output  += "E";
                    }
                    else if(currLetter.equals("00001")){
                        output += "T";
                    }
                    
                    else if(currLetter.equals("00010")){
                        output += "A";
                    }

                    else if(currLetter.equals("00011")){
                        output += "O";
                    }

                    else if(currLetter.equals("00100")){
                        output += "I``";
                    }   
                    else if(currLetter.equals("00101")){
                        output += "N";
                    }   
                    else if(currLetter.equals("00110")){
                        output += "S";
                    }   
                    else if(currLetter.equals("00111")){
                        output += "R";
                    }   
                    else if(currLetter.equals("01000")){
                        output += "H";
                    }   
                    else if(currLetter.equals("01001")){
                        output += "D";
                    }   
                    else if(currLetter.equals("01010")){
                        output += "L";
                    }   
                    else if(currLetter.equals("01011")){
                        output += "U";
                    }   
                    else if(currLetter.equals("01100")){
                        output += "C";
                    }   
                    else if(currLetter.equals("01101")){
                        output += "M";
                    }   
                    else if(currLetter.equals("01110")){
                        output += "F";
                    }   
                    else if(currLetter.equals("01111")){
                        output += "Y";
                    }   
                    else if(currLetter.equals("10000")){
                        output += "W";
                    }   
                    else if(currLetter.equals("10001")){
                        output += "G";
                    }   
                    else if(currLetter.equals("10010")){
                        output += "P";
                    }   
                    else if(currLetter.equals("10011")){
                        output += "B";
                    }   
                    else if(currLetter.equals("10100")){
                        output += "V";
                    }   
                    else if(currLetter.equals("10101")){
                        output += "K";
                    }   
                    else if(currLetter.equals("10110")){
                        output += "X";
                    }   
                    else if(currLetter.equals("10111")){
                        output += "Q";
                    }   
                    else if(currLetter.equals("11000")){
                        output += "J";
                    }   
                    else if(currLetter.equals("11001")){
                        output += "Z";
                    }   
                    else if(currLetter.equals("11010")){
                        output += " ";
                    }
                 currLetter = "";   
                }



            }


        System.out.println("Output: "+ output);

    }
           
}
