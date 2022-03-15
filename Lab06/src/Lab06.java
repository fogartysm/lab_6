/**********************************
 *  Written by: Shawn Fogarty     *
 *  Written on: 14 Mar 2022       *
 *  Class: COP3502C               *
 *  Professor: Amanpreet Kapoor   *
 *  Purpose: Lab 6 Software Eng.  *
 **********************************/

import java.util.Random;

public class Lab06
{
    public static void main(String[] args)
    {
        //generating 2 random numbers and subtract them
        Random random = new Random();
        int a = random.nextInt(100);
        int b = random.nextInt(100);

        System.out.println(a + " - " + b + " = " + (a - b));

    }
}
