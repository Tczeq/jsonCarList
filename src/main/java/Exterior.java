import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
public class Exterior {
    private int nardoGreyColor;
    private int matrixHeadlight;
    private int akrapovicExhaust;


    public int getTotalCostOfExterior() {
        return nardoGreyColor + matrixHeadlight + akrapovicExhaust;
    }
}
