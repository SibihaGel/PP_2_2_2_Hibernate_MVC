package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDaoImpl;

@Controller
public class CarsController {

    private final CarDaoImpl carDaoImpl;
    public CarsController(CarDaoImpl carDaoImpl) {
        this.carDaoImpl = carDaoImpl;
    }

    @GetMapping("/cars")
    public String showCars (@RequestParam(defaultValue="5") int count, Model model) {

    model.addAttribute("cars", carDaoImpl.showId(count));
            // Получаем все машины из DAO и передадим на отоброжение в представление
    return "showCars";
    }

//    @GetMapping("/{id}")
//    public String showId(@PathVariable("id") int id, Model model) {
//        model.addAttribute("cars", carDaoImpl.showId(id));
//                            // Получаем авто по id и передаем в представление на отображение... Возможно пригодится)
//        return "showId";
//    }
}
