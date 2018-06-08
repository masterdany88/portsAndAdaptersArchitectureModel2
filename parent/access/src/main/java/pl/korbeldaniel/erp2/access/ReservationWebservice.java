package pl.korbeldaniel.erp2.access;

import javax.inject.Inject;
import javax.validation.constraints.Min;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import pl.korbeldaniel.erp2.logic.IContactLogic;

import javax.ws.rs.core.MediaType;

@Path("/reservations")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ReservationWebservice {

    //@Inject
    //private ReservationDAO dao;

	@Inject
	private IContactLogic contactLogic;
	
	@GET
	@Path("{id}")
	public Response getReservation(@PathParam("id") @Min(0) Integer id) {
		String test = "initial test";
		test = contactLogic.getTest();
		System.out.println(test);
        return Response.ok("reservation |" + test + "| " + id).build();
	}

}