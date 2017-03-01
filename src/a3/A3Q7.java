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
public class A3Q7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City ez = new City();
        Robot memes = new Robot(ez, 3, 3, Direction.SOUTH);
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
        int i=0;
        int o=0;
        int p=0;
        int q=0;
        //moving around first cube
        while(i<3){
            memes.move();
            memes.move();
            memes.move();
            memes.turnLeft();
            i++;
        }
        //moving to 3,3
        memes.move();
        memes.move();
        memes.move();
        //moving around second cube
        while(o<3){
            memes.move();
            memes.move();
            memes.move();
            memes.turnLeft();
            o++;
        }
        //moving to 3,3
        memes.move();
        memes.move();
        memes.move();
        //moving around third cube
        while(p<3){
            memes.move();
            memes.move();
            memes.move();
            memes.turnLeft();
            p++;
        }
        //moving to 3,3
        memes.move();
        memes.move();
        memes.move();
        //moving around final cube
        while(q<3){
            memes.move();
            memes.move();
            memes.move();
            memes.turnLeft();
            q++;
        }
        //moving to 3,3
        memes.move();
        memes.move();
        memes.move();
    }
}
