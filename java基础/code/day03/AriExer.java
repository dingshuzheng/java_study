/*
��ϰ��
�������һ����λ������ӡ�����λ����ʮλ������λ��



*/


class AriExer{

	public static void main(String[] args){
		
			int num = 123;
			int c = num / 100;
			int b = (num % 100) / 10;
			int a = (num % 100) % 10; // int a = num % 10;������
	
			System.out.println("��λ���ǣ�" + a);
			System.out.println("ʮλ���ǣ�" + b);
			System.out.println("��λ���ǣ�" + c);
	}
}