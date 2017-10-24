package vorlesung_19_10_2017;

public class Datentypen {

	public static void main(String[] args) {
		byte	a = 1;
		short	b = 1;
		int		c = 1;
		long	d = 1;
		float	e = 1.0f;
		double	f = 1.0d;
		byte newA = exCast(a);
		byte newB = exCast(b);
		byte newC = exCast(c);
		byte newD = exCast(d);
		byte newE = exCast(e);
		byte newF = exCast(f);
		System.out.println(" "+a+" "+b+" "+c+" "+d+" "+e+" "+f);
		System.out.println(" "+newA+" "+newB+" "+newC+" "+newD+" "+newE+" "+newF);
	}
	
	public static byte exCast (double big2small) {
		return (byte) big2small;
	}

}
