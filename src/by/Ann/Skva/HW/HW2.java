package by.Ann.Skva.HW;

public class HW2 {
    public static void main(String[] args) {
        int[]array1 = {2,3,5,7,8,23,56,78,87,92};
        int sum = 0;
        int av = 0;
        for(int i=0; i< array1.length; i++) {
            sum += array1[i];
            av = sum/array1.length;
        }
        System.out.println(sum);
        System.out.println(av);
    }
}
