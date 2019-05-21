/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testran;

import java.util.Scanner;

/**
 *
 * @author Sivagama srinivasan
 */
public class TestCard
{
    public static void main(String args[])
    {
        TestRan[] Hand = new TestRan[7];
        System.out.println(" 7 cards generated: \n");
        
       for(int i=0;i<Hand.length;i++)
       {
        TestRan c1= new TestRan();
        c1.setSuit(TestRan.SUITS[c1.getRandomSuit()]);
        c1.setValue(c1.getRandomValue());
        
        
       }
//input from user lucky card.



if(found)
{
    System.out.println(" your matching card found");
    
}
else
{
    System.out.println(" your matching card not found");
}
}
}
