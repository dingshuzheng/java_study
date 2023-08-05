import java.util.Scanner;

public class Utility {
    private static Scanner sc = new Scanner(System.in);

    /*
    �÷������ڴӼ��̶�ȡ���˵���1,2,3,4ѡ������û������ѡ��
     */
    public static char readMenuSelection() {
        char c;
        for (; ;){
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if(c != '1' && c != '2' && c!= '3' && c != '4'){
                System.out.print("ѡ��������������룺");
            } else break;
        }
        return c;
    }

    /*
    �÷������ڴӼ����϶�ȡ���ֽ�����ݣ����ִ�С������4λ�����������������
     */
    public static int readNumber() {
        int n;
        for (; ;){
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e){
                System.out.println("�������ִ������������룺");
            }
        }
        return n;
    }

    /*
    �÷������������֧��˵�����룬�÷����Ӽ��̶�ȡһ���ַ���������
     */
    public static String readString() {
        return readKeyBoard(8);
    }

    public static char readConfirmSelection(){
        char c;
        System.out.print("�Ƿ��˳��������루Y/N����");
        for(;  ;){
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if(c == 'Y' || c == 'N'){
                break;
            } else {
                System.out.println("����������������룺");
            }
        }
        return c;
    }

    /*
    �ķ������ڴӼ��̶�ָ�����ȵ�ȡ�ַ���������һ���ַ���
     */
    public static String readKeyBoard(int length) {
        String str;
        for (; ;){
            str = sc.next();
            if(str.length() > length){
                System.out.println("�������ݳ�����Χ������������" + length + "�����ݣ�");
            } else break;
        }
        return str;
    }

}