import java.util.Scanner;
class IfExer{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("�����������ߣ���cm��");
	int height = scan.nextInt();
	System.out.println("��������ĲƸ�����ǧ��");
	double wealth = scan.nextDouble();
	//��ʽһ��
	/*
	System.out.println("���������Ƿ�˧����true/false��");
	boolean isHandsome = scan.nextBoolean();
	*/
	System.out.println("���������Ƿ�˧����true/false��");
	String isHandsome = scan.next();
	
	if(height >= 180 && wealth >= 1 && isHandsome.equals("��")){
		System.out.println("��һ��Ҫ�޸���������");
	}else if(height >= 180 || wealth >= 1 || isHandsome.equals("��")){
		System.out.println("���Ͱɡ�����");
	}else{
		System.out.println("��������");
	}
	
	}
}