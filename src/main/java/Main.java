import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {
zzzv
    private static final String PATH = "src/main/resources/";

    public static void main(String[] args) throws IOException{
        ObjectMapper mapper = new ObjectMapper();

        Car rs3 = mapper.readValue(new File(PATH + "car.json"), Car.class);
        Car rs5 = mapper.readValue(new File(PATH + "car2.json"), Car.class);
        Car rs6 = mapper.readValue(new File(PATH + "car3.json"), Car.class);


        System.out.println(Car.getMostExpensiveCar());
        System.out.println(rs3.getTotalCostOfAccessories());
        System.out.println(rs5.getTotalCostOfAccessories());
        System.out.println(rs6.getTotalCostOfAccessories());
    }

}
