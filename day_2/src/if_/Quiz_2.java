package if_;

import java.util.Scanner;

public class Quiz_2 {
    private static final int USB_PRICE = 5000;
    private static final double DISCOUNT_RATE_1 = 0.10;
    private static final double DISCOUNT_RATE_2 = 0.12;
    private static final int DISCOUNT_QUANTITY_1 = 10;
    private static final int DISCOUNT_QUANTITY_2 = 100;
    private static final int AVG_SCORE = 60;
    private static final int MINIMUM_PASSING_SCORE = 40;
    private static final int DEFAULT_FLIGHT_TIME = 30;
    private static final int DEFAULT_FLIGHT_COST = 30000;
    private static final int OVERTIME_COST = 5000;

    private static void calculateUsbPrice(Scanner sc) {
        System.out.print("구입 할 USB 갯수 입력: ");
        int quantity = sc.nextInt();
        double totalPrice;

        if (quantity < DISCOUNT_QUANTITY_1) {
            totalPrice = USB_PRICE * quantity;
        } else if (quantity < DISCOUNT_QUANTITY_2) {
            totalPrice = USB_PRICE * quantity * (1 - DISCOUNT_RATE_1);
        } else {
            totalPrice = USB_PRICE * quantity * (1 - DISCOUNT_RATE_2);
        }

        System.out.println("총 가격: " + totalPrice);
    }

    private static void identifyPass(Scanner sc) {
        System.out.print("국어 점수: ");
        int kor = sc.nextInt();
        System.out.print("영어 점수: ");
        int eng = sc.nextInt();
        System.out.print("수학 점수: ");
        int math = sc.nextInt();

        int total = kor + eng + math;
        int avg = total / 3;

        if (avg > AVG_SCORE) {
            if (kor >= MINIMUM_PASSING_SCORE && eng >= MINIMUM_PASSING_SCORE && math >= MINIMUM_PASSING_SCORE) {
                System.out.println("합격");
            } else {
                System.out.println("과목 불합격");
            }
        } else {
            System.out.println("평균 불합격");
        }

        System.out.println("총점: " + total);
        System.out.println("평균: " + avg);
        calculateGrade(avg);
    }

    private static void calculateGrade(int avg) {
        if (avg >= 90) {
            System.out.println("A");
        } else if (avg >= 80) {
            System.out.println("B");
        } else if (avg >= 70) {
            System.out.println("C");
        } else if (avg >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }

    private static void calculateFlightCost(Scanner sc) {
        System.out.print("비행기 탑승 시간(분): ");
        int time = sc.nextInt();
        int totalCost;

        if (time <= DEFAULT_FLIGHT_TIME) {
            totalCost = DEFAULT_FLIGHT_COST;
        } else {
            totalCost = DEFAULT_FLIGHT_COST + (time - DEFAULT_FLIGHT_TIME) * OVERTIME_COST;
        }

        System.out.println("총 요금: " + totalCost);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateUsbPrice(sc);
        identifyPass(sc);
        calculateFlightCost(sc);
        sc.close();
    }
}
