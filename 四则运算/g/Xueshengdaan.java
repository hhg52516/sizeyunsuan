package g;

import java.io.*;

public class Xueshengdaan {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		String a,b,c = "";
		int yes = 0;
		int no = 0;
		int sum = 1;
		try {
			FileReader fi1 = new FileReader("D:\\eclipse\\ѧ����.txt");
			FileReader fi2 = new FileReader("D:\\eclipse\\��ȷ��.txt");
			BufferedReader buf1 = new BufferedReader(fi1);
			BufferedReader buf2 = new BufferedReader(fi2);
			PrintStream pr = new PrintStream(new FileOutputStream("D:\\Eclipse\\�ɼ�����.txt"));
			System.setOut(pr);
			while((a=buf1.readLine())!=null) {
				if(a.equals(b=buf2.readLine())) {
					c = "����ȷ";
					yes++;
				}
				else {
					c = "�𰸴���";
					no++;
				}
				System.out.println("��" + sum + "�� " + c);
				sum++;
			}
			System.out.println("ѧ�������" + yes + "���⣬���" + no + "����");
			buf1.close();
			buf2.close();
		}catch(IOException e) {
			System.out.println("�������");
			System.exit(-1);
		}

	}

}
