package g;

import java.util.*;
import java.io.*;

public class Timu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.setOut(new PrintStream("D:\\eclipse\\��Ŀ.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("�Ҳ���ָ���ļ�");
			System.exit(-1);
		}catch(IOException e1) {
			System.out.println("�������");
			System.exit(-1);
		}
		
		String first = scanner.nextLine();
		String string[] = first.split(" ");//�ո�ָ��������޺���Ŀ����
		String string1 = string[1];
		String string0 = string[0];
		int str0 = Integer.parseInt(string0);
		try {
		}catch(NumberFormatException e2) {
			System.out.println("����������");
			System.exit(-1);
		}
		int num = Integer.parseInt(string1);
		try {
			ArrayIndexOutOfBoundsException e1 = new ArrayIndexOutOfBoundsException();
			if(num > 10 || num < 0) {
			throw e1;
			}
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("������10���ڵ���");
			System.exit(-1);
		}
		//������Ŀ����
		String[] strsum = new String[str0];
		for(int k = 0; k<str0; k++) {
			Shu s1 = new Shu();
			int t = s1.suijiliang();//�õ�ÿ���������
			String[] number = new String[t];//���ô����������
			String[] symbol = new String[t-1];//���ô�ŷ��ŵ�����
			String[] sum =new String[4*t-3];//�����ܵ�����
			for(int i = 0; i < t; i++) {
				number[i] = s1.fenshu(s1.suijishu(num));//�õ����������Ϊ�������
			}
			for(int i = 0; i < t-1; i++) {
				symbol[i] = s1.suijizifu();//�õ�����Ӽ��˳��ķ���
			}
			for(int i = 0; i < 4*t-3; i++) {
				int c = 0;
				//�����ӽ�
				if(i%4 == 0) {
					c = i - 2;
					//�ų�0Ϊ����
					if(c > 0 && symbol[i/4-1]=="��" && number[i/4].equals("0")) {
						number[i/4] = "1";
					}
					sum[i] = number[i/4];
				}
				//���ַ��ӽ�
				else if(i%4 == 2) {
					c = (i+2)/4-1;
					sum[i] = symbol[c];
				}
				else {
					sum[i] = " ";
				}
			}
			Zifuchuang s2 = new Zifuchuang();
			String jieguo = s2.zifuchuang(sum);
			sum = Zifuchuang.xiugai(sum);//string[]
			//String jieguo2 = s2.zifuchuang(sum);
			String jieguo2 = "";
			jieguo2 =	Sizeyunsuan.last(sum);
			int i = 0;
			boolean flag = true;
			//���ʽ����
			while(i < str0) {
				if(strsum[i]!=null && jieguo2!=null && strsum[i].equals(jieguo2)) {
					flag = false;
					break;
				}
				i++;
			}
			if(flag == false)
				k--;
			else if(flag == true) {
			String jieguo3 =k + 1 + ". " + jieguo + " =";
			System.out.println(jieguo3);
			}
		}
		scanner.close();
		
	}

}


