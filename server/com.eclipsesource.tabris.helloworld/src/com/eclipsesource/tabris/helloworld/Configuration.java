package com.eclipsesource.tabris.helloworld;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;

import com.eclipsesource.tabris.Bootstrapper;

public class Configuration implements ApplicationConfiguration {
	
  @Override
  public void configure( Application application ) {
    Bootstrapper bootstrapper = new Bootstrapper( application );
    bootstrapper.bootstrap();
    application.addEntryPoint( "/helloworld", HelloEntryPoint.class, null );
  }
}
