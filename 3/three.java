import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class three {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            int j = new Random().nextInt(0, 10);
            if(j%2 != 0){
                list.add(j);
            }
        }
        System.out.println(list);
        list.sort(Comparator.naturalOrder());
        System.out.println(list.get(0));
        System.out.println(list.get(list.size()-1));
        java.util.Iterator<Integer>iter = list.iterator();
        double sum = 0;
        while(iter.hasNext()){
            int i = iter.next();
            sum+=i;
        }
        System.out.println(sum/list.size());     
    }
}

