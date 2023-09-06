package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vothi
 */

public class Element {

    public Element() {
    }
    
     public  int size_arr;
  private int[] arr;
   

    public Element(int size_array, int[] array) {
        this.size_arr = size_arr;
        this.arr = arr;
    }
    

    public int getSize_arr() {
        return size_arr;
    }

    public void setSize_arr(int size_arr) {
        this.size_arr = size_arr;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] array) {
        this.arr = array;
    }

    
 
 @Override
    public String toString() {
        return "Element{" + "size_arr=" + size_arr + ", arr=" + arr + '}';
    }
}
