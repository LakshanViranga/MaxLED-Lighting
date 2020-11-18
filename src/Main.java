import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Main {


    public static int max(int size) {
        int max_pair =0;

        int sequence = 1;
        ArrayList<Integer> powerSource = new ArrayList<Integer>();
        ArrayList<Integer> ledSource = new ArrayList<Integer>();

        for (int i = 0; i < size; i++) {
            powerSource.add(new Integer(sequence));
            ledSource.add(new Integer(sequence));
            sequence++;
        }

        Collections.shuffle(ledSource);

        System.out.print("Power Source :- ");
        for (int i = 0; i < powerSource.size(); i++) {
            System.out.print(powerSource.get(i) + " ");
        }
        System.out.println("");
        System.out.print("LED Source :- ");
        for (int i = 0; i < ledSource.size(); i++) {
            System.out.print(ledSource.get(i) + " ");
        }
        System.out.println("");

        for (int k = 0; k < powerSource.size(); k++) {
            int count = 0;
            int cross_point = 0;
            int cross_point1 = 0;
            for (int i = k; i < powerSource.size(); i++) {
                for (int j = 0; j < ledSource.size(); j++) {
                    if (powerSource.get(i).equals(ledSource.get(j))) {
                        if ((cross_point1 <= i) && (cross_point <= j)) {
                            cross_point1 = i;
                            cross_point = j;
                            count++;
                        } else {
                            cross_point = cross_point;
                        }
                    } else {

                    }
                }
            }

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < ledSource.size(); j++) {
                    if (powerSource.get(i).equals(ledSource.get(j))) {
                        if ((cross_point1 <= i) && (cross_point <= j)) {
                            cross_point = j;
                            count++;
                        } else {
                            cross_point = cross_point;
                        }
                    } else {
                    }
                }
            }
            System.out.println(count);
            if(max_pair<=count){
                max_pair = count;
            }else{
                max_pair = max_pair;
            }
        }

        return  max_pair;
    }


    public static void main(String[] args) {
        System.out.print("Please enter number of LED:- ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int output = max(input);
        System.out.println("Maximum pair =:"+output);

    }
}
