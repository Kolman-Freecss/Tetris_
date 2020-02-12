package org.ragna.model;

import static org.ragna.constants.TetrisConstants.LOCATION_0_0;
import static org.ragna.constants.TetrisConstants.LOCATION_0_1;
import static org.ragna.constants.TetrisConstants.LOCATION_0_2;
import static org.ragna.constants.TetrisConstants.LOCATION_1_0;
import static org.ragna.constants.TetrisConstants.LOCATION_1_1;
import static org.ragna.constants.TetrisConstants.LOCATION_1_2;
import static org.ragna.constants.TetrisConstants.LOCATION_1_M1;
import static org.ragna.constants.TetrisConstants.LOCATION_2_0;
import static org.ragna.constants.TetrisConstants.LOCATION_2_1;
import static org.ragna.constants.TetrisConstants.LOCATION_2_2;
import static org.ragna.constants.TetrisConstants.LOCATION_2_M1;
import static org.ragna.constants.TetrisConstants.LOCATION_3_0;
import static org.ragna.constants.TetrisConstants.LOCATION_3_1;

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
 * General use: 
 * */
public enum ShapeType
{
	//Box
	O(
            Arrays.asList(Sets.newHashSet(LOCATION_0_0, LOCATION_1_0, LOCATION_0_1, LOCATION_1_1)),
            new Rectangle(0, 0, 2, 2)),
    I(
            Arrays.asList(Sets.newHashSet(LOCATION_0_0, LOCATION_1_0, LOCATION_2_0, LOCATION_3_0),
                Sets.newHashSet(LOCATION_2_M1, LOCATION_2_0, LOCATION_2_1, LOCATION_2_2),
                Sets.newHashSet(LOCATION_0_1, LOCATION_1_1, LOCATION_2_1, LOCATION_3_1),
                Sets.newHashSet(LOCATION_1_M1, LOCATION_1_0, LOCATION_1_1, LOCATION_1_2)),
            new Rectangle(0, 0, 4, 4)),
    J(
            Arrays.asList(Sets.newHashSet(LOCATION_0_0, LOCATION_0_1, LOCATION_1_1, LOCATION_2_1),
                Sets.newHashSet(LOCATION_1_0, LOCATION_2_0, LOCATION_1_1, LOCATION_1_2),
                Sets.newHashSet(LOCATION_0_1, LOCATION_1_1, LOCATION_2_1, LOCATION_2_2),
                Sets.newHashSet(LOCATION_1_0, LOCATION_1_1, LOCATION_0_2, LOCATION_1_2)),
            new Rectangle(0, 0, 3, 3)),
    L(
            Arrays.asList(Sets.newHashSet(LOCATION_0_1, LOCATION_1_1, LOCATION_2_1, LOCATION_2_0),
                Sets.newHashSet(LOCATION_1_0, LOCATION_1_1, LOCATION_1_2, LOCATION_2_2),
                Sets.newHashSet(LOCATION_0_1, LOCATION_1_1, LOCATION_2_1, LOCATION_0_2),
                Sets.newHashSet(LOCATION_0_0, LOCATION_1_0, LOCATION_1_1, LOCATION_1_2)),
            new Rectangle(0, 0, 3, 3)),
    S(
            Arrays.asList(Sets.newHashSet(LOCATION_1_0, LOCATION_2_0, LOCATION_0_1, LOCATION_1_1),
                Sets.newHashSet(LOCATION_1_0, LOCATION_1_1, LOCATION_2_1, LOCATION_2_2),
                Sets.newHashSet(LOCATION_1_1, LOCATION_2_1, LOCATION_0_2, LOCATION_1_2),
                Sets.newHashSet(LOCATION_0_0, LOCATION_0_1, LOCATION_1_1, LOCATION_1_2)),
            new Rectangle(0, 0, 3, 3)),
    T(
            Arrays.asList(Sets.newHashSet(LOCATION_1_0, LOCATION_0_1, LOCATION_1_1, LOCATION_2_1),
                Sets.newHashSet(LOCATION_1_0, LOCATION_1_1, LOCATION_2_1, LOCATION_1_2),
                Sets.newHashSet(LOCATION_0_1, LOCATION_1_1, LOCATION_2_1, LOCATION_1_2),
                Sets.newHashSet(LOCATION_1_0, LOCATION_0_1, LOCATION_1_1, LOCATION_1_2)),
            new Rectangle(0, 0, 3, 3)),
    Z(
            Arrays.asList(Sets.newHashSet(LOCATION_0_0, LOCATION_1_0, LOCATION_1_1, LOCATION_2_1),
                Sets.newHashSet(LOCATION_2_0, LOCATION_1_1, LOCATION_2_1, LOCATION_1_2),
                Sets.newHashSet(LOCATION_0_1, LOCATION_1_1, LOCATION_1_2, LOCATION_2_2),
                Sets.newHashSet(LOCATION_1_0, LOCATION_0_1, LOCATION_1_1, LOCATION_0_2)),
            new Rectangle(0, 0, 3, 3));
	
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
	
}
