package com.company;

import java.util.Date;

public class N003_Largest_Prime_Factor {
    /*The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?*/
    public void run(){
        long num = 600851475143L;

        Date start = new Date();
        long main =  largestPrimeFactor(num);
        Date end = new Date();
        long result = end.getTime()-start.getTime();
        System.out.println("LargestPrimeFactor: " +main + " Time taken: "+result);

        Date start1 = new Date();
        long alt =  alternative(num);
        Date end1 = new Date();
        long result1 = end1.getTime()-start1.getTime();
        System.out.println("LargestPrimeFactor Alt: "+alt+ " Time taken: "+result1);
    }

    //about half the iterations used by the alternative method
    public long largestPrimeFactor(long number){
        long max = -1;
        //long iterations=0;

        //reduce using 2's
        while(number%2==0){
            //iterations++;
            max = 2;
            number/=2;

        }

        // go only up to square root of number because factors then alternate ex. 5*4 -> 4*5
        for(long i =3; i < (long)Math.sqrt(number); i+=2){ // increment by odd numbers

            while(number%i==0){ //reduce by odd number until eliminated
                max=i;
                number/=i;
                //iterations++;
            }
           // iterations++;
        }
        if(number>2){ //switch  if greater than 2
            max = number;
        }
        //System.out.println("iterations: "+iterations);
        return max;

    }

    //simpler alternative method
    long alternative(long number){
        //long iterations=0;
        long f = 2;
        while (f*f <= number){
            //iterations++;
            if(number%f==0){
                number/=f;
            }else{
                f++;
            }
        }
       // System.out.println("iterations: "+iterations);
        return number;
    }



}
