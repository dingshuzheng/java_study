/*
��֧�ṹ�е�if-else�������жϽṹ��


һ�����ֽṹ

��һ�֣�
if���������ʽ��{
}

�ڶ��֣���ѡһ
if���������ʽ��{
	ִ�б��ʽһ
}else{
	ִ�б��ʽ��
}

�����֣���ѡһ��
if���������ʽ��{
	ִ�б��ʽһ
}else if���������ʽ��{
	ִ�б��ʽ��
}
...
else{
	ִ�б��ʽn
}

*/

class IfTest{

	public static void main(String[] args){
		
		//����1
		int heartBeats = 79;
		if(heartBeats < 60 || heartBeats > 100){
			System.out.println("��Ҫ��һ�����");
		}
		
		System.out.println("������");
		
		
		//����2
		int age = 21;
		if(age < 18){
			System.out.println("����Կ�����Ƭ");
		}else{
			System.out.println("����Կ����˵�Ӱ��");
		}
		
		//����3
		
		if(age < 0){
			System.out.println("����������ݷǷ�");
		}else if(age < 18){
			System.out.println("������ʱ��");
		}else if(age < 35){
			System.out.println("��׳��ʱ��");
		}else if(age < 60){
			System.out.println("����ʱ��");
		}else{
			System.out.println("����ʱ��");
		}
	}
}