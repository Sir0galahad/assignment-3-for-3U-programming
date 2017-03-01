/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author millc9988
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ez = new City();
        Robot memes = new Robot(ez, 1, 1, Direction.EAST);
        new Wall(ez, 1, 5, Direction.EAST);
        new Thing(ez, 1, 4);
        for (;;) {
            memes.move();
            if (memes.canPickThing()) {
                break;
            }
            if (!memes.frontIsClear()) {
                break;
            }
        }
    }
}
