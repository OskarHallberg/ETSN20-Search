import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Find {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String arguments = sc.nextLine();
    String searchWord = arguments.split(" ")[1];
    String fileName = arguments.split(" ")[2];
    try {
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data.contains(searchWord)) {
            System.out.println(data);
        }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}