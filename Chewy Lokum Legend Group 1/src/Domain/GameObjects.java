package Domain;

import java.awt.Graphics;

import javax.swing.ImageIcon;

import UserInterface.GameBoardGUI;

public abstract class GameObjects {
	
	/*
	 * this is an abstract class for Game Objects(Lokums, Obtacles,...)
	 * 
	 */
	
	int objectType;
	int lokumType;
	public abstract int getObjectType();
	public abstract int getType();
	public void draw(Graphics g){
       
     
    }
}
