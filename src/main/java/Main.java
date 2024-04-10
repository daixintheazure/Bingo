import java.util.ArrayList;

// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

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