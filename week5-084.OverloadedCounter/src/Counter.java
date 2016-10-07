/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author anastasia
 */
public class Counter {
    private int startingValue;
    private boolean check;
    
    
    public Counter(int startingValue, boolean check) {
        this.startingValue = startingValue;
        this.check = check;
    } 
    
    public Counter(int startingValue) {
        this.startingValue = startingValue;
    }
    
    public Counter(boolean check) {
        this.startingValue = 0;
        this.check = check;
        
    }
    
    public Counter() {
        this.startingValue = 0;
    }
    
    public int value() {
        return this.value();
    }
    
    public void increase() {
        this.startingValue++;
    }
    
    public void decrease() {
        if (this.startingValue > 0) {
            this.startingValue--;
        }
    }
    
    public void increase(int increaseAmount) {
        if (increaseAmount >= 0) {
            this.startingValue += increaseAmount;
        }
    }
    
    public void decrease(int decreaseAmount) {
        if (this.startingValue > 0) {
            if (decreaseAmount >= 0) {
                this.startingValue -= decreaseAmount;
            }
        }
    }
}
