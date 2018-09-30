package g;

import java.util.*;
import java.io.*;

public class Timu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.setOut(new PrintStream("D:\\eclipse\\题目.txt"));
		}catch(FileNotFoundException e) {
			System.out.println("找不到指定文件");
			System.exit(-1);
		}catch(IOException e1) {
			System.out.println("程序出错");
			System.exit(-1);
		}
		
		String first = scanner.nextLine();
		String string[] = first.split(" ");//空格分割数的上限和题目数量
		String string1 = string[1];
		String string0 = string[0];
		int str0 = Integer.parseInt(string0);
		try {
		}catch(NumberFormatException e2) {
			System.out.println("请输入整数");
			System.exit(-1);
		}
		int num = Integer.parseInt(string1);
		try {
			ArrayIndexOutOfBoundsException e1 = new ArrayIndexOutOfBoundsException();
			if(num > 10 || num < 0) {
			throw e1;
			}
		}catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("请输入10以内的数");
			System.exit(-1);
		}
		//设置题目数量
		String[] strsum = new String[str0];
		for(int k = 0; k<str0; k++) {
			Shu s1 = new Shu();
			int t = s1.suijiliang();//得到每题的数的量
			String[] number = new String[t];//设置存放数的数组
			String[] symbol = new String[t-1];//设置存放符号的数组
			String[] sum =new String[4*t-3];//设置总的数组
			for(int i = 0; i < t; i++) {
				number[i] = s1.fenshu(s1.suijishu(num));//得到随机数（可为真分数）
			}
			for(int i = 0; i < t-1; i++) {
				symbol[i] = s1.suijizifu();//得到随机加减乘除的符号
			}
			for(int i = 0; i < 4*t-3; i++) {
				int c = 0;
				//将数加进
				if(i%4 == 0) {
					c = i - 2;
					//排除0为除数
					if(c > 0 && symbol[i/4-1]=="÷" && number[i/4].equals("0")) {
						number[i/4] = "1";
					}
					sum[i] = number[i/4];
				}
				//将字符加进
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
			//结果式查重
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


