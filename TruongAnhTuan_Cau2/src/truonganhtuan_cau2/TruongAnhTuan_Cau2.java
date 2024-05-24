/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package truonganhtuan_cau2;

import java.util.ArrayList;

/**
 *
 * @author FPTSHOP
 */
public class TruongAnhTuan_Cau2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Integer> arrayList = new ArrayList<>();
       arrayList.add(5);
       arrayList.add(3);
       arrayList.add(9);
       arrayList.add(2);
       int temp;
       for (int i = 0; i < arrayList.size() - 1; i++) {
           for (int j = i + 1; j < arrayList.size(); j++) {
               if (arrayList.get(i) > arrayList.get(j)) {
                   temp = arrayList.get(i);
                   arrayList.set(i, arrayList.get(j));
                   arrayList.set(j, temp);
               }
           }
       }
       System.out.println(arrayList);
    }
    
}
