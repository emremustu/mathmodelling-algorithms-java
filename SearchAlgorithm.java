import java.util.LinkedList;

public class SearchAlgorithm {

    public static void findMax(LinkedList<Integer> list){
        
        int highest; 
        if(!list.isEmpty()){
            highest=list.getLast();
            list.removeLast();

            while(!list.isEmpty()){
                if(list.getLast()>highest){
                    highest=list.getLast();
                    list.removeLast();
                }
                else{
                    list.removeLast();
                }
            } 
            System.out.println();
            System.out.println(highest);     
        }
                      
        

    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(9);
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(14);
        

        findMax(list);

    }


}
