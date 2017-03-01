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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ez = new City();
        Robot memes = new Robot(ez, 1, 1, Direction.SOUTH);
        ez.showThingCounts(true);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 1);
        new Thing(ez, 3, 1);
        new Thing(ez, 3, 1);
        new Thing(ez, 3, 1);
        new Thing(ez, 3, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 4, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 5, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        new Thing(ez, 6, 1);
        
        
        while (true) {
            memes.move();
            if (!memes.canPickThing()) {
                break;
            }
            while (memes.canPickThing()) {
                memes.pickThing();
            }
            while (memes.countThingsInBackpack() > 0) {
                while (!(memes.getDirection() == Direction.EAST)) {
                    memes.turnLeft();
                }
                memes.putThing();
                memes.move();
            }
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            while (memes.canPickThing()) {
                memes.move();
            }
            memes.turnLeft();
            memes.turnLeft();
            memes.move();
            memes.turnLeft();
            memes.turnLeft();
            memes.turnLeft();


        }
        
    }
}
