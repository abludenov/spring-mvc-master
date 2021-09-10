package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDAOImpl implements CarDAO {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Spade", 111111));
        carList.add(new Car("Toyota", "Prius", 222222));
        carList.add(new Car("Subaru", "Forester", 333333));
        carList.add(new Car("Subaru", "Outback", 444444));
        carList.add(new Car("Nissan", "Caravan", 555555));
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarList(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
