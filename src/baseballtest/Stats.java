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
public interface Stats {
    
    /**
     * Returns the overall points for the team where one point is awarded for
     * each tie, two points are awarded for each win, and no points are awarded
     * for each loss.
     * pre: none
     * post: overall points returned
     * @return overall points
     */
    public int overallPoints();
    
}
