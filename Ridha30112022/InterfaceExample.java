/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ridha30112022;

/**
 *
 * @author ridha
 */
public class InterfaceExample {
     public static void main(String[] args) {
         Relation myInteger = new MyInteger();
         Relation myDouble = new MyDouble ();
         boolean hasil = myInteger.isGreater(5,7);
         boolean hasilDouble = myDouble.isGreater(5.7 ,8.9);
     }
}
