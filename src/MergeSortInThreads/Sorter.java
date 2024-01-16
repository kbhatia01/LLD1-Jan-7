package MergeSortInThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    private List<Integer> arrayToSort;
    private ExecutorService es;
    Sorter(List<Integer> arr, ExecutorService es){
        this.arrayToSort = arr;
        this.es = es;
    }

    public List<Integer> call() throws ExecutionException, InterruptedException {

        if(arrayToSort.size()<=1){
            return arrayToSort;
        }

        // divide
        int size = arrayToSort.size();
        int mid = size/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }
        for(int i=mid;i<size;i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter s = new Sorter(leftArray, es);
        Sorter s1 = new Sorter(rightArray, es);

        // create threads
        Future<List<Integer>> leftSortedArrayFuture = es.submit(s);
        Future<List<Integer>> rightSortedArrayFuture =es.submit(s1);

        // wait for the response
        List<Integer> sortedLeftArray = leftSortedArrayFuture.get();
        List<Integer> sortedRightArray = rightSortedArrayFuture.get();

        // merge..
        int i = 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while ( i < sortedLeftArray.size() && j <sortedRightArray.size()){
            if(sortedLeftArray.get(i) <= sortedRightArray.get(j)){
                sortedArray.add(sortedLeftArray.get(i));
                i+=1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j+=1;
            }
        }
        while (i<sortedLeftArray.size()){
            sortedArray.add(sortedLeftArray.get(i));
            i+=1;
        }
        while (j<sortedRightArray.size()){
            sortedArray.add(sortedRightArray.get(j));
            j+=1;
        }
        return sortedArray;

    }
}
