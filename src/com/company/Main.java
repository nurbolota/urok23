package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("~~~~~ArrayList~~~~~");
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        int arr = 0;
        for (int i = 0; i < 10; i++) {
            arr = random.nextInt(2);
            arrayList.add(arr);
        }

        method(arrayList);

        System.out.println("~~~~~~~LinkedList~~~~~~~~");
        LinkedList<Integer> lin = new LinkedList<>();
        Random random2=new Random();
        for (int i = 0; i < 10; i++) {
            int arr2 = random.nextInt(0, 2);
            lin.add(arr2);



        }method(lin);
        System.out.println("~~~~~Massiv~~~~~");
        int[]massiv=new int[10];
        for (int i = 0; i < massiv.length ; i++) {
            int mas=random.nextInt(2);


        }method(massiv);

    }

    private static void method(ArrayList<Integer> arrayList) {
        System.out.println(arrayList);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
    private static void method(LinkedList<Integer>lin){
        System.out.println(lin);
        Collections.sort(lin);
        System.out.println(lin);

    }private static void method(int[]massiv){
        System.out.println(Arrays.toString(massiv));
        Arrays.sort(massiv);
        System.out.println(Arrays.toString(massiv));


    }




    }



	



