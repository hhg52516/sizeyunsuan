package g;

public class Zifuchuang {
	public String zifuchuang(String[] a) {
		String b = "";
			for(int i = 0; i < a.length; i++) {
				b = b + a[i];			
		}
		return b;
	}
	
	public  static String[] xiugai(String[] a) {
		Shu s3 = new Shu();
		for(int i = 0; i < a.length; i++) {
			if(a[i].contains("'")) {
				a[i] = s3.jiafenshu(a[i]);
			}
			//整数转分数
			if(!a[i].contains("/") && !a[i].equals("x") && !a[i].equals("÷") && !a[i].equals("+") && !a[i].equals("-") && !a[i].equals(" ")) {
				a[i] = a[i] + "/1";
			}
		}
		return a;
	}

}
