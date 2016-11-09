/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseballtest;

/**
 *
 * @author DaTho7561
 */
public class BaseballTeam extends Sports implements Stats{

    int ties, wins, losses;
    
    /**
     * Creates a new baseball team, with the specified name, number of ties,
     * wins and losses.
     * pre: none.
     * post: new baseball team created.
     * @param teamname
     * @param numTies
     * @param numWins
     * @param numLosses 
     */
    public BaseballTeam(String teamname, int numTies, int numWins, int numLosses) {
        super(teamname);
        ties = numTies;
        wins = numWins;
        losses = numLosses;
    }
    
    /**
     * Creates a default baseball with no wins, losses, or ties
     * pre: none
     * post: new baseball team created
     */
    public BaseballTeam() {
        this("",0,0,0);
    }
    
    /**
     * Adds the specified game result to the tally of results.
     * pre: "win", "tie", or "loss" is input
     * post: the specified tally is incremented.
     * @param result The result of the game.
     */
    public void addGameResult(String result) {
        switch(result) {
            case "win":
                wins++;
                break;
            case "tie":
                ties++;
                break;
            case "loss":
                losses++;
                break;
            default:
                break;
        }
    }
    
    @Override
    public int overallPoints() {
        return (wins*2 + ties);
    }
    
    @Override
    public String toString() {
        String strRep = "";
        strRep += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        strRep += "Team: " + getTeamName() + "\n" + "Wins: " + wins + ", Losses: " + losses + ", Ties: " + ties +
                "\nOverall Points: " + overallPoints() + "\n";
        strRep += "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
        
        return strRep;
    }
    
}
