import java.util.Scanner;

public class findElementInArray {
    public static void main(String[] args) {
        Integer[] students = {1,2,3,4,5,6,7,8,9};
//        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name’s student:");
//        String input = scanner.nextLine();
        Integer input = scanner.nextInt();

        boolean isExist = false;
        for (byte i = 0; i < students.length; i++){
//            if (students[i] == input){
            if (students[i].equals(input)){
                System.out.println("Position of the students in the list " + input + " is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist){
            System.out.println("Not found" + input + " in the list.");
        }
    }
}
