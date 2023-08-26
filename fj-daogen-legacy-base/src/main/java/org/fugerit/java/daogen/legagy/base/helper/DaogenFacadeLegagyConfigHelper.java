package org.fugerit.java.daogen.legagy.base.helper;

import java.util.Properties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DaogenFacadeLegagyConfigHelper {

	public static void printLegagyMode( String version, String step ) {
		log.warn( "************************************************************************" );
		log.warn( "************************************************************************" );
		log.warn( "************************************************************************" );
		log.warn( "* running on legacy daogen module version:{}, step:{}", version, step );
		log.warn( "************************************************************************" );
		log.warn( "************************************************************************" );
	}
	
	public static void overridePropertiesHelper( Properties generalProps, Properties overrideProperties ) {
		if ( overrideProperties != null ) {
			log.info( "override properties -> {}", overrideProperties );
			for ( Object k : overrideProperties.keySet() ) {
				String key = k.toString();
				String value = overrideProperties.getProperty(key);
				log.info( "ovverride {} -> {}", key, value );
				generalProps.setProperty(key, value);
			}
			generalProps.keySet().stream().sorted().forEach( 
					k -> log.info( "prop key : {} value : {}", k, generalProps.getProperty( k.toString() ) ) );
		}
	}
	
}
