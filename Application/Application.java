package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//     int [] arr  = {12,21};
//     String  name [] = {"Fuad"};
//        System.out.println( Arrays.toString(name)+"Number: "+Arrays.toString(arr));

//        int i,m=0,flag=0;
//        int n=33; //it is the number to be checked
//        
//        m = n/2;
//        if(n==0 || n==1){
//            System.out.println(n+"is not prime number");
//        
//        }else{
//        for(i=2;i<=m; i++){
//        if(n%i == 0){
//            System.out.println(n+"is not prime number");
//            flag = 1;
//            break;
//        }
//        }
//        if(flag == 0){
//        
//            System.out.println(n+" is prime number");
//        }
//        }

    int num [] = {22,5,7,1,10,6,4,12,3,8,20};
    
    InsertionSort sorter = new InsertionSort();
    sorter.sort(num);
        System.out.println(Arrays.toString(num));

            
    }    
}

