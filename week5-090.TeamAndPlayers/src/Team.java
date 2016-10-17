
import java.util.ArrayList;



public class Team {
    private String name;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team (String teamName) {
        this.name = teamName;
        players = new ArrayList();
        this.maxSize = 16;
       
       
    }
    
    public String getName () {
        return this.name; 
    }
    
    public void addPlayer(Player newPlayer) {
        if (this.maxSize > this.size()) {
            this.players.add(newPlayer);
        }
    }
    
    public void printPlayers () {
        for (Player player : players) {
            System.out.println(player);
        }
    }
    
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }
    
    public int size() {
        return players.size();
    }
    
    public int goals(){
        int totalGoals = 0;
        for (Player p : players) {
            totalGoals+=p.goals();
        }
        return totalGoals;
    }
}
