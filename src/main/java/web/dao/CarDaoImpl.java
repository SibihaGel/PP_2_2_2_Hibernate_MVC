package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.models.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    @Autowired
   private static List<Car> carList;

    { carList = new ArrayList<>();

        carList.add(new Car("Mercedes","E220"));
        carList.add(new Car("BMW","X1"));
        carList.add(new Car("Toyota","Camry"));
        carList.add(new Car("Honda","Accord"));
        carList.add(new Car("Volkswagen","Tiguan"));
    }
    @Override
    public List<Car> showSelectCar(int count) {
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
