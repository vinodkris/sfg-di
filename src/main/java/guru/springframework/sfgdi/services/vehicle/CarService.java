package guru.springframework.sfgdi.services.vehicle;

import org.springframework.stereotype.Service;

/**
 * @author Vinod Kris
 */
@Service("car")
public class CarService implements VehicleService {

    @Override
    public String type() {
        return "I AM A CAR!!!";
    }
}
