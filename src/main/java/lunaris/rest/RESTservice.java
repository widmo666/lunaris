package lunaris.rest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.servlet.ServletContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import lunaris.model.Czolg;
import lunaris.model.TypCzolgu;
import lunaris.model.User;
import lunaris.service.ExampleService;
import lunaris.utils.SpringApplicationContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Path("/rest")
@Component
public class RESTservice {

	public static final String UTF8 = ";charset=utf-8";

	@Autowired
	protected ExampleService exampleService;

	@PersistenceContext
	private EntityManager em;

	@Context
	private ServletContext context;

	@GET
	@Path("/get/user/json")
	@Produces(MediaType.APPLICATION_JSON + UTF8)
	public User getUserInJSON() {

		User user = new User();
		user.setUsername("Micha³");
		user.setPassword("Wójtowicz");
		user.setPin(666);

		return user;

	}

	@GET
	@Path("/get/user/xml")
	@Produces(MediaType.APPLICATION_XML + UTF8)
	public User getUserInXML() {

		User user = new User();
		user.setUsername("Micha³");
		user.setPassword("Wójtowicz");
		user.setPin(1410);

		return user;

	}

	@GET
	@Path("/get/czolg/json")
	@Produces(MediaType.APPLICATION_JSON + UTF8)
	public Czolg getCzolgInJSON() {

		Czolg czolg = new Czolg();

		TypCzolgu typCzolgu = new TypCzolgu();
		typCzolgu.setId(new Long(1410));
		typCzolgu.setNazwaTypu("Niszczyciel czo³gów");

		czolg.setTypCzolgu(typCzolgu);
		czolg.setId(new Long(666));
		czolg.setNazwa("ISU-152");

		return czolg;
	}

	@GET
	@Path("/get/czolg/xml")
	@Produces(MediaType.APPLICATION_XML + UTF8)
	public Czolg getCzolgInXML() {

		ExampleService es = (ExampleService) SpringApplicationContext.getBean("exampleServiceImpl");
		System.out.println(es.getInfo());

		Czolg czolg = new Czolg();

		TypCzolgu typCzolgu = new TypCzolgu();
		typCzolgu.setId(new Long(1410));
		typCzolgu.setNazwaTypu("Niszczyciel czo³gów");

		czolg.setTypCzolgu(typCzolgu);
		czolg.setId(new Long(666));
		czolg.setNazwa("ISU-152");

		return czolg;
	}

}