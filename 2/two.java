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
            System.out.println(search);
    }
}
