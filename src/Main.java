package prod;

public class Main {
	public static void main(String[] args) {
		int n=10;
		System.out.println(f1(n));
		System.out.println(f2(n));
		System.out.println(f3(n));
		System.out.println(f4(n));
		System.out.println(f5(30,11)); // בהנחה שאיי הוא הגדול
		System.out.println(f6(20,11)); 
		System.out.println(f7(30,5)); 
		System.out.println(f8(422));
		System.out.println(f9(422));
		
	}

   
   public static int f1(int n) {
	   if (n==0)
		   return 0;
	   return n+f1(n-1);
   }
   
   public static int f2(int n) {
	   if (n==0)
		   return 1;
	   return n*f2(n-1);
   }
   
   public static int f3(int n) { 
	   if (n==0)
		   return 1;
	   if (n%2==1)
		   return n*f3(n-1);
	   return f3(n-1);
   }
   
   public static int f4(int n) {
	   if (n==0)
		   return 0;
	   
	   return 1 + f4(n/10);
   }
   
   
   public static int f5(int a,int b) { 
	   if (a<b)
		   return 0;
	   
	   return 1 + f5(a-b,b);
   }
   
   public static int f6(int a,int b) { 
	   if (a<b)
		   return a;
	   
	   return f6(a-b,b);
   }
   
   public static boolean f7(int x,int y) { 
	   if (x==0)
		   return true;
	   if (x<0)
		   return false;
	   
	   return f7(x-y,y);
   }
   
   public static boolean f8(int x, int divisor) { 
	   if (divisor==x)
		   return true;
	   if (f7(x,divisor)) //if (number % divisor == 0)
		   return false;
	   
		   
	   return f8(x,divisor+1);
   }
   
   public static boolean f9(int n) {
	   if (n < 10) 
           return true;
	   if (n==0)
		   return true;
	   if ((n%2)!=(n/10)%2)
		   return false;
	   
	   return f9(n/10);
   }
}
   
