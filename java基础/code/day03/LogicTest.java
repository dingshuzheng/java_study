/*
�����֮�ģ��߼������

& && | || ! ^

˵����
1. �߼�����������Ķ���boolean���͵ı���
2. 



*/






class LogicTest{
	public static void main(String[] args){
	
		//����& �� &&
		//��ͬ��1��& �� && ����������ͬ
		//��ͬ�㣺 �����������trueʱ�����߶���ִ�з����ұߵ�����
		//��ͬ�㣺 �����������falseʱ��&��ִ�з����ұߵ����㣬&&����
		//�������Ƽ�ʹ��&&
		boolean b1 = true;
		b1 = false;
		int num1 = 10;
		if(b1 & (num1++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		
		System.out.println("num1 =" + num1);
		
		boolean b2 = true;
		int num2 = 10;
		b2 = false;
		if(b2 && (num2++ > 0)){                   //����b2��false��ֱ�Ӿ�����else����ִ�к���Ĳ���
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		
		System.out.println("num2 =" + num2);
		
		//���֣�|��||
		//��ͬ��1��| �� || ����������ͬ
		//��ͬ�㣺 �����������falseʱ�����߶���ִ�з����ұߵ�����
		//��ͬ�㣺 �����������trueʱ��|��ִ�з����ұߵ����㣬||����
		//�������Ƽ�ʹ��||
		boolean b3 = true;
		int num3 = 10;
		if(b3 | (num3++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num3 = " + num3);
		
		boolean b4 = true;
		int num4 = 10;
		if(b4 || (num4++ > 0)){
			System.out.println("�������ڱ���");
		}else{
			System.out.println("���������Ͼ�");
		}
		System.out.println("num4 = " + num4);
	}

}