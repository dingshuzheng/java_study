import java.util.Scanner;
class SwitchCaseTest2{
	public static void main(String[] args){
		
		Scanner scan = new Scanner(System.in);
		System.out.println("������2019����·�");
		int mouth = scan.nextInt();
		System.out.println("������2019�������");
		int day = scan.nextInt();
		
		/*
		//����һ������������������
		int sumDays = 0;
		if(mouth == 1){
			sumDays = days;
		}else if(mouth == 2){
			sumDays = 31 + day;
		}
		//.....
		*/
		
		//��ʽ��
		/*
		switch(mouth){
			case 1:
			sumDays = day;
			break;
			case 2;
			sumDays = 31 + day;
			break;
			...
		}
		*/
		
		//������
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
				sumDays += 28;
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;
		
		}
		System.out.println("2019��" + mouth + "��" + day + "��" + "�ǵ����" + sumDays + "��");
	}
}