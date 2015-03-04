package com.myhostabee;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

@Path("/api")
public class MyAppResource {

	@Path("/helloWorld")
	@GET
	@Produces({ MediaType.APPLICATION_JSON })
	public Response getListBusinessProcess() throws JSONException {

		JSONObject englishGreeting = new JSONObject();
		englishGreeting.put("EnglishGreeting", "Hello");

		return Response.ok(englishGreeting).build();

	}
}