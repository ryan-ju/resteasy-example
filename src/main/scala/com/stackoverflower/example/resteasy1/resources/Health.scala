package com.stackoverflower.example.resteasy1.resources

import javax.ws.rs.core.{Response, MediaType}
import javax.ws.rs.{Produces, Path, GET}

/**
 * Created by ryan on 01/12/14.
 */
@Path("/health")
class Health {
  @GET
  @Path("/report")
  @Produces(value = Array("application/xml", "application/json"))
  def health: Response = {
    Response.ok("Here you go!").build()
  }
}
