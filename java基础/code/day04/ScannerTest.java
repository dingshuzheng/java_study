/*
��δӼ��̻�ȡ��ͬ���͵ı�������Ҫʹ��Scanner��

����ʵ�ֲ��裺
1. ������import java.util.Scanner
2. Scanner��ʵ�廯Scanner scan = new Scanner(System.in)
3. ����scanner�����ط���(next()/nextxxx()),����ȡָ�����͵ı���

ע�⣺
��Ҫ������Ӧ�ķ�����������ָ�����͵�ֵ��������������������Ҫ������Ͳ�ƥ��ʱ���ᱨ�쳣��InputMismatchException
���³�����ֹ


*/

import java.util.Scanner;

class ScannerTest{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������������");
		String name = scan.next();
		System.out.println(name);
		
		System.out.println("��������ķ��䣺");
		int age = scan.nextInt();
		System.out.println(age);
		
		System.out.println("������������أ�");
		double weight = scan.nextDouble();
		System.out.println(weight);
		
		System.out.println("���Ƿ�����������");
		boolean b = scan.nextBoolean();
		System.out.println(b);
		
		//����char�͵Ļ�ȡ��Scannerû���ṩ��صķ�����ֻ����һ���ַ�����ȡ
		System.out.println("����������Ա𣺣���/Ů��");
		String gender = scan.next();
		char genderChar = gender.charAt(0);//��ȡ����Ϊ0λ���ϵ��ַ�
		System.out.println(gender);
	}
}