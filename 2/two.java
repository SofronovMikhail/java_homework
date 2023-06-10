import java.util.Arrays;

public class two {
    public static void main(String[] args){
        System.out.println(method1());
        System.out.println(method2());

        String str = "Раздробленность русских земель просуществовала до середины 16 века. Положение дел в это время было крайне тяжелым, поскольку длительное монголо-татарское иго, а также междоусобные войны, которые практически не прекращались, поставили страну на грань исчезновения. Внутри страны порядка не было, жители были недовольны. Грозные соседи, видя слабость и обособленность русских правителей, стремились отвоевать у слабого врага территорию. Великая история России до этого не знавала такого бедственного положения дел. Понимая необходимость централизованного управления русскими землями, Иван 4 Грозный в 1547 г. официально провозгласил свои владения царством, а себя царем, которому принадлежат все земли. Этот шаг способствовал стабилизации ситуации. В дальнейшем, благодаря единовластию, стране удалось отвоевать утраченные исконно русские владения, а также присвоить новые.  Просуществовало русское царство вплоть до 2 ноября 1721 года. Именно в этот день Петр 1 объявил себя первым императором, а страну назвал Империей. Так началась новая Великая история. Много славных страниц было в истории Империи, много было и печальных. Суть данной формы заключается в сохранении власти сильным правителем, который жестко может отстаивать интересы и целостность страны. Как только к управлению пришел Николай 2 в Империи начались революционные движения. Император не сумел должным образом обуздать мятежников, в результате 7 ноября 1917 Российская Империя рухнула, и образовался союз советских социалистических республик, который в свою очередь просуществовал до декабря 1991 года.";
        StringBuilder str1 = new StringBuilder("Раздробленность русских земель просуществовала до середины 16 века. Положение дел в это время было крайне тяжелым, поскольку длительное монголо-татарское иго, а также междоусобные войны, которые практически не прекращались, поставили страну на грань исчезновения. Внутри страны порядка не было, жители были недовольны. Грозные соседи, видя слабость и обособленность русских правителей, стремились отвоевать у слабого врага территорию. Великая история России до этого не знавала такого бедственного положения дел. Понимая необходимость централизованного управления русскими землями, Иван 4 Грозный в 1547 г. официально провозгласил свои владения царством, а себя царем, которому принадлежат все земли. Этот шаг способствовал стабилизации ситуации. В дальнейшем, благодаря единовластию, стране удалось отвоевать утраченные исконно русские владения, а также присвоить новые.  Просуществовало русское царство вплоть до 2 ноября 1721 года. Именно в этот день Петр 1 объявил себя первым императором, а страну назвал Империей. Так началась новая Великая история. Много славных страниц было в истории Империи, много было и печальных. Суть данной формы заключается в сохранении власти сильным правителем, который жестко может отстаивать интересы и целостность страны. Как только к управлению пришел Николай 2 в Империи начались революционные движения. Император не сумел должным образом обуздать мятежников, в результате 7 ноября 1917 Российская Империя рухнула, и образовался союз советских социалистических республик, который в свою очередь просуществовал до декабря 1991 года.");
        long start = System.currentTimeMillis();
        for(int i= 0;  i < str.length(); i++){
            str.replace("a", "A");
        }
        System.out.println(System.currentTimeMillis() - start);

        start = System.currentTimeMillis();
        for(int i = 0;  i < str1.length(); i++){
            str1.replace(str1.indexOf("a")+1, str1.indexOf("a")+2, "A");
        }
        System.out.println(System.currentTimeMillis() - start);
        }
        
       
        public static StringBuilder method1(){
        StringBuilder head = new StringBuilder("select * from students where ");
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
        
            for(String i: arr) {
                if(i.contains("null")){
                }
                else{head.append(i);}
            }         
            return head;
        }
    
        public static StringBuilder method2(){
        StringBuilder students = new StringBuilder("[{\"name\":\"Ivanov\",\"estimation\":\"5\",\"object\":\"Mathematics\"},{\"name\":\"Petrova\",\"estimation\":\"4\",\"object\":\"Informatics\"},{\"name\":\"Krasnov\",\"estimation\":\"5\",\"object\":\"Physics\"}]"); 
        students.deleteCharAt(students.indexOf("["));
        students.deleteCharAt(students.indexOf("]"));    
        for(int i = 0; i < students.length(); i++){
            if(students.charAt(i) == '{'){
                students.deleteCharAt(i);
            }
            if (students.charAt(i) == '}'){
                students.deleteCharAt(i);
            } 
        }
        for(int j = 0; j < students.length(); j++){
           if (students.charAt(j) == '"'){
                students.deleteCharAt(j);
            } 
        }
        for(int j = 0; j < students.length(); j++){
             if (students.charAt(j) == ','){
                students.setCharAt(j, ' ');
            } 
    }
        for(int j = 0; j < students.length(); j++){
             if (students.charAt(j) == ':'){
                 students.setCharAt(j, ' ');
             } 
    }   
        String n = "name";
        int name = students.indexOf("name");
        name = students.indexOf("name");
        students.replace(name, name + n.length(), "Student");
        name = students.indexOf("name");
        students.replace(name, name + n.length(), "Student");

        String es = "estimation";
        int estimation = students.indexOf("estimation");
        students.replace(estimation, estimation + es.length(), "get");
        estimation = students.indexOf("estimation");
        students.replace(estimation, estimation + es.length(), "get");
        estimation = students.indexOf("estimation");
        students.replace(estimation, estimation + es.length(), "get");

        String ob = "object";
        int object = students.indexOf("object");
        students.replace(object, object + ob.length(), "in the subject");
        object = students.indexOf("object");
        students.replace(object, object + ob.length(), "in the subject");
        object = students.indexOf("object");
        students.replace(object, object + ob.length(), "in the subject");

        return students;    
    } 

    
}
            
         


