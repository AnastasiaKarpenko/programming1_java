
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
    private ArrayList<Integer> birdCount;

    public BirdDatabase() {
        this.birds = new ArrayList<Bird>();
        this.birdCount = new ArrayList<Integer>();
    }

    public void addBirds(Bird bird) {
//        bird = new Bird();
        birds.add(bird);

    }

    public boolean isInList(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                return true;
            }
        }
        return true;
    }

    public void observeBirds(String birdName) {
        if (isInList(birdName)) {
            for (Bird bird : birds) {
                if (bird.getName().equals(birdName)) {
                    int indexBird = birds.indexOf(bird);
                    if(birdCount.size() > indexBird) {
                     int count = birdCount.get(indexBird);
                    count++;   
                    }
                    
                }

            }

        } else {
            System.out.println("Bird not found in the database. First, add the bird!");
        }

    }

    public int countObservations(Bird bird) {
        int indexOfBird = birds.indexOf(bird);

        if (birdCount.size() > indexOfBird) {
            int countObservations = birdCount.get(indexOfBird);
            return countObservations;
        }

        return 0;
    }

    public void printAllBirds() {
        for (Bird bird : birds) {
            this.printBird(bird.getName());
        }
    }

    public void printBird(String name) {
        for (Bird bird : birds) {
            if (bird.getName().equals(name)) {
                System.out.println(bird.toString() + this.countObservations(bird));

//                System.out.println(bird.toString() + this.countObservations(bird) + "observations");
            }
        }

    }

}
