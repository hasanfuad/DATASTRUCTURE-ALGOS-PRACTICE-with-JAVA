/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Hasan
 */
public class Stack {
    int stack [] = new int [5];
    int top = 0;
    public void push(int data){
        stack[top] = data;
        top++;
    }
    
    public int pop(){
    int data;
    top--;
    data = stack[top];
    stack[top] = 0;
    return data;
    }
    
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    
    public void show(){
        for(int n : stack){
            System.out.print(n+ " ");
        }
    }
    public static void main(String[] args) {
        Stack nums = new Stack();
        nums.push(40);
        System.out.println(nums.peek());//num.pop();
    }
}


