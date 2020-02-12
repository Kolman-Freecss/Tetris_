package org.ragna.model;

import java.net.URI;

public class Tetris 
{

	public enum State 
	{
		STOPPED,
		RUNNING {
			@Override
			public State onPause() {
				return PAUSED;
			}
		},
		PAUSED {
			@Override
			public State onPause() {
				return RUNNING;
			}
		},
		GAME_OVER;
		
		public State onPause()
		{
			return this;
		}
	}
	
	private final String name;
	private final String version;
	private final URI uri;
	
	public Tetris(String name, String version, URI uri) 
	{
		this.name 		= name;
		this.version 	= version;
		this.uri 		= uri;
	}

	public String getName() {
		return name;
	}

	public String getVersion() {
		return version;
	}

	public URI getUri() {
		return uri;
	}

}
