import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> arrA = new ArrayList<>();
        ArrayList<String> arrB = new ArrayList<>();

        System.out.println("Enter 5 numbers for Arr a: ");
        for(int i = 0; i < 5; i++){
            arrA.add(scanner.nextLine());
        }
        for(String s : arrA){
            System.out.print(s + " ");
        }
        System.out.println(" ");
        System.out.println("Enter 5 numbers for Arr b: ");
        for(int i = 0; i < 5; i++){
            arrB.add(scanner.nextLine());
        }
        for(String s : arrB){
            System.out.print(s + " ");
        }
        System.out.println(" ");
        ArrayList<String> arrC = new ArrayList<>();

        for(int i = 0; i < 5; i+=1){
            arrC.add(arrA.get(i));
            arrC.add(arrB.get(4 - i));
        }
        System.out.println("Sort C arrayList ");
        Collections.sort(arrC);
        System.out.println(arrC);
    }
}
