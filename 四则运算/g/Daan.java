package g;

import java.io.*;

public class Daan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String a,b,f = "";
		try {
			FileReader in = new FileReader("D:\\eclipse\\题目.txt");
			BufferedReader buf1 = new BufferedReader(in);
			System.setOut(new PrintStream("D:\\eclipse\\正确答案.txt"));
/*
 * new (./git.txt)
 */
			while((a = buf1.readLine()) != null) {
				String[] c = new String[a.split(" ").length];
				
				String[] d = new String[a.split(" ").length-2];
				c = a.split(" ");
				c = Zifuchuang.xiugai(c);
				for(int i = 0; i < d.length; i++)
					d[i] = c[i+1];
				b = Sizeyunsuan.last(d);
				f = Shu.zhenfenshu(b);
				System.out.println(f);
			}
			buf1.close();
		}catch(IOException e) {
			System.out.println("文件出错");
			System.exit(-1);
		}
	}

}
