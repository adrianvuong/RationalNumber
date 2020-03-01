public class rationalNumber {
	
	private int num;
	
	private int den;
	
	public rationalNumber(){
		num=0;
		den=1;
	}
	public rationalNumber(String rational) {
		String numerator= rational.substring(0,rational.indexOf("/"));
		String denominator= rational.substring(rational.indexOf("/")+1);
		
		num=Integer.parseInt(numerator);
		den=Integer.parseInt(denominator);
		
	}
	
	public int setNum(int num) {
		this.num=num;
		return num;
	}
	public int setDen(int den) {
		this.den=den;
		return den;
	}
	
	public int getNum() {
		return num;
	}
	public int getDen() {
		return den;
	}
	
	public void gcf(int num1, int den1, int num2, int den2) {
		
	}
	
	
}
