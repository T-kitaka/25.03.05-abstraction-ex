package com.jstudy.정휘상;

import java.io.*;
import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 100 + 1);
        }
        printArray(arr);
        sort(arr);
        printArray(arr);

    }
    private static void printArray(int[] arr) {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(" ]");
        System.out.println(sb);
    }
    private static void sort(int[] arr) {
        if (arr.length == 1) {
            return;
        }
        int[] a = Arrays.copyOfRange(arr, 0, arr.length / 2);
        int[] b = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        sort(a);
        sort(b);
        int i = 0;
        int cursorA = 0, cursorB = 0;
        // arr[i]는 a, b 중에 작은 값(오름차순)
        while (cursorA < a.length && cursorB < b.length) {
            arr[i++] = (a[cursorA] < b[cursorB]) ? a[cursorA++] : b[cursorB++];
        }
        // 남은 게 없다면 둘 중 하나의 for문은 작동하지 않음
        // 남은 게 있는 쪽은 이미 정렬 되어 있으니 arr에 순서대로 추가
        for (int j = cursorA; j < a.length; j++) {
            arr[i++] = a[j];
        }
        for (int j = cursorB; j < b.length; j++) {
            arr[i++] = b[j];
        }
    }
}
