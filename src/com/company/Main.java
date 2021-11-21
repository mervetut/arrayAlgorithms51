package com.company;

public class Main {

    public static void main(String[] args) {
	int arr[] = {9, 7, 2, 11};
	int n = arr.length;

	for (int i = 1; i < n; i++){
	    int value = arr[i];
	int j = i - 1;

	if (j >= 0 && arr[j] > value) {
	    arr[j+1]= arr[j];
	    j = j - 1;
	}
	else
	    arr[j+1] = value;
	i = i + 1;
    }
        System.out.println(arr);
}}
