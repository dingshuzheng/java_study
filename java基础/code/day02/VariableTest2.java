/*
������������֮����������

ǰ�᣺�������۵�ֻ��7���������ͱ���������㣬������boolean���͵�

1. �Զ�����������
	������С���������͵ı�������������������͵ı���������ʱ������Զ�����Ϊ���������������
	byte �� short �� char--> int --> long --> float --> double
	�ر�ģ���byte��short��char������ʱ�����Ϊint��


2. ǿ������ת������VariableTest3



˵������ʱ��������Сָ���ǣ���ʾ�����ķ�Χ�Ĵ��С�����磺float��������long������

*/



class VariableTest2{
	public static void main(String[] args){
		
		byte b1 = 2;
		int i1 = 129;
		//byte b2 = b1 + i1; //���벻ͨ��
		//int b2 = b1 + i1;
		float b2 = b1 + i1; // 123.0
		
		System.out.println(b2);
		//***************************************************
		char c1 = 'a'; //'a' = 97
		int i3 = 10;
		int i4 = c1 + i3;
		System.out.println(i4);
		
		
		short s2 = 10;
		/*short s3 = c1 + s2;
		System.out.println(s3); // ��intת����short���ܻ�����ʧ
		*/
		
		//char s4 = c1 + s2;
		//System.out.println(s4); //��intת����char���ܻ�����ʧ
		
		byte b3 = 10;
		//char c3 = c1 + b3;
		//System.out.println(c3); //��intת����char���ܻ�����ʧ
		
		//short s5 = b3 + s2;
		//System.out.println(s5); //��intת����short���ܻ�����ʧ
		
		short s6 = b1 + b3;
		System.out.println(s6); //��intת����short���ܻ�����ʧ
		
		//****************************************************
		
		
	
	}

}