package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;




@Controller
@RequestMapping("/cars")
public class CarController {

    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

//    @GetMapping()
//    public String index(Model model) {
//        model.addAttribute("carList", carService.getAllCars());
//        return "cars";
//    }

    @GetMapping()
    public String printCars(@RequestParam(value = "count", required = false, defaultValue = "5") int count, ModelMap modelMap) {
        modelMap.addAttribute("carList", carService.getCarList(count));
        return "cars";
    }

}
