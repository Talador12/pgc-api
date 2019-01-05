package com.ccl.grandcanyon;

import org.glassfish.jersey.server.ResourceConfig;

import javax.ws.rs.ApplicationPath;

import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;



@ApplicationPath("api")
public class GCApplication extends ResourceConfig {

  public GCApplication() {

    register(BasicAuthFilter.class);

    register(Callers.class);
    register(Districts.class);
    register(Themes.class);
    register(TalkingPoints.class);
    register(DistrictOffices.class);
    register(Calls.class);
    register(Admins.class);

    register(JacksonJsonProvider.class);
    register(JSONExceptionMapper.class);
  }

}
