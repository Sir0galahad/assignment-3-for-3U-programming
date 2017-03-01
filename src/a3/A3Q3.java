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
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City ez = new City();
        RobotSE memes = new RobotSE(ez, 1, 1, Direction.EAST);
        new Thing(ez, 1, 2);
        new Thing(ez, 1, 2);
        new Thing(ez, 1, 2);
        new Thing(ez, 1, 2);
        new Thing(ez, 1, 4);
        new Thing(ez, 1, 4);
        new Thing(ez, 1, 6);
        new Thing(ez, 1, 6);
        new Thing(ez, 1, 6);
        new Thing(ez, 2, 4);
        new Thing(ez, 2, 6);
        new Thing(ez, 2, 1);
        new Thing(ez, 2, 2);
        new Thing(ez, 3, 3);
        new Thing(ez, 3, 3);
        new Thing(ez, 3, 2);
        new Thing(ez, 3, 5);
        new Thing(ez, 4, 2);
        new Thing(ez, 4, 4);
        new Thing(ez, 4, 6);
        
        
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
        new Wall(ez, 1, 2, Direction.NORTH);
        new Wall(ez, 1, 1, Direction.NORTH);
        for (;;) {
            while (memes.canPickThing()) {
                memes.pickThing();
            }
            if (memes.frontIsClear()) {
                memes.move();
            }
            while (memes.canPickThing()) {
                memes.pickThing();
            }
            if (!memes.frontIsClear()) {
                while (!(memes.getDirection() == Direction.SOUTH)) {
                    memes.turnLeft();
                }
                if (!memes.frontIsClear()) {
                    break;
                }
                memes.move();
                memes.turnLeft();
                if (!memes.frontIsClear()) {
                    memes.turnAround();
                }
            }
        }
        while (memes.getAvenue() < 1) {
            if (memes.getDirection() == Direction.NORTH) {
                memes.turnRight();
            }
            if (memes.getDirection() == Direction.SOUTH) {
                memes.turnLeft();
            }
            if (memes.getDirection() == Direction.WEST) {
                memes.turnAround();
            }
            memes.move();
        }
        while (memes.getAvenue() > 1) {
            if (memes.getDirection() == Direction.NORTH) {
                memes.turnLeft();
            }
            if (memes.getDirection() == Direction.SOUTH) {
                memes.turnRight();
            }
            if (memes.getDirection() == Direction.EAST) {
                memes.turnAround();
            }
            memes.move();
            }
            while (memes.getStreet() < 1) {
                if (memes.getDirection() == Direction.EAST) {
                    memes.turnRight();
                }
                if (memes.getDirection() == Direction.WEST) {
                    memes.turnLeft();
                }
                if (memes.getDirection() == Direction.NORTH) {
                    memes.turnAround();
                }
                memes.move();
            }
            while (memes.getStreet() > 1) {
                if (memes.getDirection() == Direction.WEST) {
                    memes.turnRight();
                }
                if (memes.getDirection() == Direction.EAST) {
                    memes.turnLeft();
                }
                if (memes.getDirection() == Direction.SOUTH) {
                    memes.turnAround();
                }
                memes.move();
            }
    }
}
