
public class MainLuhnCard {

	public static void main(String[] args) {
		String number = (Math.random()*2 + "") ;
		countControlDigit(number);
	}
	
	public static void countControlDigit(String number) {
		
		int controlDigit = 0, digit = 0, sum = 0; // 03214321
		for(int i = 0; i < number.length(); i++) {
			digit = Integer.parseInt(number.charAt(i) + "");//0
			if(i % 2 != 0) digit *=2;
			if(digit > 9) digit-= 9;
			sum += digit;
		}
		controlDigit = (sum%10==0) ? 0 : (10-sum%10);
		return;
	}

}
