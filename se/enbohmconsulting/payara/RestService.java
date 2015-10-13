package se.enbohmconsulting.payara;

import java.time.LocalDateTime;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("service")
public class RestService {

	@GET
	@Path("/greet/{user}")
	public String greet(@PathParam("user") String user) {
		return "Hello " + user + ", the time is " + LocalDateTime.now();
	}
}
