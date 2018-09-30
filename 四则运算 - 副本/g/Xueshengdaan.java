package g;

import java.io.*;

public class Xueshengdaan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a,b,c = "";
		int yes = 0;
		int no = 0;
		int sum = 1;
		try {
			FileReader fi1 = new FileReader("D:\\eclipse\\学生答案.txt");
			FileReader fi2 = new FileReader("D:\\eclipse\\正确答案.txt");
			BufferedReader buf1 = new BufferedReader(fi1);
			BufferedReader buf2 = new BufferedReader(fi2);
			PrintStream pr = new PrintStream(new FileOutputStream("D:\\Eclipse\\成绩分数.txt"));
			System.setOut(pr);
			while((a=buf1.readLine())!=null) {
				if(a.equals(b=buf2.readLine())) {
					c = "答案正确";
					yes++;
				}
				else {
					c = "答案错误";
					no++;
				}
				System.out.println("第" + sum + "题 " + c);
				sum++;
			}
			System.out.println("学生共答对" + yes + "道题，答错" + no + "道题");
			buf1.close();
			buf2.close();
		}catch(IOException e) {
			System.out.println("程序出错");
			System.exit(-1);
		}

	}

}
