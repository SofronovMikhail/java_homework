import java.util.Arrays;
import java.util.Random;

public class one {
    public static void main(String[] args) {
        int i = new Random().nextInt(0, 2000);
        System.out.println(i);
    

        String number = "";
        for(int j = i; j >= 1;){
            if(j % 2 == 0){
                number+="0";
            }
            else{
                number+="1";
            }
            j/=2;
        }
        int n = number.length() - 1;
        System.out.println(n);


        int count1 = 0;
        for(int j = i; j <= Short.MAX_VALUE; j++) {
            if(j % n == 0) {
                count1++;
            }
        }
        int[] m1 = new int[count1];
        int c = 0;
        for(int j = i; j <= Short.MAX_VALUE; j++) {
            if(j % n == 0) {
                m1[c] = j;
                c++;
            }
        }
        System.out.println(Arrays.toString(m1));
       

          int count2 = 0;
        for(int j = i; j >= Short.MIN_VALUE; j--) {
            if(j % n != 0) {
                count2++;
            }
        }    
        int[] m2 = new int[count2];
        int a = 0;
        for(int j = i; j >= Short.MIN_VALUE; j--) {
            if(j % n != 0) {
                m2[a] = j;
                a++;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}