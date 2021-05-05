/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question10.Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jeevan Bodigam
 */
public class SearchElement {

    static int searchNumber(List<Integer> list, int nmbr, int s, int l) {
        int mid = (l + s) / 2;
        if (nmbr == list.get(mid)) {
            return mid;
        }
        if (l < s) {
            return -1;
        }
        if (nmbr < list.get(mid)) {
            return searchNumber(list, nmbr, s, mid - 1);
        }
        if (nmbr > list.get(mid)) {
            return searchNumber(list, nmbr, mid + 1, l);
        }
        return -1;

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> searchArray = new ArrayList<>();
        searchArray.add(10);
        searchArray.add(1);
        searchArray.add(20);
        searchArray.add(87);
        searchArray.add(8);
        searchArray.add(5);
        searchArray.add(25);
        searchArray.add(6);
        Scanner scan = new Scanner(System.in);
        searchArray.forEach(i -> {
            System.out.print(i + " ");
        });
        System.out.println("");
        System.out.println("Enter the search element from the array above!!!!");
        int searchNmbr = scan.nextInt();
//        int[] intArray=new int[searchArray.size()];
//        for(int x=0;x<searchArray.size();x++){
//            intArray[x]=searchArray.get(x);    
//        }
//        Arrays.sort(intArray);
        Collections.sort(searchArray);
        int found = searchNumber(searchArray, searchNmbr, 0, searchArray.size() - 1);
        if (found != -1) {
            System.out.println("Element found in the list...");
        } else {
            System.out.println("Element not found...");
        }
    }

}
