
public class Test {
	public static void main(String args[])
	{
		MACBook m = new MACBookAir();
		m.start();
		m.shutDown();
		MACBook m1 = new MACBookPro();
		m1.start();
		m1.shutDown();
	}
}
