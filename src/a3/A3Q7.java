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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ez = new City();
        RobotSE memes = new RobotSE(ez, 3, 3, Direction.SOUTH);
        new Wall(ez, 4, 4, Direction.WEST);
        new Wall(ez, 4, 4, Direction.NORTH);
        new Wall(ez, 4, 5, Direction.NORTH);
        new Wall(ez, 4, 5, Direction.EAST);
        new Wall(ez, 5, 5, Direction.EAST);
        new Wall(ez, 5, 5, Direction.SOUTH);
        new Wall(ez, 5, 4, Direction.SOUTH);
        new Wall(ez, 5, 4, Direction.WEST);
        //end of first cube
        new Wall(ez, 4, 1, Direction.WEST);
        new Wall(ez, 4, 1, Direction.NORTH);
        new Wall(ez, 4, 2, Direction.NORTH);
        new Wall(ez, 4, 2, Direction.EAST);
        new Wall(ez, 5, 2, Direction.EAST);
        new Wall(ez, 5, 2, Direction.SOUTH);
        new Wall(ez, 5, 1, Direction.SOUTH);
        new Wall(ez, 5, 1, Direction.WEST);
        //end of second cube
        new Wall(ez, 1, 4, Direction.WEST);
        new Wall(ez, 1, 4, Direction.NORTH);
        new Wall(ez, 1, 5, Direction.NORTH);
        new Wall(ez, 1, 5, Direction.EAST);
        new Wall(ez, 2, 5, Direction.EAST);
        new Wall(ez, 2, 5, Direction.SOUTH);
        new Wall(ez, 2, 4, Direction.SOUTH);
        new Wall(ez, 2, 4, Direction.WEST);
        //end of third cube
        new Wall(ez, 1, 1, Direction.WEST);
        new Wall(ez, 1, 1, Direction.NORTH);
        new Wall(ez, 1, 2, Direction.NORTH);
        new Wall(ez, 1, 2, Direction.EAST);
        new Wall(ez, 2, 2, Direction.EAST);
        new Wall(ez, 2, 2, Direction.SOUTH);
        new Wall(ez, 2, 1, Direction.SOUTH);
        new Wall(ez, 2, 1, Direction.WEST);
        //end of final cube
        //go around cubes 4 times
        for (int q = 0; q < 4; q++) {
            //move forward 3 and turn left 3 times
            for (int i = 0; i < 3; i++) {
                memes.move(3);
                memes.turnLeft();
            }
            //move forward 3 times
            memes.move(3);
        }
    }
}
