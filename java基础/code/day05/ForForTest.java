/*
ǰ̨ѭ����ʹ��
1. Ƕ��ѭ������һ��ѭ���ṹA��������һ��ѭ���ṹB��ѭ�����У��͹�����Ƕ��ѭ��

2.
���ѭ����ѭ���ṹB
�ڲ�ѭ����ѭ���ṹA

3. ˵����
	�ڴ�ѭ���ṹ����һ�飬ֻ�൱���ⲿѭ����ִ����һ��
	�������ѭ������Ҫִ��m�Σ��ڲ�ѭ������Ҫִ��n�Σ����ڲ�ѭ����һ��ִ����mn��


*/




class ForForTest{
	public static void main(String[] args){
		
		for(int i = 1;i <= 5;i++){               //��������
			for(int j = 1;j <= i;j++){           //��������
				System.out.print('*');
			}
			
			System.out.println();
			
		}
		
		for(int i = 4;i >= 1;i--){               //��������
			for(int j = 1;j <= i;j++){           //��������
				System.out.print('*');
			}
			
			System.out.println();
			
		}
		
		
	}
}