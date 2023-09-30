import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.*;

//@AllArgsConstructor
//@NoArgsConstructor
@Getter
@ToString
public class Car {

    @Getter
    private String brand;
    @Getter
    private String model;
//    @JsonProperty("isTurbo")
    private Boolean turbo;
    @Getter
    private double capacityEngine;
    @Getter
    private Exterior exterior;
    @Getter
    private Interior interior;

    @Getter
    private static List<Car> carList = new ArrayList<>();



    @JsonCreator
    public Car(@JsonProperty("brand") String brand,
               @JsonProperty("model") String model,
               @JsonProperty("turbo") Boolean turbo,
               @JsonProperty("capacityEngine") double capacityEngine,
               @JsonProperty("exterior") Exterior exterior,
               @JsonProperty("interior") Interior interior) {
        this.brand = brand;
        this.model = model;
        this.turbo = turbo;
        this.capacityEngine = capacityEngine;
        this.exterior = exterior;
        this.interior = interior;
        carList.add(this);
    }


    public int getTotalCostOfAccessories() {
        return exterior.getTotalCostOfExterior() + interior.getTotalCostOfInterior();
    }

    public static Car getMostExpensiveCar () {
        return Optional.ofNullable(carList)
                .orElse(Collections.emptyList())
                .stream()
                .filter(Objects::nonNull)
                .max(Comparator.comparing(Car::getTotalCostOfAccessories))
                .orElseThrow(NoSuchElementException::new);
    }

}
