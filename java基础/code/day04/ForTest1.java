/*
��Ŀ�������������������������Լ������С������
      




*/
import java.util.Scanner;
class ForTest1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������һ����������");
		int m = scan.nextInt();
		System.out.println("������ڶ�����������");
		int n = scan.nextInt();
		
		
		int min = (m <= n)? m : n;
		for(int i = min;i >= 1;i--){
			if(m % i == 0 && n % i == 0){
				System.out.println("���Լ����" + i);
				break;//һ����ѭ��������break��������ѭ��
			}
		}
		
		int max = (m >= n)? m : n;
		for(int i = max;i > 0;i++){
			if(i % m == 0 && i % n == 0){
				System.out.println("��С��������" + i);
				break;
			}
		}
		
		
		//***********************************************
		//ˮ�ɻ���
		int ge,shi,bai;
		for(int i = 100;i < 1000;i++){
			ge = i % 10;
			shi = i % 100 / 10;
			bai = i / 100;
			if(ge ^ ge * ge + shi * shi * shi + bai * bai * bai == i) {
				System.out.println("100-999�ڵ�ˮ�����У�" + i);
			}
		}			
		
		
	
	}
}