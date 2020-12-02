package _06_gridworld;

import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class Gridworld {

	
	
	
	public static void main(String[] args) {
		
		World world = new World();
		
		Bug bug = new Bug();
		Location spot = new Location(2,4);
		world.add(spot, bug);
		
		Bug ant = new Bug();
		Random randy = new Random ();
		int x = randy.nextInt(9);
		Location place = new Location (x ,x );
		world.add(place ,ant);
		
	
		ant.setColor(Color.BLUE);
		
		for(int i=0; i<2; i++) {
		ant.turn();
		}
		
	Flower rose = new Flower();
	Flower lily = new Flower();
	int y = x-1;
	int z = x+1;
	Location left = new Location(x,z);

	Location right = new Location (x,y);
	if(y<0) {
	world.add(left, rose);
	}
	world.add(right, lily);
	
	
	for(int b =0; b<10;b++) {
		Location infinity = new Location (b,b);
		world.add(infinity, lily);
	
		for(int d =0; d<10;d++) {
			Location ever = new Location (b,d);
			Location next = new Location (d,b);
			world.add(ever, rose);
			world.add(next, rose);
			
		}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		world.show();
	}
}
