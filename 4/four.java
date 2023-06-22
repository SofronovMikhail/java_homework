import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javax.print.attribute.IntegerSyntax;

public class four {
    public static void main(String[] args){
        ArrayList <StringBuilder> name1 = new ArrayList<>();
        ArrayList <StringBuilder> name2 = new ArrayList<>();
        ArrayList <StringBuilder> name3 = new ArrayList<>();
        ArrayList <StringBuilder> gender = new ArrayList<>();
        ArrayList <Integer> age = new ArrayList<>();

        Scanner in = new Scanner(System.in);

        for(int i = 0; i >= 0;  i++){

            System.out.print("Input name1 or output sort click \"q\": ");
            StringBuilder name = new StringBuilder(in.next());

            if(name.toString().equals("q") == true){
                for(int j = 0; j < name1.size();  j++){
                    System.out.println(name1.get(j)+" "+name2.get(j)+" "+name3.get(j)+" "+gender.get(j)+" "+age.get(j));
                }

                System.out.print("Sort_age ArrayList: "+"\n");
                
                ArrayList <Integer> age1 = new ArrayList<>(age);
                age1.sort(Comparator.naturalOrder());
                for(int e = 0; e < age1.size(); e++){
                    int index = age.indexOf(age1.get(e));
                    System.out.println(name1.get(index)+" "+name2.get(index)+" "+name3.get(index)+" "+gender.get(index)+" "+age.get(index));
                }
                break;
            }
            name1.add(name);
            System.out.print("Input name2: ");
            StringBuilder name_name = new StringBuilder(in.next());
            name2.add(name_name);
            System.out.print("Input name3: ");
            StringBuilder name_name_name = new StringBuilder(in.next());
            name3.add(name_name_name);
            System.out.print("Input gender: ");
            StringBuilder gender1 = new StringBuilder(in.next());
            gender.add(gender1);
            System.out.print("Input age: ");
            int age1 = Integer.parseInt(in.next());
            age.add(age1);
        }
        in.close();
        
    }
}
