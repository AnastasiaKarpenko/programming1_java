
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anastasia
 */
public class Bird {
    private String name;
    private String latinName;
    
    public Bird () {
        this.name = "";
        this.latinName = "";
    }
    
    public String toString() {
        return this.name + "(" + this.latinName + "): ";
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getLatinName() {
        return this.latinName;
    }
    
    public void setLatinName(String name) {
        this.latinName = name;
    }
}