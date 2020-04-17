package web.controller;

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

    @RequestMapping(name = "/cars", method = RequestMethod.GET)
    public String printCars(ModelMap map, HttpServletRequest request) throws IOException {
        Properties properties = new Properties();
        if (request.getParameter("locale") != null &&
                request.getParameter("locale").equals("ru")) {
            properties.load(new FileReader(getClass().getClassLoader().getResource("ru.properties").getFile()));
        } else {
            properties.load(new FileReader(getClass().getClassLoader().getResource("en.properties").getFile()));
        }
        map.addAttribute("car", properties.getProperty("cars"));
        List<Car> cars = Service.getMyListOfCar();
        map.addAttribute("carsList", cars);
        return "cars";
    }
}
