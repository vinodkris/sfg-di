package guru.springframework.sfgdi.controllers.vehicle;

import guru.springframework.sfgdi.services.vehicle.VehicleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author Vinod Kris
 */
@Controller
public class CarController implements VehicleController{

    private final VehicleService service;

    public CarController(@Qualifier("car") VehicleService service) {
        this.service = service;
    }

    @Override
    public String sayMyType() {
        return service.type();
    }
}
