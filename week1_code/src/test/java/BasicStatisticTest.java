import org.junit.Test;

import static org.junit.Assert.*;

public class BasicStatisticTest {


    @Test
    public void addDoubleToDataShouldIncreaseSizeOfList() {

    // arrange
    BasicStatistic bs = new BasicStatistic();

    //act
        int totalExpectedItems = 1;
        bs.addDoubleToData(22.3);
        int totalItems = bs.numberOfDataItems();

    //assert
        //
        assertEquals(totalExpectedItems,totalItems);
    }

    @Test
    public void clearItemsShouldSetDataListToZero() {

        //arrange
        BasicStatistic bs = new BasicStatistic();

        //act
        bs.addDoubleToData(22.2);
        bs.clearData();
        int amountOfItemsInDataList = bs.numberOfDataItems();

        //assert
        assertEquals(0,amountOfItemsInDataList);

    }

    @Test
    public void numberOfDataItemsShouldReturnTheCurrentAmountOfItemsInList() {

        //arrange
        BasicStatistic bs = new BasicStatistic();

        //act
        int expectedAmountOfItems = 3;
        int currentAmountOfitems;
        bs.addDoubleToData(22.2);
        bs.addDoubleToData(22.2);
        bs.addDoubleToData(22.2);
        currentAmountOfitems = bs.numberOfDataItems();

        //assert
        assertEquals(expectedAmountOfItems,currentAmountOfitems);
    }

    @Test
    public void sumShouldReturnTheSumOFAllItemsInDataList(){
        //arrange
        BasicStatistic bs = new BasicStatistic();

        //act
        Double expectedSumOfAllItems = 44.4;
        Double actualSumOfAllItems;

        bs.addDoubleToData(22.2);
        bs.addDoubleToData(22.2);

        actualSumOfAllItems = bs.sum();

        //assert
        assertEquals(expectedSumOfAllItems,actualSumOfAllItems,0.5);
    }
}