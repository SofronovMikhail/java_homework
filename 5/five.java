import java.lang.ref.PhantomReference;
import java.net.SocketPermission;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.*;
import java.util.Map.*;
public class five {
   public static void main(String[] args) {
        HashMap<String, String>phonebook = new HashMap<>();
        phonebook.put("Ivanov", "11111");
        phonebook.put("Danilov", "11111");
        phonebook.put("Chehov", "11111");

        phonebook.merge("Chehov", "22222", (oldValue, newValue) -> oldValue + ";" + newValue);
        phonebook.merge("Ivanov", "22222", (oldValue, newValue) -> oldValue + ";" + newValue);
        phonebook.merge("Ivanov", "33333", (oldValue, newValue) -> oldValue + ";" + newValue);
        
        List<String> list = new ArrayList<String>(phonebook.values());
        list.sort(Comparator.naturalOrder());

        for (int i = 0; i < phonebook.size(); i++){
            for(String s: phonebook.values()){
                if(list.get(i) == s){
                     System.out.println(s);
            }
        }
        
    } 
       
    }
        
}
