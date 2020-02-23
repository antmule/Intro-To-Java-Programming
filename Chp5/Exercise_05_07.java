/*
    Suppose that the tuition for a university
    is $10,000 this year and increases 5% every year. In one year, the tuition
    will be $10,500. Write a program that computes the tuition in ten years and
    the total cost of four years’ worth of tuition after the tenth year.
*/

import java.util.Scanner;
public class FutureInvestment {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        double tuition = 10000.0;
        double yearlyIncreasePercentage = 1.05;
        double tuitionInTenYears = 0.0;
        double fourYearsOfTuition = 0.0;

        for (int i = 0; i < 10; i++) {
            tuition *= yearlyIncreasePercentage; 
        }
		
        System.out.printf("Tuition in ten years is: $%8.2f", tuition);
            
        for (int i = 10; i <= 13; i++ ) 
        {
                fourYearsOfTuition += tuition;
                tuition *= yearlyIncreasePercentage;
        }

        System.out.printf("\nThe four-year tuition in 10 years is: $%8.2f", fourYearsOfTuition );
	}

}	 
