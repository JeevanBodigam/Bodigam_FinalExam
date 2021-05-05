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
public class Cricket extends Game implements GameInterface {

    @Override
    public void playGame() {
        System.out.println("This is game of cricket!!");
    }

    @Override
    public int getNoOfPlayers() {
        return 11;
    }
    
    @Override
    public String toString(){
        return "Cricket is an "+ GAME_TYPE +" Game. Number of players are "+
                this.getNoOfPlayers();
    }
    
 
    
}
