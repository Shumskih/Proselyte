package main.java.net.proselyte.chapter11.fork_join;

// Простой пример реализации стратегии "разделяй и властвуй".
// В данном примере применяется класс RecursiveAction
import java.util.concurrent.*;
import java.util.*;

// Класс ForkJoinTask преобразует (через класс RecursiveAction) значения элементов массива
// типа double в их квадратные корни
class SqrtTransform extends RecursiveAction {
    // В данном примере пороговое значение произвольно утанавливается равным 1000
    // В реальном коде его оптимальное значение может быть определено в результате
    // профилирования исполняющей системы или эксперементально
    final int seqThreshold = 1000;

    // Обрабатываемый массив
    double[] data;

    // Определить часть обрабатываемых данных
    int start, end;

    SqrtTransform(double[] vals, int s, int e) {
        data = vals;
        start = s;
        end = e;
    }

    // Этот метод выполняет параллельное вычисление
    protected void compute() {
        // Если количество элементов меньше порогового значения,
        // выполнить дальнейшую обработку последовательно
        if ((end - start) < seqThreshold) {
            // Преобразовать значние каждого элемента массива в его квадратный корень
            for (int i = start; i < end; i++) {
                data[i] = Math.sqrt(data[i]);
            }
        } else {
            // В противном случае продолжить разделение, используя разделённые на части данные

            // Найти середину
            int middle = (start + end) / 2;

            // Запустить новые подзадачи на выполнение, используя
            // разделённые на части данные
            invokeAll(new SqrtTransform(data, start, middle),
                    new SqrtTransform(data, middle, end));
        }
    }
}

// Продемонстрировать параллельное выполнение
class ForkJoinDemo {
    public static void main(String[] args) {
        // Создать пул задач
        ForkJoinPool fjp = new ForkJoinPool();

        double[] nums = new double[1_000_000];

        // Присвоить некоторые значения
        for (int i = 0; i < nums.length; i++)
            nums[i] = (double) i;

        System.out.println("Часть исходной последовательности:");

        for (int i = 0; i < 10; i++)
            System.out.println(nums[i] + " ");
        System.out.println("\n");

        SqrtTransform task = new SqrtTransform(nums, 0, nums.length);

        // Запустить главную задачу типа ForkJoinTask на выполнение
        fjp.invoke(task);

        System.out.println("Часть преобразованной последовательности " +
                        " (с точностью до 4х знаков после десятичной точки):");

        for (int i = 0; i < 10; i++)
            System.out.format("%.4f ", nums[i]);
        System.out.println();
    }
}
