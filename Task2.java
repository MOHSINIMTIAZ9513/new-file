import java.io.*;
import java.util.Scanner;
class Task2 {
    public static void main (String [] args) {
        String file = "userInputToFile.txt";

        Scanner scan = new Scanner(System.in);
        
        try {
        FileWriter fw = new FileWriter(file);
        while(true){
            
            String input = scan.nextLine();
            if("0".equalsIgnoreCase(input.trim())){
                break;
            }
            fw.write(input + "\n");
        }
        scan.close();
        fw.close();
         }catch(Exception ex){
        return;
    }
        }
    }
