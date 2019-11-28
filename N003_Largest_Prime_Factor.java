package com.company;

import java.sql.Time;
import java.util.Date;
import java.util.Timer;

public class N003_Largest_Prime_Factor {
    /*The prime factors of 13195 are 5, 7, 13 and 29.
    What is the largest prime factor of the number 600851475143 ?
                                                     2147483647*/
    public void run(){
        long num1 = 600851475143L;
        long num2 = 6008514751L;
        long num3 = 139656546;
        Date start1 = new Date();
        //System.out.println(start1.getTime());

        long alt =  alternative(num3);

        Date end1 = new Date();
       // System.out.println(end1.getTime());
        long result1 = end1.getTime()-start1.getTime();
        System.out.println("LargestPrimeFactor Alt: "+alt+ " Time taken: "+result1);
        System.out.println(isPrime(alt));

        Date start2 = new Date();
        long main =  largestPrimeFactor(num3);
        Date end2 = new Date();
        long result2 = end2.getTime()-start2.getTime();



        System.out.println("LargestPrimeFactor: " +main + " Time taken: "+result2);
        System.out.println(isPrime(main));

        Date start3 = new Date();
        long alt2 =  alt2(num3);
        Date end3 = new Date();
        long result3 = end3.getTime()-start3.getTime();



        System.out.println("LargestPrimeFactor: " +alt2 + " Time taken: "+result3);
        System.out.println(isPrime(alt2));


    }
    public long largestPrimeFactor(long number){
        long max = -1;
        long i = 2;
        long limit = number;//(long)Math.sqrt(number);
        while(i<=limit){
            if(number%i==0){
                //limit = limit/i;
              //  i=2;
                   // System.out.println("Factor: "+i+" number/factor: "+number/i);
                    if(isPrime(i)){
                       // System.out.println("Prime: "+i+"number/factor: "+number/i);

                        if(i>max){
                            max = i;
                        }
                    }
                }
            i++;
        }

        return  max;
    }
    public boolean isFactor(long number, long factor){
        if (number%factor==0){
            return true;
        }
        return false;
    }

    public boolean isPrime(long n){

        long i=2;

        while(i<n){
            if(n%i==0){
                return false;
            }
            i++;
        }
        return true;
    }
    long alternative(long number){
        long f = 2;
        while (f*f <= number){
            if(number%f==0){
                System.out.println(number/f);

                number/=f;
            }else{
                f++;
            }
        }
        return number;
    }
  long alt2(long n){
        long maxPrime = -1;
        while(n %2 ==0){
            maxPrime =2;
            n /=2;
        }
        for(int i =3; i <= Math.sqrt(n); i +=2) {
            while(n %i ==0){
                maxPrime = i;
                n = n/i;
            }
        }

        if(n>2) {
            maxPrime = n;
        }
        return maxPrime;
  }


}
