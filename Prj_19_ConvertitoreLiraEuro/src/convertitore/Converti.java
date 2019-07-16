package convertitore;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("converti")
public class Converti {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String converti() {
		return "funziona!!!";
	}
	
	

}
