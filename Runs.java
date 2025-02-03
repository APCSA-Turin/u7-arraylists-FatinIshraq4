import java.util.ArrayList;
import java.util.Arrays;
public class Runs {
    public static void main(String[] args) {
        Car c1 = new Car("Civic", 12000);
        Car c2 = new Car("Chevelle", 6000);
        Car c3 = new Car("Nismo", 16000);
        Car[] cars = {c1, c2, c3};
        ArrayList<Car> carList = new ArrayList<Car>(Arrays.asList(cars));
        System.out.println(carList);
    }
}
