package at.htl;

import io.quarkus.security.identity.SecurityIdentity;
import org.jboss.resteasy.annotations.cache.NoCache;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("api")
@Produces(MediaType.APPLICATION_JSON)
public class authResource {


    @Inject
    SecurityIdentity identity;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @NoCache
    public SecurityIdentity getUserInfo() {
        return identity;
    }

    @GET
    @Path("/admin")
    @NoCache
    public String getAdminSecret() {
        return "I am admin";
    }
}