package com.demipo.linear;

public class Queue {
    private int size;
    private int front;
    private int rear;
    private int capacity;
    private int[] arr;

    public Queue(int capacity){
        this.capacity = capacity;
        front = -1;
        rear = -1;
        arr = new int[capacity];
    }

    public int size(){
        return size;
    }
    public Boolean isEmpty(){
        return size() == 0;
    }
    public Boolean isFull(){
        return size() == capacity;
    }
    public void enqueue(){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            
        }

    }
}
