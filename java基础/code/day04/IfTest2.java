/*
˵����
1. if-else�ǿ����໥Ƕ�׵�
2. ���if-else�е�ִ�����ֻ��һ��ʱ��{}�ǿ���ʡ�Եģ�����������ô��


*/






import java.util.Scanner;
class IfTest2{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������һ��������");
		int num1 = scan.nextInt();
		System.out.println("������ڶ���������");
		int num2 = scan.nextInt();
		System.out.println("�����������������");
		int num3 = scan.nextInt();
		
		/*
		int a,b,c,d;
		if(num1 >= num2){
			a = num1;
			c = num2;
		}else{
			a = num2;
			c = num1;
		}if(a >= num3){
			b = a;
			d = num3;
		}else{
			b = num3;
			d = a;
		}if(c >= d){
			System.out.println("��С����Ϊ��" + d + " < " + c + " < " + b);
		}else{
			System.out.println("��С����Ϊ��" + c + " < " + d + " < " + b);
		}
		*/
		
		if(num1 >= num2){
			if(num3 >= num1){
				System.out.println(num2 + " < " + num1 + " < " + num3);
			}else if(num3 >= num2){
				System.out.println(num2 + " < " + num3 + " < " + num1);
			}else{
				System.out.println(num3 + " < " + num2 + " < " + num1);
		    }
		}else{
		 	if(num3 >= num2){
			System.out.println(num1 + " < " + num2 + " < " + num3);
		    }else if(num3 >= num1){
			System.out.println(num1 + " < " + num3 + " < " + num2);
		    }else{
			System.out.println(num3 + " < " + num1 + " < " + num2);
		    }
		}
		
		//�κ���ϰ����������ȡһ�������
		int value = (int)Math.random() * 90 + 10;//[0.0,1.0) --> [0.0,90) --> [10,90)
		System.out.println(value);
		//��ʽ��[a,b] : (int)(Math.random() * (b - a + 1) + a)
		
	}
}