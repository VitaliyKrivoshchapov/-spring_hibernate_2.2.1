package hiber.service;

import hiber.model.Car;
import hiber.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();


    // метод в которы передаем модель и  серию получаем user
    List<User> getUserCar(String model, int series);
}
