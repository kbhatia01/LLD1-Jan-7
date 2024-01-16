package MergeSortInThreads;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        List<Integer> arr = List.of(8,1,2,9,6,3,7,5);
        ExecutorService es = Executors.newFixedThreadPool(10);
        Sorter arrSorter = new Sorter(arr, es);
        Future<List<Integer>> sortedData = es.submit(arrSorter);
        List<Integer> sortedArr = sortedData.get();

        for (Integer i : sortedArr){
            System.out.println(i);
        }
    }
}
