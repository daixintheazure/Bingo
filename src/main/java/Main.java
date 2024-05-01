import java.util.ArrayList;
import java.util.Arrays;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {

  

  
  public ArrayList<String> createOrder(ArrayList<String> tempArray) {

    ArrayList<String> order = new ArrayList<String>();

      ArrayList<String> arrayList = tempArray;

      for(int i = 0; i < 24;) {
      int random = (int)(Math.random() * arrayList.size());
        if(!order.contains(arrayList.get(random))) {
          order.add(arrayList.get(random));
          //System.out.println(i);
          i++;
        };
      //order.add(arrayList.get(random));
      //arrayList.remove(random);
    };

    return order;
  }
  
  public static void main(String[] args) {

    final ArrayList<String> selection = new ArrayList<String>();
    selection.add("CLOTTED CBC");
    selection.add("CALLED SERVICE");
    selection.add("TUBE STATION GOES DOWN");
    selection.add("HEMOLYZED SPECIMEN");
    selection.add("WAXED ALCOHOL PAD (FIND IT)");
    selection.add("ED CALLS FOR MISSING SPECIMEN");
    selection.add("CALLED A CRITICAL");
    selection.add("LEVEL 1/MTP");
    selection.add("TECH DOES THE TEG DANCE");
    selection.add("SOMEONE NEEDS GLUCOSE STRIPS");
    selection.add("ANTIBODY");
    selection.add("TALKED TO SALTY NURSE");
    selection.add("SOMEONE CALLS FOR A PHLEBOTOMIST");
    selection.add("COAG TUBE NOT FILLED PROPERLY");
    selection.add("URINE SPILLS IN THE BAG");
    selection.add("TAKE DOWN CHEMISTRY INSTRUMENTS DUE TO YUCKY PROBES");
    selection.add("SLIDE STAINER BREAKS");
    selection.add("SOMEONE CALLS FOR COVID SWABS");
    selection.add("QC DOES NOT PASS THE FIRST TIME");
    selection.add("MISLABLED SAMPLE");
    selection.add("LAB FLOOD");
    selection.add("VISION ABORTS A CARD");
    selection.add("BROKEN GLUCOMETER");
    selection.add("ELAINE TAKES OUT THE TRASH");

    Main main = new Main();
    Main main2 = new Main();
    //System.out.println(main.createOrder(selection));
    //System.out.println("");
    //System.out.println(main2.createOrder(selection));
     

    ArrayList<ArrayList<String>> options = new ArrayList<ArrayList<String>>();

    int count = 25;
    int row = count / 5;
    int counter = 0;


    for (int i = 0; i < row; i++) {
      if (counter < count) {
        ArrayList<String> rowList = new ArrayList<String>();
        options.add(rowList);;
        for (int j = 0; j < row; j++){
          if (counter == 12) {
            rowList.add("Free Space");
            counter++;
          } else {
            rowList.add("option " + (counter+1));
          counter++;
          }
          
        }
      }
      
    }

    
    
    System.out.println(options);
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}