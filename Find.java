import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class Find {
  public static void main(String[] args) {

    System.out.println("Please enter your word and file:\n");
    Scanner sc = new Scanner(System.in);
    String arguments = sc.nextLine();
    String func = arguments.split(" ")[0];
    String searchWord = arguments.split(" ")[1];
    String fileName = arguments.split(" ")[2];
    try {
      if(!func.toUpperCase().equals("SEARCH")) {
        System.out.println("No such input function, try again!");
        return; 
      }
      File myObj = new File(fileName);
      Scanner myReader = new Scanner(myObj);
      System.out.println("These are the following lines containing your word:\n");
      int i = 0;
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        if(data.toUpperCase().contains(searchWord.toUpperCase())) {
            System.out.println(i + ": " + data + "\n");
        }
        i++;
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}