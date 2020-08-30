package com.company;

public class OOP {
    public static void main(String[] args) {
        ObjaClass Men = new ObjaClass();
        ObjaClass Women = new ObjaClass();
        System.out.println(Men.high);
        Women.high = 90;
        System.out.println(Women.high);
        Men.func();

        // Obj Class Inheritance
        Inheritance Olga = new
                Inheritance(1, "Nick",
                34);
        Olga.fresh();
    }
}
