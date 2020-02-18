import java.util.ArrayList;
import java.util.List;

/**
 * very simple implementation of the BasicStatisticInterface
 */
public class BasicStatistic implements BasicStatisticInterface {


    ArrayList<Double> DataItems;

    public BasicStatistic() {
         DataItems = new ArrayList<>();
    }

    @Override
    public void addDoubleToData(Double valueToAdd){
        DataItems.add((valueToAdd));
    }

    @Override
    public void clearData(){
        DataItems.clear();
    };
	
    @Override
    public int numberOfDataItems(){
        int rv = 0;
        for (Double d:DataItems) {
            rv++;
        }
        return rv;
    }

    @Override
    public Double sum(){
        double rv = 0.0;
        for (Double d:DataItems) {
            rv+=d;
        }
        return rv;
    }



}
