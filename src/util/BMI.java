package util;

import java.util.Scanner;

public class BMI {
	public String getBmi(double kg, double cm) {
		double height = 0, weight = 0, bmi = 0;
		String result = "";
		bmi = weight / (height / 100 * height / 100);
		if (bmi > 30.0) {
			result = "고도비만";
		} else if (bmi > 25.0) {
			result = "비만";
		} else if (bmi > 23.0) {
			result = "과체중";
		} else if (bmi > 18.5) {
			result = "정상";
		} else {
			result = "저체중";
		}
		return result;
	}
}
