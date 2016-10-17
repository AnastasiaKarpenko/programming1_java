
import java.util.ArrayList;



public class Team {
    private String name;
    private ArrayList<Player> players;
    
    public Team (String teamName) {
        this.name = teamName;
        players = new ArrayList();
       
    }
    
    public String getName () {
        return this.name; 
    }
    
    public void addPlayer(Player newPlayer) {
        this.players.add(newPlayer);       
       
    }
    
    public void printPlayers () {
        for (Player player : players) {
            System.out.println(player);
        }
    }
}
