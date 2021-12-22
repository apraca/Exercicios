package br.com.bootcamp.aula1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RadixSort {

    public static  void radixSort(int iArr[]){
        int ordArr[] = new int[iArr.length];

         Arrays.sort(iArr,
                0,
                11);

        return;
    }

    public static void main(String[] args) {
        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};
        ArrayList<String> strArr = new ArrayList<>();
        List<String> compZero = new ArrayList<>();


        radixSort(iArr);

        for (int i : iArr){
            System.out.println(i + " ");
        }

        for (int j = 0; j < iArr.length; j++) {
            String generate = iArr[j] + "";
            strArr.add(generate);
        }

        System.out.println(strArr);

        //****************************************************

        int tamnum = strArr.size() - 1;
        String maiorNum = strArr.get(tamnum);
        int countCarac = maiorNum.length();


        for (Integer i=0; i < strArr.size(); i++){
            String concatzero = strArr.get(i);
            while(concatzero.length() < countCarac){
                 concatzero = "0" + concatzero;
            }
            compZero.add(concatzero);
        }

        System.out.println(compZero);



        List<String> L0 = new ArrayList<>();
        List<String> L1 = new ArrayList<>();
        List<String> L2 = new ArrayList<>();
        List<String> L3 = new ArrayList<>();
        List<String> L4 = new ArrayList<>();
        List<String> L5 = new ArrayList<>();
        List<String> L6 = new ArrayList<>();
        List<String> L7 = new ArrayList<>();
        List<String> L8 = new ArrayList<>();
        List<String> L9 = new ArrayList<>();

        for (Integer i=0; i <= compZero.size()-1; i++) {
            String str = compZero.get(i).substring(compZero.get(i).length() - 1);
            switch (str){
                case "0": L0.add(compZero.get(i));
                            break;
                case "1": L1.add(compZero.get(i));
                    break;
                case "2": L2.add(compZero.get(i));
                    break;
                case "3": L3.add(compZero.get(i));
                    break;
                case "4": L4.add(compZero.get(i));
                    break;
                case "5": L5.add(compZero.get(i));
                    break;
                case "6": L6.add(compZero.get(i));
                    break;
                case "7": L7.add(compZero.get(i));
                    break;
                case "8": L8.add(compZero.get(i));
                    break;
                case "9": L9.add(compZero.get(i));
                    break;

            }



        }

        strArr.clear();
        strArr.addAll(L0);
        strArr.addAll(L1);
        strArr.addAll(L2);
        strArr.addAll(L3);
        strArr.addAll(L4);
        strArr.addAll(L5);
        strArr.addAll(L6);
        strArr.addAll(L7);
        strArr.addAll(L8);
        strArr.addAll(L9);

        System.out.println(strArr);

        L0.clear();
        L1.clear();
        L2.clear();
        L3.clear();
        L4.clear();
        L5.clear();
        L6.clear();
        L7.clear();
        L8.clear();
        L9.clear();

        for (Integer i=0; i <= compZero.size()-1; i++) {
          char[] penultdig = compZero.get(i).toCharArray();
          String str;
          str = "" + penultdig[countCarac - 2];
            switch (str){
                case "0": L0.add(compZero.get(i));
                    break;
                case "1": L1.add(compZero.get(i));
                    break;
                case "2": L2.add(compZero.get(i));
                    break;
                case "3": L3.add(compZero.get(i));
                    break;
                case "4": L4.add(compZero.get(i));
                    break;
                case "5": L5.add(compZero.get(i));
                    break;
                case "6": L6.add(compZero.get(i));
                    break;
                case "7": L7.add(compZero.get(i));
                    break;
                case "8": L8.add(compZero.get(i));
                    break;
                case "9": L9.add(compZero.get(i));
                    break;

            }



        }

        strArr.clear();
        strArr.addAll(L0);
        strArr.addAll(L1);
        strArr.addAll(L2);
        strArr.addAll(L3);
        strArr.addAll(L4);
        strArr.addAll(L5);
        strArr.addAll(L6);
        strArr.addAll(L7);
        strArr.addAll(L8);
        strArr.addAll(L9);

        System.out.println(strArr);



    }


}
