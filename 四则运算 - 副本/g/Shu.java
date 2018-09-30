package g;

import java.util.Random;

public class Shu {
	public String suijishu(int num) {
		Random a = new Random();
		int b = a.nextInt(num);
		String c = Integer.toString(b);
		return c;
	}
	public String suijizifu() {
		Random a = new Random();
		int b = a.nextInt(4);
		String string="q";
		if(b>=0&&b<1)
			string = "x";
		else if(b>=1&&b<2)
			string = "¡Â";
		else if(b>=2&&b<3)
			string = "+";
		else string = "-";
		return string;
	}
	public int suijiliang() {
		Random a = new Random();
		int b = a.nextInt(2);
		return b+2;
	}
	public String fenshu(String b) {
		Random a = new Random();
		int c= a.nextInt(4);
		int d = c+a.nextInt(6);
		String e = b;
		if(c>=3) {
			if(b.equals("0"))
				e = c + "/" + d;
			else
				e = b + "'" + c + "/" + d;
		}
		return e;
	}
	
	public String jiafenshu(String b) {
		String a[] = b.split("'");
		String c[] = a[1].split("/");
		int d = Integer.parseInt(a[0]);
		int e = Integer.parseInt(c[0]);//·Ö×Ó
		int f = Integer.parseInt(c[1]);//·ÖÄ¸
		int g = d * f + e;
		String h = g + "/" + f;
		return  h;
	}
	
	public static String zhenfenshu(String b) {
		String[] a = b.split("/");
		String c = "";
		int d = Integer.parseInt(a[0]);
		int e = Integer.parseInt(a[1]);
		int f,g,h = 0;
		if(a[0].equals("0"))
			c = "0";
		else if(a[1].equals("1"))
			c = a[0];
		else if(d>=e) {
			f = d/e;
			g = d%e;
			if(g==0)
				c = f + "";
			else {
				h = Sizeyunsuan.gongyinzi(g, e);
				c = f + "'" + g/h +"/" + e/h;
				
			}
		}
		else {
			c = b;
		}
		return c;
	}


}
