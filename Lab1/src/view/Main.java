/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import Common.Library;
import controller.Sort;
import model.Element;

/**
 *
 * @author vothi
 */
public class Main {
     public static void main(String[] args) {
      Library library = new Library();
        Element element = new Element();
        element.setSize_arr(library.getInt("Enter number of array", 1, 100));
        element.setArr(library.createArray(element.size_arr));
        Sort sort = new Sort(element);
        sort.run();
        
       
}
}