/*
Forxѭ���ṹ��ʹ�ã�
һ��ѭ���ṹ��4��Ҫ��
1 ��ʼ���ṹ
2 ѭ���ṹ --> ��boolean����
3 ѭ����
4 ��������

����forѭ���Ľṹ

for(1;2;4){
	3
}

ִ�й��̣�1 > 2 > 3 > 4 > 2 > 3 > 4 > ... > 2

*/


class ForTest{
	public static void main(String[] args){
		
		for(int i = 1;i <= 5;i++){
		System.out.println("Hello World!!!");
		}
		
		//i:ֻ��forѭ������Ч������ѭ������Ч��
		
		//��ϰ
		int num = 1;
		for(System.out.print('a');num <= 3;System.out.print('c'),num++){
			System.out.print('b');
		}
		
		//���⣺����100���ڵ�ż��,�������ż���ĺ͡�����
		int sum = 0;
		int count = 0;
		for(int i = 1;i <= 100;i++){
			if(i % 2 == 0)
				System.out.println(i);
			sum += i;
			count++;
		}
		System.out.println("�ܺ�Ϊ" + sum + "\n����Ϊ" + count);
	}
}