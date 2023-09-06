/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Common;

import java.util.ArrayList;

/**
 *
 * @author vothi
 */
public class Algorithm {

   

   

    public void buddleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }
  
  public int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); 
// vi tri của phan tu nho hon
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }
        int t = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = t;
        return i + 1;
    }
  
  

    public void QuickSort(int[] arr, int low, int high) {
       
        if (low < high) {
            int index = partition(arr, low, high);
            QuickSort(arr, low, index - 1);
            QuickSort(arr, index + 1, high);
        }
    }

  }


