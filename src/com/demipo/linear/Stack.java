package com.demipo.linear;

public class Stack {
    private Integer size;
    private Integer top;
    private Integer[] arr;

    public Stack(Integer size){
        this.size = size;
        this.top = -1;
        arr = new Integer[size];
    }

    public Boolean isFull(){
        return top == size - 1;
    }

    public Boolean isEmpty(){
        return top == -1;
    }

    public void push(Integer element){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            arr[++top] = element;
        }
    }

    public Integer pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;

        }
        else{
            return arr[top--];
        }
    }

    public Integer peek(Integer index){
        if(isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        else{
            return arr[index];
        }
    }
}
