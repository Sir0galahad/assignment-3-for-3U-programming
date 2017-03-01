/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author millc9988
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ez = new City();
        Robot memes = new Robot(ez, 1, 1, Direction.EAST);
        ez.showThingCounts(true);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        new Thing(ez, 1, 1);
        while(true){
        if(memes.canPickThing()){
            memes.pickThing();
            memes.move();
            memes.putThing();            
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            memes.turnLeft();
            memes.turnLeft();
        }
        if(!memes.canPickThing()){
            memes.move();
            break;
        }
        
        }
    }
}
