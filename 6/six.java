import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.swing.text.html.HTMLDocument.Iterator;

public class six {
    public static void main(String[] args) {

        MySet ms = new MySet();
        ms.add(5);
        ms.add(4);
        ms.add(3);
        
        System.out.println(ms.toString());
        System.out.println(ms.get(0));
        System.out.println(ms.isEmpty());
        System.out.println(ms.size());
        ms.remove(3);
        System.out.println(ms.toString());
       

    }
}
        class MySet {
            
            private HashMap<Integer, Object> hp = new HashMap<>();
            private static final Object mo = new Object();

             public void add(int num){
                hp.put(num, mo);
             } 

            public String toString(){
                return hp.keySet().toString();
            }

            public Integer get(int index){
                List<Integer> arr =  new ArrayList<>(hp.keySet());
                return arr.get(index);
            }

            public void remove(int el){
                hp.remove(el);
            }
            
            public boolean isEmpty(){
                return (hp.size()==0);
            }

            public Integer size(){
                return hp.size();
            }
                
            }


        
   

