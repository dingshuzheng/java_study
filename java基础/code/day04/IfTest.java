/*
˵��;
1. else�ṹ�ǿ�ѡ��
2. ������������ʽ��
	�������������ʽ֮���ǡ����⡱��ϵ����û�н��ʵĹ�ϵ�����ĸ��жϺ�ִ��������������滹�����棬����ν
	�������������ʽ֮�����н����Ĺ�ϵ����Ҫ����ʵ������������Ӧ�ý��ĸ��ṹ����������
	�������������ʽ֮���ְ����Ĺ�ϵ��ͨ������£���Ҫ����ΧС�������ڷ�Χ������棬���򣬷�ΧС�Ľ�����ִ��
*/

import java.util.Scanner;

class IfTest{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��������С���ĳɼ�����0-100��");
		int score = scan.nextInt();
		
		if(score == 100){
			System.out.println("����һ������BMW");
		}else if(score >= 60){
			System.out.println("����һ̨Ipad");
		}else if(score >= 80){
			System.out.println("����һ̨Iphone XS MAX");
		}//else{
		//	System.out.println("лл����");
		//}
		
		
	}
}