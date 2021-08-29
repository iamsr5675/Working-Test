package co.bridgelabz.Working;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Working 
{
	public static void main(String[] args)
    {
       long st=0;
       long sp=0;
       long time=0;

       Scanner sc = new Scanner(System.in);
      System.out.println("Press 0 to start time");
      int n = sc.nextInt();
      if( n == 0 )
         { 
             st = System.currentTimeMillis();
         }
       System.out.println("Press 1 to stop time");
       int m=sc.nextInt();
       if( m == 1 )
         { 
             sp = System.currentTimeMillis();
         }
     
       System.out.println("Time duration between start and stop");
         time = ( sp - st ) / 1000;
       System.out.println(time+" is seconds");
     

       }
}