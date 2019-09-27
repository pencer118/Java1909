package practice.stddev;

import java.util.Random;

public class StdDev {

	// feat. 명기범
	   public static void main(String[] args) {
//	      // 제곱근 구하기, Math.sqrt()
//	      double v = 2.0;
//	      System.out.println(v + " 의 제곱근은 " + Math.sqrt(v));
//	      
//	      for(int i = 0; i < 5; i++) {
//	         int n = new Random().nextInt(100); // 0 ~ 99 사이의 정수
//	         System.out.println(n);
//	      }
	      
	      int[] n = new int[5];
	      
	      int total = 0; // 값의 총합
	      double avg = 0.0; // 평균
	      double total2 = 0; // 편차 제곱의 합
	      
	      for (int i = 0; i < n.length; i++) {
	         n[i] = new Random().nextInt(101);  // 난수 생성
	         System.out.println(n[i]);
	         total += n[i];  // 총점 합계 계산
	      }
	      
	      // 평균 계산
	      avg = (double)total / n.length;
	      
	      System.out.println("평균 : " + avg);
	      
	      
	     for (int i = 0; i < n.length; i++) {
	        double p = (n[i] - avg) * (n[i] - avg); //편차 제곱
	        total2 += p;
	     }
	      
	      System.out.println("분산 : " + total2 / n.length);
	      System.out.println("표준편차 : " + Math.sqrt(total2 / n.length));
	      
	   } // end main

	} // end class

