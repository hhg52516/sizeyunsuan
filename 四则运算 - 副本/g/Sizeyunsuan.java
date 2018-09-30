package g;

public class Sizeyunsuan {
	
	//Sizeyunsuan s4 = new Sizeyunsuan();
	//分子和分母
	public static int[] split(String a) {
		String[] b = a.split("/");
		int[] c = new int[2];
		c[0] = Integer.parseInt(b[0]);
		c[1] = Integer.parseInt(b[1]);
		return c;
	}
	//最大公因数
	public static int gongyinzi(int a,int b){
	    while(b!=0){
	        int temp=a%b;
	        a=b;
	        b=temp;
	    }
	    return a;
	}
	//乘法
	public static String Mul(String a, String b) {
		String t = "";
		int[] c = Sizeyunsuan.split(a);
		int[] d = Sizeyunsuan.split(b);
		int e = c[0] * d[0];
		int f = c[1] * d[1];
		int g =Sizeyunsuan.gongyinzi(e, f);
		t = e/g +"/" + f/g;
		return t;
	}
	//除法
	public static String Div(String a, String b) {
		String t = "";
		int[] c = Sizeyunsuan.split(a);
		int[] d = Sizeyunsuan.split(b);
		int e = c[0] * d[1];
		int f = c[1] * d[0];
		int g =Sizeyunsuan.gongyinzi(e, f);
		t = e/g +"/" + f/g;
		return t;
	}
	//加减法
	public static String AddSub(String a, String b, String fuhao) {
		String t = "";
		int[] c = Sizeyunsuan.split(a);
		int[] d = Sizeyunsuan.split(b);
		int g =c[1] * d[1] / Sizeyunsuan.gongyinzi(c[1], d[1]);//最小公倍数
		int e = g / c[1] * c[0];
		int f = g / d[1] * d[0];
		if(fuhao.equals("+")) {
			int h = e + f;
			t = h +"/" + g;
		}
		else {
			int h = e - f;
			t = h +"/" + g;
		}
		return t;
	}
	
	public  static String last(String[] a) {
		for(int i = 1; i < a.length; i = i+2) {
			int n = 1;
			while(a[i-n].equals("")) {
				n++;
			}
			if(a[i].equals("x")) {
				a[i-n] = Sizeyunsuan.Mul(a[i-n], a[i+1]);
				a[i] = "";
				a[i+1] = "";
			}
			else if(a[i].equals("÷")) {
				a[i-n] = Sizeyunsuan.Div(a[i-n], a[i+1]);
				a[i] = "";
				a[i+1] = "";
			}
		}
		for(int i = 1; i < a.length; i = i+2) {
			int n = 1;
			while(a[i-n].equals("")) {
				n++;
			}
			if(a[i].equals("+")) {
				a[i-n] = Sizeyunsuan.AddSub(a[i-n], a[i+1],"+");
				a[i] = "";
				a[i+1] = "";
			}
			else if(a[i].equals("-")) {
				a[i-n] = Sizeyunsuan.AddSub(a[i-n], a[i+1],"-");
				a[i] = "";
				a[i+1] = "";
			}
		}
		return a[0];
	}

}
