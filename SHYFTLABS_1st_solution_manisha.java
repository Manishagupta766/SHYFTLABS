import java.util.Scanner;

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input : ");
        String input = scanner.nextLine();
        String[] elements = input.split(",");

        int index = findIndexOfNegativeOne(elements);
        
        System.out.println("Output : " + index);
        
        scanner.close();
    }
    
    public static int findIndexOfNegativeOne(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].trim().equals("-1")) {
                return i;
            }
        }
        return -1;
 }
}