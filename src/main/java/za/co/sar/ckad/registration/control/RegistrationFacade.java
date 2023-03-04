package za.co.sar.ckad.registration.control;

import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

@RequestScoped
public class RegistrationFacade {
    @Inject
    @RestClient
    NotificationResource notificationResource;

    public String registerUser() {
        String result = notificationResource.notifyRecipient();
        System.out.println(result);
        return result;
    }
}
