/*
��Ŀ��
�Ӽ������������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������


˵����
1. ����ѭ�������������ƴ����Ľṹ��for(;;)��while(true)
2. ����ѭ���ķ�ʽ��
	��ʽһ��ѭ���������ַ���false
	��ʽ����ѭ������ִ��break


*/


import java.util.Scanner;

class ForWhileTest{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		
		
		int positiveNumber = 0;
		int negativeNumber = 0;
		
		for(;;){//while(true){
			System.out.println("����������:");
			int number = scan.nextInt();
			
			if(number > 0){
				positiveNumber++;
			}else if(number < 0){
				negativeNumber++;
			}else{
				break;
			}

		}
		
		System.out.println("�����ĸ�����" + positiveNumber);
		System.out.println("�����ĸ�����" + negativeNumber);
	}
}