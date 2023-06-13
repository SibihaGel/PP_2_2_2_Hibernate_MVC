package web.dao;

import web.models.Car;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDaoImpl implements CarDao {

    private static int CAR_COUNT;
    private List<Car> carList;

    { carList = new ArrayList<>();

        carList.add(new Car(++CAR_COUNT,"Mercedes","E220"));
        carList.add(new Car(++CAR_COUNT,"BMW","X1"));
        carList.add(new Car(++CAR_COUNT,"Toyota","Camry"));
        carList.add(new Car(++CAR_COUNT,"Honda","Accord"));
        carList.add(new Car(++CAR_COUNT,"Volkswagen","Tiguan"));
    }
//    @Override
//    public List<Car> showCars() { // Выводит список всех авто
//        return carList;
//    }
    @Override
    public List<Car> showId(int count) {  // Выводит ограниченный список

         return carList.stream().limit(count).collect(Collectors.toList());
    }
}
