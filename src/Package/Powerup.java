package Package;
/**
 *Name: Eric Yang
 *Date: Dec 30, 2022
 *Powerup Class for Bullet Heaven Game
 */

import java.awt.Color;
import java.awt.image.BufferedImage;

public class Powerup extends GameObject2 {
	//Speed of bullet and time that bullet was active
	//bullet sprite
	private BufferedImage bullet = setSprite("blueser.png");
	
	
	public Powerup(int x, int y) {
		//set size, coordinates, sprite, timer
		super(20, 20, null);
		sprite = bullet;
		setSize(20, 20);
		setY(y); setX(x);

	}
	
	@Override
	public void act(){

	}

}
