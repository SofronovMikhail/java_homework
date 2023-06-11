import java.util.Arrays;

public class two {
    public static void main(String[] args){
        String head = "select * from students where";
        StringBuilder search = new StringBuilder("{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}");
        search.deleteCharAt(search.indexOf("{"));
        search.deleteCharAt(search.indexOf("}"));
        for(int i = 0; i < search.length(); i++){
            search.deleteCharAt(search.indexOf("\""));
            if(search.indexOf("\"") == -1){
                break;
            }
            }
        for(int j = 0; j < search.length(); j++){
            if(search.charAt(j) == ':'){
                search.setCharAt(j, '=');
            }
            }
            String[] arr = search.toString().split(",");
            for (int i = 0; i < arr.length; i++){
                if(arr[i] == "null"){
                    arr[i] = "";
                }
            }
            System.out.println(Arrays.toString(arr));
    }
}
