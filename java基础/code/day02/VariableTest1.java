/*
java������������ͣ�
	һ���������������������֣�
		
		�����������ͣ�
			���ͣ�byte �� short �� int �� long
			�����ͣ�float��double
			�ַ��ͣ�char
			�����ͣ�boolean
			
		�����������ͣ�
		�ࣨclass����
		�ӿڣ�interface����
		���飨array����

	�������������е�λ��������
			��Ա���� VS �ֲ�����


*/





class VariableTest1{
	public static void main(String[] args){
		//1. ���ͣ�byte(1�ֽ�=8bit) �� short(2�ֽ�) �� int(4�ֽ�) �� long(8�ֽ�)
		//��byte��Χ�� -128 ~ 127
		byte b1 = 12;
		byte b2 = -128;
		//b2 = 128�� ���벻ͨ��
		System.out.println(b1);
		System.out.println(b2);
		//������long�ͱ���ʱ�������ԡ�l����L����β
		//��ͨ��ѡ��int���������ͱ���
		short s1 = 128;
		int i1 = 1234;
		long l1 = 123123123L;
		System.out.println(l1);
		
		//2. �����ͣ�float(4�ֽ�)��double(8�ֽ�)
		//�ٸ����ͣ���ʾ��С�������ֵ
		//��float��ʾ����ֵ��Χ��long����
		
		double d1 = 12.2;
		System.out.println(d1 + 1);
		//�۶���float����ʱ������Ҫ�ԡ�f����F����β
		float f1 = 1212f;          //�����Ҳ���f��βҲ�У���֪��Ϊɶ����������������
		System.out.println(f1);
		//��ͨ��ѡ��double�����帡���ͱ���
		
		//3. �ַ��ͣ�char��1�ַ�=2���ֽڣ�
		//�� ����char�ͱ�����ͨ��ʹ��һ��''���ڲ�ֻ��дһ���ַ�
		char c1 = 'a';
		//c1 = 'AB';���벻ͨ��
		System.out.println(c1);
		char c2 = '��';
		System.out.println(c2);
		//�ڱ�ʾ��ʽ��1. ����һ���ַ� 2. ת���ַ� 3. ֱ��ʹ��unicodeֵ����ʾ�ַ��ͳ���
		char c3 = '\n';
		System.out.print("hello" + c3);
		System.out.print("world");
		System.out.print("\n");
		char c4 = '\u0021';
		System.out.println(c4);
		
		//4. �����ͣ�boolean
		//��ֻ��ȡ����ֵ֮һ��true��false
		//�ڳ����������жϡ�ѭ���ṹ��ʹ��
		boolean bb1 = true;
		System.out.println(bb1);
		boolean isMarried = true;
		if(isMarried){
			System.out.println("���\"�޷�\"�μӾۻᣡ\\n��ϧ��");
		}
		else{
			System.out.println("��ϲ��");
		}
		
		
	}
	
}