/*
�����֮�壺λ��������˽⣩

���ۣ�
1. λ����������Ķ������͵�����
2.  << ����һ���ķ�Χ�ڣ�ÿ������һλ���൱��*2
    >> ����һ���ķ�Χ�ڣ�ÿ������һλ���൱��/2

�����⣺
���Ч�ķ�ʽ����2 * 8 ?  2 << 3 �� 8 << 1



*/


class BitTest{

	public static void main(String[] args){
	
		int i = 21;
		i = -84;
		System.out.println("i >> 2 :" + (i >> 2));//���������λ��
		
		int m = 12;
		int n = 5;
		System.out.println("m & n :" + (m & n));
		System.out.println("m | n :" + (m | n));
		System.out.println("m ^ n :" + (m ^ n));
		
		//��ϰ����������������ֵ
		int num1 = 10;
		int num2 = 20;
		
		//��ʽһ�� ������ʱ����
		//�Ƽ�
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1 = " + num1 + '\n' + "num2 = " + num2);
		
		//��ʽ�����ô������ö�����ʱ����
		//        �׶ˣ��� ��Ӳ������ܳ����洢��Χ �� �о����ԣ�ֻ����������������
		num1 = 10;num2 = 20;
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("num1 = " + num1 + '\n' + "num2 = " + num2);
		
		//��ʽ����ʹ��λ�����
		num1 = 10;num2 = 20;
      	num1 = num1 ^ num2;
		num2 = num1 ^ num2;
		num1 = num1 ^ num2;
		System.out.println("num1 = " + num1 + '\n' + "num2 = " + num2);
		
	}
}