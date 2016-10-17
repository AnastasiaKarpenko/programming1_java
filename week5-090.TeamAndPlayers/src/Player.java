
public class Player {

    private String name;
    private int goalsAmount;

    public Player(String playerName) {
        this.name = playerName;
    }
    
    public Player(String playerName, int givenGoalsAmount) {
        this.name = playerName;
        this.goalsAmount = givenGoalsAmount;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int goals() {
        return this.goalsAmount;
    }
    
    public String toString() {
        return this.name + ", goals " + this.goals();
    }

}
