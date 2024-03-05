package at.htlleonding.boundary;

import at.htlleonding.control.VehicleRepository;
import at.htlleonding.entity.Vehicle;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("vehicle")
public class VehicleResource {

    @Inject
    VehicleRepository vehicleRepository;

    @GET
    public Response getVehicles() {
        return Response.ok(vehicleRepository.listAll()).build();
    }


    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addVehicle(Vehicle vehicle) {
        vehicleRepository.persist(vehicle);
        return Response.ok().build();
    }
}
