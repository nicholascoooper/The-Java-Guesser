import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class Guesser{
	public static void main(String[] arg){
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
			keepGoing = false;	
			}else{
				System.out.println("please input valid number");
			}
		}//end while
	}//end main
	public Guesser(){
	  8                 while (keepGoing){
  9                         System.out.println("Please select your gametype\n0) exit\n1) Human Guesser\n2) Computer Guesser");
 10                         Scanner input = new Scanner(System.in);
 11                         int intgame = input.nextInt();
 12                         if (intgame == 0){
 13                                 keepGoing = false;
 14                         }else if (intgame == 1){
 15                                 int randomint = (int)(Math.random() * 100) + 1;
 16                                 boolean keepGoinghuman = true;
 17                                 while (keepGoinghuman){
 18                                         System.out.println("Enter your guess");
 19                                         int humanguess = input.nextInt();
 20                                                 if (humanguess < randomint){
 21                                                         System.out.println("too low");
 22                                                 } else if (humanguess > randomint){
 23                                                         System.out.println("too high");
 24                                                 }else{
 25                                                         System.out.println("YOu GOT IT");
 26                                                         keepGoinghuman = false;
 27                                                 }       
 28                                 }
 29                         }else if (intgame == 2){        
 30                         keepGoing = false;
 31                         }else{                   
 32                                 System.out.println("please input valid number");
 33                         }
 34                 }//end while
}//end guesser
