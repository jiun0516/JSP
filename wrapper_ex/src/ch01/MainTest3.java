package ch01;

public class MainTest3 {

	public static void main(String[] args) {
		String str = "10";
		String str2 = "10.5";
		String str3 = "true";
		
		byte b = Byte.parseByte(str);
		int i = Integer.parseInt(str);
		short s = Short.parseShort(str);
		long l = Long.parseLong(str);
		float f = Float.parseFloat(str2);
		double d = Double.parseDouble(str2);
		boolean bool = Boolean.parseBoolean(str3);
		
		System.out.println("b : " + b);
		System.out.println("i : " + i);
		System.out.println("s : " + s);
		System.out.println("l : " + l);
		System.out.println("f : " + f);
		System.out.println("d : " + d);
		System.out.println("bool : " + bool);
		System.out.println("!bool : " + !bool);
	}

}
