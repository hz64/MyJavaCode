/**
 * ZeAy
 */

import java.util.Scanner;

public class math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("�������һ������: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("������ڶ�������: ");
        double num2 = scanner.nextDouble();
        
        System.out.println("cd: ");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. *");
        System.out.println("4. /");
        
        int choice = scanner.nextInt();
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("����: ��������Ϊ�㡣");
                    System.exit(0);
                }
                break;
            default:
                System.out.println("��Ч��ѡ��");
                System.exit(0);
        }
        
        System.out.println("=" + result);
        
        scanner.close();
    }
}