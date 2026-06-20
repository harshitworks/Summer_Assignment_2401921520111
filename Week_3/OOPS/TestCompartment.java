package Week_3.OOPS;

import java.util.Arrays;
import java.util.Random;

public class TestCompartment {
    static void main(String[] args) {
        String[] arr = new String[10];
        Random rand = new Random();
        for(int i = 0; i < arr.length; i++){
            int a = rand.nextInt(1,5);
            Compartment comp;
            if(a==1) {
                comp = new General();
            }
            else if(a==2) {
                comp = new Ladies();
            }
            else if(a==3) {
                comp = new FirstClass();
            }
            else {
                comp = new Luggage();
            }
            arr[i] = comp.notice();
        }
        System.out.println(Arrays.toString(arr));
    }
}
