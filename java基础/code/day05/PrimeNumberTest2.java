/*
100000���ڵ����������ʵ�ַ�ʽ��




*/



class PrimeNumberTest2{
	public static void main(String[] args){
		
			int count = 0;
			long start = System.currentTimeMillis(); //��ȡ��ǰʱ�����1970-01-01 00:00:00 �ĺ����� 
			
			
			
			label:for(int i = 2;i <= 100000;i++){                  
				//for(int j = 2;j < i;j++){ 
				for(int j = 2;j <= Math.sqrt(i);j++){       //�Ż�2���Ա�������������Ȼ������Ч��   
					if(i % j == 0){
						continue label;                     //�Ż�1��ֻ�Ա������������Ȼ������Ч��
					}
				}
				//ִ�е��˲���Ķ�������
					count++;
				
				                          
			}
			
			long end = System.currentTimeMillis();
			System.out.println("�����ĸ���Ϊ��" + count);
			System.out.println("˵���ѵ�ʱ�䣺" + (end - start));//20019 > �Ż�1��2435 > �Ż�2��785
			                                                     //11762 > �Ż�1��1498 > �Ż�2��14
	}
}