package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

@Controller
public class CarsController {
    private final CarService service;
    @Autowired
    public CarsController(CarService service) {
        this.service = service;
    }
    @GetMapping(value = "/cars")
    public String getCars (@RequestParam (value = "count", required = false) Integer count, ModelMap modelMap) {
        modelMap.addAttribute("cars", service.cars(count));
        return "cars";
    }
}
