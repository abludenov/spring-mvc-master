package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Controller
public class CarController {

    @GetMapping("/cars")
    public String printCar(@RequestParam(value = "count", required = false, defaultValue = "5") Integer count, Model model) {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Toyota", "Spade", 111111));
        carList.add(new Car("Toyota", "Prius", 222222));
        carList.add(new Car("Subaru", "Forester", 333333));
        carList.add(new Car("Subaru", "Outback", 444444));
        carList.add(new Car("Nissan", "Caravan", 555555));
        model.addAttribute("carList", carList.stream().limit(count).collect(Collectors.toList()));

        return "cars";
    }

}
