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
public class Polimorfis {
    public static void main(String[] args){
        person ref;
        Student student = new Student();
        Employee employee = new Employee ();
        
        ref = student;
        String name = ref.getName();
        System.out.println(name);
        //
        
        ref = employee;
        String name1 = ref.getName();
        System.out.println(name1);
    }
        public static void printInformation(person Person){
           if(Person instanceof Student){
               System.out.print("Name student "+Person.getName ());
           }else if(Person instanceof Employee){
               System.out.print("Name employee "+Person.getName ());
           }
        }
}

