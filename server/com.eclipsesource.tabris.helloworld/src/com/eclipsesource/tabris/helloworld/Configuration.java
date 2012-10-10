package com.eclipsesource.tabris.helloworld;

import org.eclipse.rap.rwt.application.Application;
import org.eclipse.rap.rwt.application.ApplicationConfiguration;

import com.eclipsesource.tabris.Bootstrapper;

public class Configuration
  implements ApplicationConfiguration
{

  @Override
  public void configure( Application application ) {
    Bootstrapper.bootstrap( application );
    application.addEntryPoint( "/helloworld", EntryPoint.class, null );
  }
}
