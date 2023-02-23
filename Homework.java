import java.util.Arrays;

public class Homework {
    public static void main(String args[]) {
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        heapSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + "\n");
        }
    }
    
    //функция для выполнения пирамидальной сортировки массива `A` размера `n`
    public static void heapSort(int[] sortArr) {
    //строим приоритетную очередь и инициализируем ее заданным массивом
    int n = sortArr.length;

    //build-heap: вызывать heapify, начиная с последнего внутреннего
    //узел до корневого узла
    int i = (n - 2) / 2;
    while (i >= 0) {
        heapify(sortArr, i--, n);
    }

    //несколько раз извлекаем из кучи, пока она не станет пустой
    while (n > 0) {
        sortArr[n - 1] = pop(sortArr, n);
        n--;
    }
    }
}