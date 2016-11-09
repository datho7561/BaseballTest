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
public class BaseballTest {

    /**
     * Tests the BaseballTeam class.
     * pre: none
     * post: new team created and displayed in console. Team's games played is
     * updated and team is redisplayed in console.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BaseballTeam team = new BaseballTeam("Toronto Blue Jays",1,5,3);
        System.out.println(team);
        team.addGameResult("loss");
        team.addGameResult("tie");
        System.out.println(team);
    }
    
}
