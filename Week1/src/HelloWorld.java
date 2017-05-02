import java.lang.*;
import java.util.*;
public class HelloWorld {

	public static int c = 0;
	public  int dd = 4;
	public static aaa q; //널값들어
	public static int func(int a)
	{
		a++;
		return a;	
	}
	
	public static void main(String[] args) {
		
		Random random = new Random();
		int a= random.nextInt(10);
		
		
		
		System.out.println(func(c));
		System.out.println(func(c));
//		aaa obj1 = new aaa();
//		aaa obj2 = new aaa();
//		  
//		 obj1.setA();
//		  System.out.println(obj1.a);
//		  System.out.println(obj2.a);
		
		Parent p1 = new Child();
		Child c1 =  (Child) p1;
		
		Child ddd;
		//ddd= new Parent();//컴파일
		Parent p2=new Parent();
		//Child d=(Child)p2;//런타임에
		
//		Parent p2= new Parent();
//		Child c2 = (Child) p2; //runtime error!
		
		
		System.out.println("Hello World!");

//		int a[][] = new int [3][];
//		a[0]=new int[1];
//		a[1]=new int[2];
//		//a[3]=new int [3];
//
//		
//		int b=7;
		
		//HelloWorld c = new HelloWorld();
		
//		int x[]=new int[3];
//		int []y={1,2,3};
//		for(int i=0;i<y.length;i++)
//			System.out.println(y[i]);
		
		 //첫번째 실습.
		 int n = 454467;
//		 System.out.print(n+"\n");
//		 System.out.printf("n = %d%n", n);
//		 System.out.format("%d%n", n);
//		 System.out.format("n ="+n+"\n");//된다.
//		 System.out.println("n ="+n);
//		 System.out.format("%,d%n", n);//3개단위로 ,찍힌다.
		 System.out.format("%08d%n", n);//???
//		 System.out.format("%+,d%n", n);
//		 double a = 3.14529;
//		 System.out.println("=================");
//		 System.out.format("%f%n", a);
//		 System.out.format("%10.3f%n", a);//?
//		 
//		 
//		 n=1;
//		 n=2;
//		 n=3;
//		 Scanner input = new Scanner(System.in);
//		 int q = input.nextInt();
//		 input.nextLine();
//		 String p =input.nextLine();
//		 System.out.printf("%d %s", q, p);
//		 String k=null;
//		 System.out.println(k);

		 //두번째 실습.
//		 int a=1;
//		 int b=1;
//		 a+=b;
//
//
//		 System.out.println(a);
//		 a=1;
//		 b=2;
//		 a=+b;//b=a no Add.
//		 System.out.println(a);

//		 int a=1;
//		 int b=1;
//		 b= a++;
//		 System.out.println(b);
//		 a=1;
//		 b=1;
//		 b= ++a;
//		 System.out.println(b);
//
//		 String[] namelist = {"kim","lee","park"};
//		 for(String name:namelist)
//		 {
//		 System.out.print(name);
//		 System.out.print(",");
//		 }
//		 for(int i=0;i<namelist.length;i++)
//		 {
//		 System.out.println(namelist[i]);
//		 }
//		
		 //int arr[];
		 //int arr2[3];//ㅇㄴ된다.
		 String [][]j2 =new String[8][];//된다.
		 
		 
////		int arr[];
////		int []arr2;
////		int []arr3 = new int [3];
////		int arr4[]={1,2,3};
//		int arr5[3]={1,2,3};
		 int m[][]= new int[3][];
//String [][]j=new String[][2];

		 
		 m[0]=new int [1];
		 m[1]=new int[2];
		 m[2]=new int [3];
		 for(int i=0;i<m.length;i++)
		 {
			 for(int j=0;j<m[i].length;j++)
			 {
				 m[i][j]=i+1;
				 System.out.print(m[i][j]);
			 }
			 System.out.println();
		 }
		
	
	}

}
