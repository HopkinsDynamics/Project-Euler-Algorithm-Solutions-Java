package com.company;

public class N001_Multiples_3_and_5 {
    /*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
     Find the sum of all the multiples of 3 or 5 below 1000.*/
    N001_Multiples_3_and_5(){

        // Big -O(n) implementation
        System.out.println("Sum of all the multiples of 3 and 5 below 1000: ");
    }
    public void versionOne(){ //Linear implementation

        int sum = 0;
        int iterations=0;
        for(int i=1; i < 1000; i++){
            if((i % 3 == 0) || (i % 5 == 0)){
                sum+=i;
            }
            iterations++;
        }
        System.out.println("iterations: "+iterations);
        System.out.println(sum);
    }
    public void versionTwo(){ // 1/3 as much iterations but at the cost of 3 times as many if statements

        // Could do a version that counts multiples of 3 or 5 by multiplication but would have to add checks to prevent
        // counting multiples twice such as  3*5 and 5*3 =15
        // I suppose I could just add a statements that skips a count if it is a is a 5



        int threeMult=3;
        int fiveMult;
        int multSums=0;
        int count=0;

        for(int i =1; threeMult < 1000; i++){
            threeMult = 3*i;
            fiveMult = 5*i;
            count++;

            if(threeMult<1000){
                if(threeMult%5!=0){
                    multSums+=threeMult;
                }
            }
            if(fiveMult<1000){
                multSums+=fiveMult;
            }
        }

        System.out.println("iterations: "+count);
        System.out.println(multSums);
    }
}
