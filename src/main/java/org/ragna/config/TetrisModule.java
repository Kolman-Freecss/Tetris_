package org.ragna.config;

import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.URI;
import java.util.Properties;

import javax.inject.Inject;

import org.ragna.model.Tetris;

import com.google.inject.AbstractModule;
import com.google.inject.BindingAnnotation;
import com.google.inject.Provides;

public class TetrisModule extends AbstractModule
{
	
	private static final String TETRIS_PROPERTIES = "/tetris.properties";
	
	private static final String NAME_KEY = "name";

    private static final String VERSION_KEY = "version";

    private static final String URL_KEY = "url";
	
	private final Tetris tetris;

	public TetrisModule() 
	{
		String name;
		String version;
		URI uri;
		
		try (InputStream inputStream = TetrisModule.class.getResourceAsStream(TETRIS_PROPERTIES)) {
			final Properties properties = new Properties();
			
			properties.load(inputStream);
			
			name = properties.getProperty(NAME_KEY);
			version = properties.getProperty(VERSION_KEY);
			uri = URI.create(properties.getProperty(URL_KEY));
			
			
			
		} catch (final IOException e) {
			e.printStackTrace();
		}
		
		tetris = new Tetris(name, version, uri);
	}



	/**
	 * We'll add the binds that we'll want to use in case of dependency 
	 * */
	@Override
	protected void configure()
	{
		
		
	}
	
	@Target({ ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD })
	@BindingAnnotation
	public @interface TetrisProvider{
	}
	
	@Provides
	@TetrisProvider
	@Inject
	public Tetris getTetris()
	{
		return tetris;
	}

}
