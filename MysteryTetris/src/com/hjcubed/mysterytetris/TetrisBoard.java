package com.hjcubed.mysterytetris;

import java.util.Arrays;
import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.SimpleBaseGameActivity;
import org.andengine.entity.Entity;
import org.andengine.entity.primitive.Rectangle;
import org.andengine.opengl.vbo.VertexBufferObjectManager;

public class TetrisBoard {
	/* tetris help http://cslibrary.stanford.edu/112/ 
	http://cslibrary.stanford.edu/112/TetrisAssignment.pdf*/
	//  //Add rectangleGroup to the scene, and also everything it contains
	// myScene.attachChild(rectangleGroup);

	// globals??
	final static int unitWidth = 10; 
	Scene scene;
	VertexBufferObjectManager vbo = new VertexBufferObjectManager();

    // this tracks where all the pieces are in an array??? i.e. what's occupied/not
    // backend, only display units/blocks when occupied...
    // 10 blocks = 1 row 
    // let's say 1 is occupied and 0 is empty
    public TetrisBoard(Scene sceneIn) {
    	int[][] boardArray = new int[10][20]; 
    	scene = sceneIn;
    }
    
    //is occupied?
    
    /*public Piece generatePiece(){
        
        return Piece;
    }*/
    
    public void checkLine() {
        // if this has 10 in a row, remove it
    }
    
    public void shiftDown() {
        // delete the bottom of all the pieces and remove the occupied blocks from array 
    }
	    
	    

	class Piece {
		
	    
	    // generalise this later
	    // rotate?? have a look at this link http://codeincomplete.com/posts/2011/10/10/javascript_tetris/
	}

	class Square extends Piece {
	    // Made up of 4 'units' 
	    //Unit u1, u2, u3, u4; 
	    Entity groupOfUnits; 
	    int xVal;
	    int yVal;
	    int lowestTopLeftYPos = 0; // by default?? 
	    
	    // constructor
	    // create at origin 
	    public Square(){
	        /*u1 = new Unit(0,0,unitWidth,unitWidth); 
	        u2 = new Unit(0,unitWidth,unitWidth,unitWidth);
	        u3 = new Unit(unitWidth,0,unitWidth,unitWidth);
	        u4 = new Unit(unitWidth,unitWidth,unitWidth,unitWidth);*/
	        
	        Rectangle u1 = new Rectangle(0,0,unitWidth,unitWidth, vbo); 
	        Rectangle u2 = new Rectangle(50,unitWidth,unitWidth,unitWidth, vbo);
	        Rectangle u3 = new Rectangle(unitWidth,0,unitWidth,unitWidth, vbo);
	        Rectangle u4 = new Rectangle(unitWidth,unitWidth,unitWidth,unitWidth, vbo); 
	        groupOfUnits = new Entity(0, 0);
	        groupOfUnits.attachChild(u1); 
	        groupOfUnits.attachChild(u2);
	        groupOfUnits.attachChild(u3); 
	        groupOfUnits.attachChild(u4);
	        lowestTopLeftYPos=unitWidth; 
	        scene.attachChild(groupOfUnits);
	    }
	    
	    // put all the methods here first and generalise to piece later
	    
	    // METHODS:
	    // remove bottom?
	    // move down? or is this in game scene?
	    public void moveDown() {
	        //groupOfUnits.setPosition( SOMETHING HERE ); 
	        
	        //positiony++; // assuming 0 is at the top of the screen.... 
	        //lowestTopLeftYPos = positiony;
	        //Board.updateBoard(); // what does this do??? 
	    }
	    
	    public void removeBottom(){
	        // delete u_ 
	    }
	    
	    //
	    
	}

	/*class Unit extends Rectangle{//needed ?? may need sprite for each unit, so toggle display/not
	//http://stuartmct.co.uk/2012/07/16/andengine-working-with-rectangles/
	//vs using images??
	    Rectangle rect; 
	    int x;
	    int y;
	    // don't need width and height?
	    public Unit(int x,int y,int width,int height){
	        rect = new Rectangle(x, y, width, height, vbo);
	        scene.attachChild(rect);
	        //updateBoard(); //??? here or in piece????
	    }
	    
	    public int getXCoordinate() {
	        return x;
	    }
	    public int getYCoordinate() {
	        return y;
	    }
	    
	    public void setXCoordinate(int newx) {
	        x = newx;
	    }
	    public void setYCoordinate(int newy) {
	        y = newy;
	    }
	} */

}
