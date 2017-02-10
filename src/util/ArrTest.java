package util;

import java.util.*;

public class ArrTest {
	public static void main(String[] args) {
	/*	String []arr={"a","b","c","d"};
		String a=""; //항상만들어야함!! result값을 받아주는곳 
	 모두다 출력되는것
	 * 	for(String s: arr){
		 a+=s; //하나씩 누적해서 보여주는것 
		}System.out.println(a);*/
		
		String []arr={"a","b","c","d"}; //전체출력되는것!
		Set<String> t= new HashSet<String>(); 
		for(String s: arr){
				t.add(s);
		}System.out.println(t.toString());
	}

}
