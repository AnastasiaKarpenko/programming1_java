
import java.util.ArrayList;
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
public class BirdDatabase {
    private ArrayList<Bird> birds;
    private int[] birdCount;
    
    public BirdDatabase() {
        this.birds = new ArrayList<Bird>(); 
        this.birdCount = new int [birds.size()];
    }
    
    public void addBirds(Bird bird) {
        birds.add(bird);
                
    }
    
    public boolean isInList (String name) {
        for (Bird bird : birds) {
            if (!bird.getName().equals(name)) {
                return false;
            } 
        }
        return true;
    }
    
    public void observeBirds (String birdName) {      
        if (!isInList(birdName)) {
            System.out.println("Is not a bird!");
            
        } else { 
            for (Bird bird : birds) {
                if (bird.getName().equals(birdName)) {
                    int indexBird = birds.indexOf(bird);
                    birdCount[indexBird]++;
                }
                
            }
            
        } 
    }
    
    public int countObservations(Bird bird) {
        int countObservations = birdCount[birds.indexOf(bird)];
        return countObservations;
    }
    
    public void printAllBirds() {
        for (Bird bird : birds) {
            this.printBird(bird.getName());
        }
    }
    
    public void printBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
               System.out.println(bird.toString() + this.countObservations(bird) + "observations");
            }
        }
        
        
    }
    
    
}
