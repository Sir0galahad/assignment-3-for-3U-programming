/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package a3;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author millc9988
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ez = new City();
        RobotSE memes = new RobotSE(ez, 1, 1, Direction.SOUTH);
        new Wall(ez, 1, 1, Direction.NORTH);
        new Wall(ez, 1, 1, Direction.WEST);
        new Wall(ez, 2, 1, Direction.WEST);
        new Wall(ez, 3, 1, Direction.WEST);
        new Wall(ez, 4, 1, Direction.WEST);
        new Wall(ez, 4, 1, Direction.SOUTH);
        new Wall(ez, 4, 2, Direction.SOUTH);
        new Wall(ez, 4, 3, Direction.SOUTH);
        new Wall(ez, 4, 4, Direction.SOUTH);
        new Wall(ez, 4, 5, Direction.SOUTH);
        new Wall(ez, 4, 6, Direction.SOUTH);
        new Wall(ez, 4, 6, Direction.EAST);
        new Wall(ez, 3, 6, Direction.EAST);
        new Wall(ez, 2, 6, Direction.EAST);
        new Wall(ez, 1, 6, Direction.EAST);
        new Wall(ez, 1, 6, Direction.NORTH);
        new Wall(ez, 1, 5, Direction.NORTH);
        new Wall(ez, 1, 4, Direction.NORTH);
        new Wall(ez, 1, 3, Direction.NORTH);
        new Wall(ez, 1, 1, Direction.NORTH);
        //new Wall(ez, 1, 2, Direction.NORTH);

        int i = 0;
        //moving till it touched a wall
        while (memes.frontIsClear()) {
            memes.move();
        }
        //making wall be on right side
        while (!memes.frontIsClear()) {
            memes.turnLeft();
        }
        //check wall to right until there is a hole and then if there is a hole move through and stop
        while (i<1) {
            if (memes.frontIsClear()) {
                memes.move();
                if (memes.frontIsClear()) {
                    memes.turnRight();
                }
                if (memes.frontIsClear()) {
                }
                if (memes.frontIsClear()) {
                    i++;
                }
            }
            if (!memes.frontIsClear()) {
                memes.turnLeft();
            }
        }
        memes.move();
    }
}
