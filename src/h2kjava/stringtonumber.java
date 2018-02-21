package h2kjava;

public class stringtonumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "1,234,567,899";
		long res = Long.valueOf(s.replaceAll(",", "").toString());
		System.out.println(res);
	}
	
}

//for doing otherway round
//System.out.println(NumberFormat.getNumberInstance(Locale.US).format(35634646));