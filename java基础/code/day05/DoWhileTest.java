/*
do-whileѭ����ʹ��

һ��ѭ���ṹ��4��Ҫ��
1 ��ʼ���ṹ
2 ѭ���ṹ
3 ѭ����
4 ��������

����do-whileѭ����ʹ��

1
do{
	3;
	4;
	}while(2);

ִ�й��̣�1 > 3 > 4 > 2 > 3 > 4 > 2 > ... > 2

˵����
1. do-whileѭ�����ٻ�ִ��һ��ѭ����
2. ������ʹ��for��while��һЩ������ʹ��do-while


*/






class DoWhileTest{
	public static void main(String[] args){
	
	//����100���ڵ�ż��
	int num = 1;
	do{
		if(num % 2 == 0){
			System.out.println(num);
		}
		num++;
		
	}while(num <= 100);
	
	int num2 = 10;
	do{
		System.out.println(num2);
		num2--;
	}while(num2 > 10);
	
	
	}
}