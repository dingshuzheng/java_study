/*
��֧�ṹ����switch-case

1. ��ʽ
switch�����ʽ��{
	case ����1��
	ִ�����1��
	//break��
	
	case ����2��
	ִ�����2��
	//break��
	
	...
	
	default:
	ִ�����n��
	//break;
}

2. ˵����
�� ����switch���ʽ�е�ֵ������ƥ�����case�еĳ�����һ��ƥ��ɹ����������Ӧcase�ṹ�У�������ִ����䡣
  ��������ִ�����֮������Ȼ��������ִ������case�ṹ�е�ִ����䣬֪������break�ؼ��ֻ��switch-case�ṹĩβ����Ϊֹ

�� break�ؼ��ֿ���ʹ����switch-case�ṹ�У���ʾһ��ִ�е��˹ؼ��֣�������switch-case�ṹ

�� switch-case�еı��ʽ��ֻ�������µ�6������֮һ��byte,short,char,int,ö�����ͣ�JDK5.0������,String(JDK7.0����)

�� case֮��ֻ����������������������Χ

�� break�ؼ����ǿ�ѡ��

�� default�൱��if-else�е�else
          default�ṹ�ǿ�ѡ�Ķ���λ��������

*/



class SwitchCaseTest{
	public static void main(String[] args){
		
		
		int number = 2;
		switch(number){
			
		    case 0:
				System.out.println("zero");
				break;
			case 1:
				System.out.println("one");
				break;
			case 2:
				System.out.println("two");
				break;
			case 3:
				System.out.println("three");
				break;
			default:
				System.out.println("other");
				
		}
		
		
		//****************************************
		
		//����ʾ��
		/*
		boolean isHandsome = true;
		switch(isHandsome){
			case true:
			System.out.println("ȸ��˧");
			break;
			case false:
			System.out.println("sorry");
			break;
			default:
			System.out.println("��������");
		}
		*/
	}
}