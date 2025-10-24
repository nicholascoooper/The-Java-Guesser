import:
java.util.*
java.util.Random
java.util.Scanner

public class Guesser
    public static void main stringarg[]{
        new Guesser

    public Guesser{
        bool keepgoing
        while keepgoing
            output(what game type 0 1 2)
            int input 0 1 2
            if 0
                quit
                keepgoing = false
            else if 1    
                int compnum = math.random
                bool keepgoinghumanguess
                while keepgoinghumanguess
                    out "enter number"
                    input int humanguess
                    if humanguess < compnum
                        out "too low"
                    else if humanguess > compnum
                        out "too high"
                    else
                    out "you got it"
                    keepgoinghumanguess = false
            else if 2
                compguess = 50;
                mathnum = 25;
                bool keepgoingcompguess  
                while keepgoingcompguess
                    output is your number compguess\n (H)igh (L)ow (C)orrect
                    input letter 
                    if letter.equals h
                        compguess - mathnum
                        mathnum/2
                    else if letter.equals l
                        compguess + mathnum
                        mathnum/2
                    else if letter.equals c
                        output "yess I got it"
                        keepgoingcompguess = false
                    else
                        output "enetr valid letter"
            else 
                output "please enter valid number"
