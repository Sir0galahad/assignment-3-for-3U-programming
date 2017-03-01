/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
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
        RobotSE memes = new RobotSE(ez, 0, 2, Direction.WEST);
        new Wall(ez, 1, 2, Direction.EAST);
        new Wall(ez, 2, 2, Direction.EAST);
        new Wall(ez, 2, 2, Direction.SOUTH);
        new Wall(ez, 2, 1, Direction.SOUTH);
        new Wall(ez, 2, 1, Direction.WEST);
        new Wall(ez, 1, 1, Direction.WEST);
        new Wall(ez, 1, 1, Direction.NORTH);
        new Wall(ez, 1, 2, Direction.NORTH);
        
        int i=0;
        memes.move(2);
        memes.turnLeft();
        while(i<7){
            memes.move(3);
            memes.turnLeft();
            i++;
        }
        memes.move();
    }
}
