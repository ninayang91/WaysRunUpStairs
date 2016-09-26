import java.util.ArrayList;

public class Main {
	
	public static void main(String[] args){
		int[] temp=new int[50];
		System.out.println(countDP(3,temp));
		
	}
	
	public static int count(int n){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else{
			return count(n-1)+count(n-2)+count(n-3);
		}
	}
	
	
	public static int countDP(int n, int[] temp){
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else if(temp[n]>0){
			return temp[n];
		}else{
			temp[n]= countDP(n-1,temp)+countDP(n-2,temp)+countDP(n-3,temp);
			return temp[n];
		}
	}

}
