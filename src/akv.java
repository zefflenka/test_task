
import java.text.NumberFormat;
import java.text.ParseException;

public class akv {

	public static void main(String[] args) throws ParseException {
		
		String q ="-5565,65";
		int i = q.length();
	
		NumberFormat nf = NumberFormat.getInstance();
		nf.setParseIntegerOnly(true);
		
		
		if (i>2 & i<232-1)
        System.out.println(nf.parse(q));
        else
        System.out.println("number " +i  +" must be between 2 and 231");
	}

}