/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author millc9988
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ez = new City();
        Robot memes = new Robot(ez, 0, 2, Direction.WEST);
        new Wall(ez, 1, 2, Direction.EAST);
        new Wall(ez, 2, 2, Direction.EAST);
        new Wall(ez, 2, 2, Direction.SOUTH);
        new Wall(ez, 2, 1, Direction.SOUTH);
        new Wall(ez, 2, 1, Direction.WEST);
        new Wall(ez, 1, 1, Direction.WEST);
        new Wall(ez, 1, 1, Direction.NORTH);
        new Wall(ez, 1, 2, Direction.NORTH);
        
        int i=0;
        memes.move();
        memes.move();
        memes.turnLeft();
        while(i<7){
            memes.move();
            memes.move();
            memes.move();
            memes.turnLeft();
            i++;
        }
        memes.move();
    }
}
