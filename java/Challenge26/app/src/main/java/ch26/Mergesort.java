package ch26;

public class Mergesort {
  public static int[] mergeSort(int[] arr) {
    int n = arr.length;
    if (n > 1) {
      int mid = n / 2;
      int[] left = new int[mid];
      for (int i = 0; i < left.length; ++i) {
        left[i] = arr[i];
      }
      int[] right = new int[n - mid];
      for (int j = 0; j < right.length; ++j) {
        right[j] = arr[j + mid];
      }
      mergeSort(left);
      mergeSort(right);
      marge(left, right, arr);
    }
    return arr;
  }

  public static void marge(int[] left, int[] right, int[] arr) {
    int i = 0; // left
    int j = 0; // right
    int k = 0; // arr
    while (i < left.length && j < right.length) {
      if (left[i] <= right[j]) {
        arr[k] = left[i];
        i = i + 1;
      } else {
        arr[k] = right[j];
        j = j + 1;
      }
      k = k + 1;
    }
    if (i == left.length) {
      for (int l = j; l < right.length; l++) {
        arr[k++] = right[l];
      }
    } else {
      for (int l = i; l < left.length; l++) {
        arr[k++] = left[l];
      }
    }
  }
}
