import java.io.*;
import java.util.Scanner;

public class IntegerData {
    public static int[] DataArray = new int[100];

    public static void ReadFile() {
        File file = new File("IntegerData.txt");
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            for (int i = 0; i < 100; i++) {
                DataArray[i] = Integer.parseInt(reader.readLine());
            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("IO Exception");
        }
    }

    public static int FindValues(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number to search: ");
        int value = keyboard.nextInt();
        int k = 0;
        for (int i = 0; i < 100; i++) {
            if(DataArray[i] == value){
                k = k + 1;
            }
        }
        return k;
    }

    public static void main(String[] args){
        ReadFile();
        int a = FindValues();
        System.out.println("The given number occurs " + a + " times");
    }
}
