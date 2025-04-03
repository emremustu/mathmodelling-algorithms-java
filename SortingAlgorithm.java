import java.util.LinkedList;


public class SortingAlgorithm {

    public static void sortList(LinkedList<Integer> list){
       

        LinkedList<Integer> sortedLinkedList = new LinkedList<>();
        LinkedList<Integer> tempList = new LinkedList<>();
        

        while(!list.isEmpty()){
            int dummy = list.getLast();
            if(sortedLinkedList.isEmpty()){
                sortedLinkedList.add(dummy);
                list.removeLast();
            }
            else{
                while(!sortedLinkedList.isEmpty() && dummy<sortedLinkedList.getLast()){
                    tempList.add(sortedLinkedList.getLast());
                    sortedLinkedList.removeLast();
                }
                sortedLinkedList.add(dummy);
                list.removeLast();

                while(!tempList.isEmpty()){
                    sortedLinkedList.add(tempList.getLast());
                    tempList.removeLast();
                }
            }

        

        }

        while (!sortedLinkedList.isEmpty()) {
            list.add(sortedLinkedList.removeLast());
        }

    }


    public static void main(String[] args) {
        LinkedList<Integer> newIntegers = new LinkedList<>();
        newIntegers.add(19);
        newIntegers.add(2);
        newIntegers.add(1);
        newIntegers.add(7);
        newIntegers.add(3);
        newIntegers.add(18);
        
        sortList(newIntegers);

        
        while(!newIntegers.isEmpty()){
            System.out.println(newIntegers.getLast());
            newIntegers.removeLast();
        }

    }

}
