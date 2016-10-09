public class Reformatory {
    private int weightCounter;
    
    public Reformatory() {
        this.weightCounter = 0;
    }

    public int weight(Person person) {
        this.weightCounter++;
        return person.getWeight();
    }
    
    public void feed(Person person) {
        person.setWeight(person.getWeight()+1);
    }
    
    public int totalWeightsMeasured() {
        return this.weightCounter;
        
    }

}
