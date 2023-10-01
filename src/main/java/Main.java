

public class Main {

    public static void main(String[] args) {
            int[] array = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
            int sum = 0;
            int averageSum = sum / 12;
            // цикл для обхода каждого элемента массива
            for( int num : array) {
                // суммирование каждого элемента массива
                sum = sum + num;
                averageSum = sum / 12;
            }
            System.out.println("Сумма всех продаж: " + sum);
            System.out.println("Средняя сумма продаж: " + averageSum);
        }
    }


