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
public class Employee extends person {
    @Override
    public String getName() {
        super.name ="Akbar";
        System.out.println ("Employee Name :" + name );
        return name;
    }
}

