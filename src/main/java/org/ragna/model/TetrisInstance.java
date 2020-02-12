package org.ragna.model;

import java.awt.Point;
import java.util.List;
import java.util.Map;

import org.ragna.model.Shape.Block;
import org.ragna.model.Tetris.State;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class TetrisInstance 
{

	private final Map<Point, Block> blocks = Maps.newHashMap();
	
	private final Map<ShapeType, Integer> statistics;
	
	private final List<TetrisEvent> tetrisEvents = Lists.newArrayList();
	
	private State state = State.STOPPED;
	
	private Shape currentShape;
	
	private Shape nextShape;
	
	private Optional<Movement>
	
}
