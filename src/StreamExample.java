import java.util.Arrays;

public class StreamExample {
    public static void main(String[] args) {
        int [] numbers = {5,3,8,1,9,2,6,4,7};

        int max = Arrays.stream(numbers).max().orElseThrow();
        System.out.println("максимальное число: "+ max);

        int min = Arrays.stream(numbers).min().orElseThrow();
        System.out.println("минимальное число: "+ min);

        int sumOfEvens = Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)
                .sum();
        System.out.println("сумма четных чисел: "+ sumOfEvens);

        System.out.println("элементы начиная с 5:");
        Arrays.stream(numbers)
                .skip(4)
                .forEach(System.out::println);

    }
}
