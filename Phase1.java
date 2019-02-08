package restaurant;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Phase1 {
    
    public static void main(String[] args) {
        try {
            File restaurantFile = new File("restaurant.txt");
            Scanner input = new Scanner(restaurantFile);
        } catch (FileNotFoundException e) {
            System.out.println("Could not find restaurant.txt");
            return;
        }
        
    }
    
}
