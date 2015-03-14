package com.rest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;

import com.model.MoodleUser;
import com.util.MoodleService;

@Path("/json")
@Controller
public class JSONService {

	@Autowired
	private ApplicationContext appContext;

	@PersistenceContext
	private EntityManager em;

	@Autowired
	MoodleService moodleService;

	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public String getJSON() {
		return "Tu Json, Get Json. Zglaszam sie";
	}

	@GET
	@Path("/users")
	@Produces(MediaType.APPLICATION_JSON)
	public String getMoodleUsers() {
		String output = "";
		for (MoodleUser user : moodleService.getAllMoodleUsers()) {
			output += user.getId() + " " + user.getUsername() + "\n";
		}
		return output;
	}

	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response postJSON() {
		String result = "Tu Json, Post Json. Zglaszam sie";
		return Response.status(201).entity(result).build();
	}

}