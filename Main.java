import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
 class Main {
	public static void main(String[] args) {

	String date1;
	String date2;
date1 = JOptionPane.showInputDialog(null,"Insira a data MM/dd/yyyy","Data",1); 
date2 = JOptionPane.showInputDialog(null,"Insira a data MM/dd/yyyy","Data",1);


		try {
		

			String format = "MM/dd/yyyy ";
 
 			SimpleDateFormat sdf = new SimpleDateFormat(format);
 
			Date dateObj1 = sdf.parse(date1 + " " );
			Date dateObj2 = sdf.parse(date2 + " " );
			System.out.println(dateObj1);
			System.out.println(dateObj2);
	
			long diff = dateObj2.getTime() - dateObj1.getTime();
 
			int diffDays = (int) (diff / (24 * 60 * 60 * 1000));
			System.out.println("difference between days: " + diffDays);
 
	
		} catch (Exception e) {
			e.printStackTrace();
      
		}
	}
}