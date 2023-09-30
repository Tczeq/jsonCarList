import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Interior {

    private int leatherSterringWheel;
    private int alcantaraOnSeat;
    private int speedometerInKmh;


    public int getTotalCostOfInterior() {
        return leatherSterringWheel + alcantaraOnSeat + speedometerInKmh;
    }
}
