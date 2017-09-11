package lab_3.individual_lab;

import kareltherobot.*;
import java.awt.Color;

public class Problem3 extends Robot
{
   
    /**
     * Constructor for objects of class Problem1
     * sorry Mr. Appel, Karel was kinda wonky on my computer, I was inable to 
     * finish this problem due to errors 
     */
    public Problem3(int st, int av, Direction dir, int beep)
    {
        super(st, av, dir, beep);
    }

    public void carpetRooms(){
        
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
    }
    public void checkRoom(){
        if (frontIsClear()){
            move();
            turnLeft();
            if (frontIsClear() == false){
                turnLeft();
                turnLeft();
                if (frontIsClear()==false){
                    turnLeft();
                    if (frontIsClear()==false){
                        putBeeper();
                        leave();
                    }
                    else {
                        checkRoom();
                    }
                }
            }
        }  
    }
    public void turnRight(){
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void faceEast()
    {
            if(facingWest()){
                turnLeft();
                turnLeft();
            }
            else if(facingNorth()){
                turnRight();
                }
            else if(facingSouth()){
                    turnLeft();
                    }
            }
    public void leave(){
        faceEast();
        turnRight();
        move();
        faceEast();
        if ((frontIsClear())==false){
            leave();
             
       }
    }
    public void leaveAndBeep(){
        faceEast();
        turnRight();
        move();
        putBeeper();
        faceEast();
        if ((frontIsClear())==false){
            leave();
             
       }
    }
    public void test1(){
        move();
        turnLeft();
        checkRoom();
        leave();
    }
    public void test2(){
        move();
        turnLeft();
        checkRoom();
        leave();
    }
    public void test3(){
        
        move();
        turnLeft();
        checkRoom();
        leave();
    }
    public void test4(){
        
        move();
        turnLeft();
        checkRoom();
        leave();
    } 
    public void test5(){
        
        move();
        turnLeft();
        checkRoom();
        leave();
    } 
    public void test6(){
        
        move();
        turnLeft();
        checkRoom();
        leave();
    } 
    
}