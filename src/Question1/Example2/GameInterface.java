/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1.Example2;

/**
 *
 * @author Jeevan Bodigam
 */
public interface GameInterface {
    String GAME_TYPE="OUTDOOR";
    
    public default String getGameType(){
        return GAME_TYPE;
    }
    
    int getNoOfPlayers();
    
}
