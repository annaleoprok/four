import java.util.InputMismatchException;
import java.util.Scanner;




public class four_project {




    public static void main(String[] args) {
        System.out.println("count");
        Scanner sc = new Scanner(System.in);
        try {
            int count = sc.nextInt();
            float[] arr = new float[count];
            for (int i = 0; i < count; i++) {
                System.out.println("input element with index" + i);
                arr[i] = sc.nextFloat();
            }

            int negNumberCount = 0;
            float min = 0;
            int indexMin = -1;
            for (int i = 0; i < count; i++){
                if(arr[i]<0){
                    indexMin = i;
                    min = arr[indexMin];
                    negNumberCount++;
                }
            }
            if(negNumberCount!=0){
                for (int i = 0; i < count; i++){
                    if(min>arr[i]){
                        indexMin = i;
                        min = arr[indexMin];
                    }
                }
                System.out.println("Минимум ="+ min + "индекс" + indexMin);
            }
            else{
                throw new RuntimeException("Нет отрицательных элементов");
            }
        }
        catch (InputMismatchException ie) {
            System.out.println("Ввод строки вместо числа");
        }
    }
}
