package cuongttq;

import java.util.Scanner;

public class Cuongttq {

    // Phương thức nhập mảng số
    public static float[] importData(float[] arrays) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < arrays.length; i++) {
            System.out.print("Nhap " + (i + 1) + ": ");
            arrays[i] = scanner.nextFloat();
        }
        return arrays;
    }

    // Phương thức xuất mảng ra màn hình
    public static void printData(float[] arrays) {
        System.out.print("Mang: ");
        for (float num : arrays) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Phương thức tìm phần tử giá trị lớn thứ 2 trong mảng
    public static float findMax2(float[] arrays) {
        float max1 = Float.MIN_VALUE;
        float max2 = Float.MIN_VALUE;
        for (float num : arrays) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
            } else if (num > max2 && num != max1) {
                max2 = num;
            }
        }
        return max2;
    }

    // Phương thức xóa các phần tử lẻ ra khỏi mảng
    public static float[] deleteOddNumber(float[] arrays) {
        int count = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                count++;
            }
        }
        float[] newArray = new float[count];
        int index = 0;
        for (float num : arrays) {
            if (num % 2 == 0) {
                newArray[index++] = num;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        float[] arrays = new float[5]; // Khởi tạo mảng với kích thước 5
        arrays = importData(arrays);
        printData(arrays);
        System.out.println("Pt lon 2 : " + findMax2(arrays));
        arrays = deleteOddNumber(arrays);
        printData(arrays);
    }
}

