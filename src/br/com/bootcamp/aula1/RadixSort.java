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




    }


}
