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
public class Student extends person {

    public Student() {
        super("Ridha", "Pariaman");
        super.name ="Ridha ";
        super.address ="some address ";
        System.out.println("Insiden Student:Constructor ");
    }
    @Override
    public String getName(){ 
        System.out.println("Student: getName"); 
         return name; 
 }
    public static void main(String[] args) {
        Student Ridha = new Student();
        Ridha.name ="Ridha";
        System.out.println(Ridha.getName());
    }
}
