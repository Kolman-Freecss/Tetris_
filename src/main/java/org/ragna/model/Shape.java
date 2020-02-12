package org.ragna.model;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.List;

import com.google.common.collect.Lists;

public class Shape
{

	private final ShapeType shapeType;
	
	private final Rectangle boundingBox;
	
	private final int currentRotation;
	
	private final List<Block> blocks = Lists.newArrayList();
	
	
	public class Block 
	{
		private Point location;
		
		public Block(final Point location) 
		{
			this.location = location;
			
			getShape().blocks.add(this);
		}
		
		private Shape getShape() 
		{
			return Shape.this;
		}

		public Point getLocation() {
			return location;
		}

		public void setLocation(Point location) {
			this.location = location;
		}
		
	}

	public Shape(ShapeType shapeType, Rectangle boundingBox, int currentRotation) 
	{
		this.shapeType = shapeType;
		this.boundingBox = boundingBox;
		this.currentRotation = currentRotation;
	}


	public ShapeType getShapeType() {
		return shapeType;
	}


	public Rectangle getBoundingBox() {
		return boundingBox;
	}


	public int getCurrentRotation() {
		return currentRotation;
	}


	public List<Block> getBlocks() {
		return blocks;
	}
	
}
