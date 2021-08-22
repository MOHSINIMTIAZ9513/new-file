import java.io.File;
import java.io.FileNotFoundException;
//import java.io.PrintWriter;
import java.util.Scanner;


public class Task1 {
    public static void main(String[] args) {

       File file = new File("NewFile.txt");

	try{
		Scanner inpu = new Scanner(file);
		int numb1 = inpu.nextInt();
		int numb2 = inpu.nextInt();
		int sum = numb1 + numb2;
		System.out.printf("FIrst Number is %d\nSecond Number is %d\nSum : %d",numb1,numb2,sum);
	}catch(FileNotFoundException ex){
		return;
	}

    }

}