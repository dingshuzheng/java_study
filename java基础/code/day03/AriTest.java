/*
�����֮һ�����������
+ - + - * / % (ǰ)++ (��)++ (ǰ)-- (��)-- +



*/

class AriTest{

	public static void main(String[] args){
	
		//���ţ�/
		int num1 = 12;
		int num2 = 5;
		int result1 = num1 / num2;
		System.out.println(result1);//2
		
		int result2 = num1 / num2 * num2;
		System.out.println(result2);//10
		
		double result3 = num1 / num2;//2.0
		System.out.println(result3);
		
		double result4 = num1 / num2 + 0.0;//2.0
		double result5 = num1 / (num2 + 0.0);//2.4
		double result6 = (double)num1 / (double)num2;//2.4 
		double result7 = (double)(num1 / num2);//2.0 
		System.out.println(result5);
		
		// %:ȡ������
		//����ķ����뱻ģ���ķ�����ͬ
		//�����о���ʹ��%�������ж��ܷ񱻳��������
		int m1 = 12;
		int n1 = 5;
		System.out.println("m1 % n1 = " + m1 % n1);//2
		
		int m2 = -12;
		int n2 = 5;
		System.out.println("m2 % n2 = " + m2 % n2);//-2
		
		int m3 = 12;
		int n3 = -5;
		System.out.println("m3 % n3 = " + m3 % n3);//2
		
		int m4 = -12;
		int n4 = -5;
		System.out.println("m4 % n4 = " + m4 % n4);//-2
		
		//(ǰ)++
		//(��)++
		int a1 = 10;
		int b1 = ++a1;//������1��������
		System.out.println("a1 = " + a1 + ", b1 = " + b1);//11 11
		
		int a2 = 10;
		int b2 = a2++;//�����㣬������1
		System.out.println("a2 = " + a2 + ", b2 = " + b2);//11 10
		
		//ע��㣺
		short s1 = 10;
		//s1 = s1 + 1;//����ʧ��
		//s1 = (short)(s1 + 1);//��ȷ��
		s1++;//����1����ı�ԭ������������
		System.out.println(s1);
		
		//���⣺
		byte b = 127;
		b++;
		System.out.println("b = " + b);
		
		
		//(ǰ)-- :�ȼ�1�������� 
		//(��)--
	}
}