package nl.utwente.di;

public class Quoter {
	public double getBookPrice(String s){
		double res = 0;
		if(s.equals("1")){
			res = 10.0;
		}else if(s.equals("2")){
			res = 45.0;
		}else if(s.equals("3")){
			res = 20.0;
		}else if(s.equals("4")){
			res = 35.0;
		}else if(s.equals("5")){
			res = 50.0;
		}
		return res;
	}
}
