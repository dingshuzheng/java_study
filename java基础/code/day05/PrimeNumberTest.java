/*
100���ڵ���������
������������ֻ�ܱ�1����������������Ȼ����
��С��������2



*/


class PrimeNumberTest{
	public static void main(String[] args){
		
		boolean isFlag = true;
		
		
		System.out.println("100���ڵ������У�");
		
		for(int i = 2;i <= 100;i++){                  //����100���ڵ���Ȼ��
			for(int j = 2;j <= (i - 1);j++){          //j��i����
				if(i % j == 0){
					isFlag = false;
				}
			}
			if(isFlag == true){
				System.out.println(i);
			}
			isFlag = true;                             //����isFlag,������isFlag�ڵ�һ�α��false���һֱ��false
		}
	}
}