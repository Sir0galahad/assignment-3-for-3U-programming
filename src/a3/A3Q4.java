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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ez = new City();
        Robot memes = new Robot(ez, 1, 1, Direction.SOUTH);
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

        while (memes.frontIsClear()) {
            memes.move();
        }
        while (!memes.frontIsClear()) {
            memes.turnLeft();
        }

        for (;;) {
            if (memes.frontIsClear()) {
                memes.move();
                if (i == 1) {
                    break;
                }
                if (memes.frontIsClear()) {
                    memes.turnLeft();
                    memes.turnLeft();
                    memes.turnLeft();
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
    }
}
