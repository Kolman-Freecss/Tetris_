package org.ragna.model;

import java.awt.Point;
import java.awt.Rectangle;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import com.google.common.collect.Sets;

/**
 * @author smartinezr
 * Rotations = cases of movement for every Shape
 * BoundingBox = max points that the Shape could fill
 * */
public enum ShapeType
{
	//Box
	C(		Arrays.asList(Sets.newHashSet()),
			new Rectangle(0, 0, 2, 2));
	
	private final List<Set<Point>> rotations;
	
	private final Rectangle boundingBox;
	
	ShapeType(final List<Set<Point>> rotations,final Rectangle boundingBox)
	{
		this.rotations = rotations;
		this.boundingBox = boundingBox;
	}

	public Rectangle getBoundingBox()
	{
		return boundingBox;
	}
	
	public List<Set<Point>> getRotations()
	{
		return rotations;
	}
	
	public enum LocationRotation
	{
		LOCATION_0_0(new Point(0, 0));
		
		private final Point point;
		
		LocationRotation(final Point point)
		{
			this.point = point;
		}
		
	}
	
}
