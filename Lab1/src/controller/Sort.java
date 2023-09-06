/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Common.Algorithm;
import Common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author vothi
 */
public class Sort extends Menu<String> {


    protected Library library;
    protected Algorithm algorithm;
    protected int  size_arr;
    protected int[] arr;
    static String[] opsList = {"Sort", "Exit"};

    public Sort(Element element) {
        super("Sort Menu", opsList);
        library = new Library();
        algorithm = new Algorithm();
        size_arr= element.getSize_arr();
        arr = element.getArr();
    }

    public void execute(int n) {
        switch (n) {
            case 1: {
                sort();
                break;
            }
            case 2:
                System.exit(0);
            default:
                System.out.println("Please, enter again!");
        }
    }

    public void sort() {
        final String[] sortList = {"Bubble Sort", "Quick Sort", "Exit"};
        class sortMenu extends Menu<String> {

            public sortMenu() {
                super("Sort option", sortList);
            }

            @Override
            public void execute(int n) {
                System.out.println("Unsort array: ");
                library.display(arr);
                switch (n) {
                    case 1:
                        algorithm.buddleSort(arr);
                        System.out.println("After sort by Bubble Sort: ");
                        library.display(arr);
                        break;
                    case 2:
                        algorithm.QuickSort(arr, 0,  size_arr - 1);
                        System.out.println("Quick Sort: ");
                        library.display(arr);
                        break;
                    case 3:
                        System.exit(0);
                    default:
                        System.out.println("Please, enter again!");
                }
            }
        }
        sortMenu sm = new sortMenu();
        sm.run();
    }

}
