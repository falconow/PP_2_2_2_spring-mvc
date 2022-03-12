package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    List<Car> listCar;

    @Override
    public List<Car> listCarCount(Integer count) {
        if (count != null && count>0 && count<listCar.size()) {
            return listCar.subList(0, count);
        } else {
            return listCar;
        }

    }
}
