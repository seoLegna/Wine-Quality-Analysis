import java.util.*;
import java.io.*;

public class ReplaceValues {

    public static void replaceValues() {
        File csv = new File("winequality-white.csv");
        File newFile = new File("winequalitywhite.csv");
        try (BufferedWriter out = new BufferedWriter(new FileWriter(newFile));
        Scanner sc = new Scanner(csv);) {
            while (sc.hasNextLine()) {
                String str = sc.nextLine().replaceAll(";", ",");
                out.write(str);
                out.newLine();
            }
        } catch(Exception e) {
            e.printStackTrace();
            System.out.println("\nSomething went wrong!\n");
        }
    }

    public static void main(String args[]) {
        ReplaceValues.replaceValues();
    }

}