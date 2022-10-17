package com.company;

public class Main {
    public static int[] Stack = new int[3];
    public static int Top = 0;

    public static void main(String[] args) {
	// write your code here
        for (int i = 0; i < Stack.length; i++) {
            System.out.println(Stack[i]);
        }
        Pop();
        Push(1);
        Peek();
        Push(2);
        Push(3);
        Push(4);
        Peek();
        Pop();
        for (int i = 0; i < Stack.length; i++) {
            System.out.println(Stack[i]);
        }
    }
    public static boolean isEmpty(){
        Boolean Empty = true;
        for (int i = 0; i < Stack.length; i++) {
            if(Stack[i]!=0){
                Empty = false;
            }
        }
        return Empty;
    }
    public static boolean isFull(){
        Boolean Full = true;
        for (int i = 0; i < Stack.length; i++) {
            if(Stack[i]==0){
                Full = false;
            }
        }
        return Full;
    }
    public static void Push(int data){
        if (!isFull()) {
            Stack[Top] = data;
            Top = Top + 1;
        }
        else{
            System.out.println("stack is full");
        }
    }
    public static void Pop(){
        if (!isEmpty()) {
            System.out.println("popped:"+Stack[Top-1]);
            Stack[Top-1] =0;
            Top = Top -1;
        }
        else{
            System.out.println("stack is empty");
        }
    }
    public static void Peek(){
        if (!isEmpty()) {
            System.out.println("Peek:"+Stack[Top-1]);
        }
        else{
            System.out.println("stack is empty");
        }
    }

}
