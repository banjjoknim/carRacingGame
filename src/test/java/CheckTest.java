import static org.assertj.core.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

class CheckTest {
    private Check check = new Check();
    private Scanner scanner = new Scanner(System.in);

    @ParameterizedTest
    @ValueSource(strings = {"aslkd,sdk,sisid,qlwke,dsn", "hi!,dalsk,qlkw,sdood", "crong,hihi!,okok!", "pobi,byeee",
        "배재!!@", "hello"})
    void isCorrectNamesIsTrueTest(String input) { // 5글자 이하 입력
        List<Car> cars = new ArrayList<>();
        Arrays.stream(input.split(","))
            .map(Car::new)
            .forEach(car -> cars.add(car));
        assertThat(check.isCorrectNames(cars)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(strings = {"aslas,alqwkepo", "sdlkmsd,pqwepoasd", "00403,asdlkadksm", "rormekd,sodkd",
        "qlqlwpsd,55555"})
    void isCorrectNamesIsFalseTest(String names) {
        List<Car> cars = new ArrayList<>();
        Arrays.stream(names.split(","))
            .map(Car::new)
            .forEach(car -> cars.add(car));
        assertThat(check.isCorrectNames(cars)).isFalse();
    }

    @ParameterizedTest
    @CsvSource(value = {"sdm:3:3", "sdlk:5:5", "alsk:4:4"}, delimiter = ':')
    void isWinnerIsTrueTest(String name, String position, String maxPosition) {
        Car car = new Car(name);
        Map<Car, Integer> carInfos = new HashMap<>();
        carInfos.put(car, Integer.valueOf(position));
        assertThat(check.isWinner(car, carInfos, Integer.valueOf(maxPosition))).isTrue();
    }

    @ParameterizedTest
    @CsvSource(value = {"alskm:3:4", "aslk:4:5", "laks:1:5"}, delimiter = ':')
    void isWinnerIsFalseTest(String name, String position, String maxPosition) {
        Car car = new Car(name);
        Map<Car, Integer> carInfos = new HashMap<>();
        carInfos.put(car, Integer.valueOf(position));
        assertThat(check.isWinner(car, carInfos, Integer.valueOf(maxPosition))).isFalse();
    }
}