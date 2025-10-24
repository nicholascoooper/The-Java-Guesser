import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Guesser{
	public static void main(String[] arg){
		new Guesser();
	}//end main
	public Guesser(){
		boolean keepGoing = true;
		while (keepGoing){
  			System.out.println("Please select your gametype\n0) exit\n1) Human Guesser\n2) Computer Guesser");
                        Scanner input = new Scanner(System.in);
                        int intgame = input.nextInt();
                        if (intgame == 0){
                        	keepGoing = false;
                         }else if (intgame == 1){
                                int randomint = (int)(Math.random() * 100) + 1;
                                boolean keepGoinghuman = true;
                                while (keepGoinghuman){
                                	System.out.println("Enter your guess");
                                        int humanguess = input.nextInt();
                                        	if (humanguess < randomint){
                                                	System.out.println("too low");
                                                  } else if (humanguess > randomint){
                                                          System.out.println("too high");
                                                  }else{
                                                          System.out.println("YOu GOT IT");
                                                          keepGoinghuman = false;
                                                  }       
                                }
                          	}else if (intgame == 2){
					boolean keepGoingComp = true;
			  		int computerNum = 50;
					int mathNum = 25;
					while (keepGoingComp){
                          			System.out.println("Is your number " + computerNum + "\n(H)igh (L)ow (C)orrect");
			  			String letter = (input.nextLine()).toUpperCase();
			  			if (letter.equals("H")){
							computerNum = (int)Math.round(computerNum-mathNum);
							mathNum = (int)Math.round(mathNum/2);
							if (mathNum < 1){
								mathNum = 1;
							}
						}else if (letter.equals("L")){
							computerNum = (int)Math.round(computerNum+mathNum);
							mathNum = (int)Math.round(mathNum/2);
							if (mathNum < 1){
								mathNum = 1;
							}
						}else if (letter.equals("C")){
							System.out.println("YEEEESSSSS I GOT IT");
							keepGoingComp = false;
						}else{
							System.out.println("Please enter a valid letter");
						}//end if computer guess
					}//end keepGoingComp	
                          	}else{                   
                                	System.out.println("please input valid number");
                          	}//end game selector else
                  }//end while
	}//end guesser
}//end class
