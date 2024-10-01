package esercizio2;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> arrOrd = orderList(10);
        System.out.println(arrOrd);
        System.out.println(orderListOp(arrOrd));
        showParDis(arrOrd, false);
    }


    public static ArrayList<Integer> orderList (int number){
        ArrayList<Integer> casualNumber = new ArrayList<>();
        for (int i = 0; i < number; i++) {
            casualNumber.add((int) (Math.floor(Math.random() * 100 )));
        }
        Collections.sort(casualNumber);
        ArrayList<Integer> orderNumeber = new ArrayList<>(casualNumber);
        return orderNumeber;
    }

    public static ArrayList<Integer> orderListOp (ArrayList<Integer> arr){
        ArrayList<Integer> arrCont = new ArrayList<>();
        for (int i = arr.size() - 1 ; i >= 0; i--) {
            arrCont.add(arr.get(i));
        }
        return arrCont;
    }

    public static void showParDis (ArrayList<Integer> arr, boolean bool){
        if(bool){
            for (int i = 0; i < arr.size(); i++) {
                if(i % 2 == 0){
                    System.out.println(arr.get(i));
                }
            }
        }
        else {
            for (int i = 0; i < arr.size(); i++) {
                if(i % 2 != 0){
                    System.out.println(arr.get(i));
                }
            }
        }
    }
}
