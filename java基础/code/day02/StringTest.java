/*
String���ͱ�����ʹ��
1. String�����������������ͣ����ǻ����������ͣ���
2. ����String���ͱ���ʱ��ʹ��һ�ԡ���
3. String���Ժ�8�ֻ����������������㣬������ֻ�����������㣺+
4. String��8�������������������String����


*/





class StringTest{

	public static void main(String[] args){
		
		String s1 = "Hello,World!";
		
		System.out.println(s1);
		
		String s2 = "a";
		
		String s3 = "";//string��ûɶ����
		//char c1 = '';//char�������ұ����һ���ַ����ո�Ҳ��
		
		
		//*******************
		int number = 1001;
		String numberStr = "ѧ�ţ�";
		String info = numberStr + number;// ��������
		System.out.println(info);
		
		boolean b1 = true;
		String info1 = info + b1;
		System.out.println(info1);
		
		//*********************************************
		//��ϰ1
		char c = 'a';   //'a'��Ӧ��ASCII�룺97 'A'��Ӧ��ASCII�룺65
		int num = 10;
		String str = "Hello";
		System.out.println(c + num +str);//107Hello
		System.out.println(c +str + num);//aHello10
		System.out.println(c + (num +str));//a10Hello
		System.out.println((c + num) +str);//107Hello
		System.out.println(num +str + c);//10Helloa
		
		//��ϰ2
		//*	*
		
		System.out.println("*	*");
		System.out.println('*' + '\t' + '*');//��\t�����Ʊ���൱��Tab��
		System.out.println('*' + "\t" + '*');
		System.out.println('*' + '\t' + "*");
		System.out.println('*' + ("\t" + "*"));
	}
}