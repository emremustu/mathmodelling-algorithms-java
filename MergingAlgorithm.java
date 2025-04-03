import java.util.LinkedList;

public class MergingAlgorithm {

    public static LinkedList<Integer> mergeSort(LinkedList<Integer> list) {
        
        if (list.size() <= 1) {
            return list;
        }

        // Ortayı bul ve iki alt liste oluştur
        int midIndex = list.size() / 2;
        LinkedList<Integer> firstList = new LinkedList<>(list.subList(0, midIndex));
        LinkedList<Integer> secondList = new LinkedList<>(list.subList(midIndex, list.size()));

        
        firstList = mergeSort(firstList);
        secondList = mergeSort(secondList);

        return merge(firstList, secondList);
    }

    
    public static LinkedList<Integer> merge(LinkedList<Integer> firstList, LinkedList<Integer> secondList) {
        LinkedList<Integer> finalList = new LinkedList<>();

        
        while (!firstList.isEmpty() && !secondList.isEmpty()) {
            if (firstList.getFirst() < secondList.getFirst()) {
                finalList.add(firstList.removeFirst());
            } else {
                finalList.add(secondList.removeFirst());
            }
        }

        
        while (!firstList.isEmpty()) {
            finalList.add(firstList.removeFirst());
        }
        while (!secondList.isEmpty()) {
            finalList.add(secondList.removeFirst());
        }

        return finalList;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(80);
        list.add(9);
        list.add(18);
        list.add(47);
        list.add(21);
        list.add(32);
        list.add(3);

        list = mergeSort(list);

        System.out.println(list);

    }

}
