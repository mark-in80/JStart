package com.company;

public class Inheritance extends ObjaClass {
    int part = 1;
    // Designer + ObjaClass
    public Inheritance (int h, String n, int part){
        super(h, n);
        this.part = part;
    }
    void fresh(){
        System.out.println(super.name);
        System.out.println(super.high);
    }
}
