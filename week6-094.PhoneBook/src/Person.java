/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anastasia
 */
public class Person {
    private String name;
    private String phoneNumber;
    
    public Person (String name, String number) {
        this.name = name;
        this.phoneNumber = number;
    }
    
    public String toString() {
        return this.name + " number: " + this.phoneNumber;
    }
    
    public String getName() {
        return this.name;
    }
    
    public String getNumber() {
        return this.phoneNumber;
    }
    
    public void changeNumber(String newNumber) {
        this.phoneNumber = newNumber;
    }
    
    
    
}
