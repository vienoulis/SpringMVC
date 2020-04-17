package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;
import web.service.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

@Controller
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private Service service;

    @RequestMapping(name = "/cars", method = RequestMethod.GET)
    public String printCars(ModelMap map, HttpServletRequest request) throws IOException {
        map.addAttribute("car", service.getTitle(request.getParameter("locale")));
        List<Car> cars = service.getMyListOfCar();
        map.addAttribute("carsList", cars);
        return "cars";
    }
}
