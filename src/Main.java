import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int[] arr = new int[]{1, 2, 3};
        float[] nums = {1.57f, 7.654f, 9.986f};
        int[] weight = {3, 5, 6, 32, 5};
        System.out.println("Задача 2");
        //простой способ вручную выводить по индексу
        System.out.println(arr[0] + "," + arr[1] + "," + arr[2]);
        // тут мы еще не проходили, вроде пойдет. в  условиях про квадратные скобки ничего нет
        System.out.println(Arrays.toString(nums));
        // а вот тут я вспотел и придумал такое, как получилось сам удивился.
        for (int i = 0; i < weight.length; i++) {
            System.out.print(weight[i]);
            if (i < weight.length - 1) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Задача 3");
        // тут попробую вывести третьим способом, но в обратном порядке
        // p.s. Подумать пришлось над первым вариантом, а остальное только менять названия массива, ураа

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i <= arr.length && i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = nums.length - 1; i >= 0; i--) {
            System.out.print(nums[i]);
            if (i <= nums.length && i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        for (int i = weight.length - 1; i >= 0; i--) {
            System.out.print(weight[i]);
            if (i <= weight.length && i > 0) {
                System.out.print(",");
            }
        }
        System.out.println();
        System.out.println("Задача 4");
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                arr[i]++;
            }
            System.out.println(arr[i]);

        }



    }
}
