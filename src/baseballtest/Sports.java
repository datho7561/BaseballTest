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
public abstract class Sports {
    
    private String teamName;
    
    public Sports(String teamname) {
        teamName = teamname;
    }
    
    public String getTeamName() {
        return teamName;
    }
    
}
