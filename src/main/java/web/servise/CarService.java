package web.servise;

import web.models.Car;
import java.util.List;

public interface CarService {
    List<Car> showSelectCar(int count);
}
//@Service
//public class CarServiceImpl implements CarService {
//
//    @Autowired
//    private CarDao carDao;
//    @Override
//    public List<Car> getCarListOnCount(Integer countCars) {
//        return carDao.getCarListOnCount(countCars);
//    }