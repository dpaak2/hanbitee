package util;

public class RandomGenerator {
    
		public static int getRandomNum(int a, int b){
		 int max, min=0; 
		/* System.out.println(if(a>b)?:;);*/
		  /*if(a>b){
			  max=a;
			  min=b;
		  }  else{
			  max=b;
			  min=a;
		  }*/
		
	/*	  int randomNum=(int)((Math.random()*max)+min);*/
			return (int) ((a>b)?(((Math.random()*a-b+1)+a)):(Math.random()*b-a+1)+b);
		}
}
