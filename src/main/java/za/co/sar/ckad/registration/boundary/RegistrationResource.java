package za.co.sar.ckad.registration.boundary;

import org.eclipse.microprofile.config.inject.ConfigProperty;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("/v1/registration")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegistrationResource {

    @ConfigProperty(name = "notificationservice.url", defaultValue = "notification-svc-default-value")
    private String notificationServiceUrl;

    @GET
    @Path("/ping")
    public Response ping() {
        return Response.ok(Collections.singletonMap("Ping result", "OK")).build();
    }

    @GET
    @Path("/notification")
    public String getNotificationServiceUrl() {
        return "The value of the NOTIFICATIONSERVICE_URL environment variable is: " + notificationServiceUrl;
    }

}
