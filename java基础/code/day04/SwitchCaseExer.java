/*
1. ���ǿ���ʹ��switch-case�Ľṹ������ת����if-else����֮������
2. ������д��֧�ṹʱ���ȿ���ʹ��switch-case��switch�еı��ʽȡֵ�����̫�ࣩ���ֿ���ʹ��if-elseʱ��
   ��������ѡ��switch-case��ԭ��switch-caseִ��Ч�ʸ�


*/



import java.util.Scanner;
class SwitchCaseExer{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���������");
		int year = scan.nextInt();
		System.out.println("������" + year + "����·�");
		int mouth = scan.nextInt();
		System.out.println("������" + year + "�������");
		int day = scan.nextInt();
		
		int sumDays = 0;
		switch(mouth){
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				//sumDays += 28
				if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
					sumDays += 29;
				}else{
					sumDays += 28;
				}
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;
		
		}
		System.out.println(year + "��" + mouth + "��" + day + "��" + "�ǵ���ĵ�" + sumDays + "��");
		
	}
}