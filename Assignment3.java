import javax.swing.JOptionPane;
public class Assignment3 {

	public static void main(String[] args) {
		String[] choices = { "Admin", "Student", "Staff"};
		String input = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]); 
		
			String User, Pass;
			int limit = 3,trial=0;
			User = JOptionPane.showInputDialog("Enter username: ");
			if (!User.equals("sta")){
				trial = trial + 1;
			while(!User.equals("sta") && trial<limit){
			User = JOptionPane.showInputDialog("Invalid username. Please try again: ");
			if(!User.equals("sta")){
			trial++;
			}
				else{
			trial = trial + 0;
			}
			}
			}
			if (trial<limit){
			Pass = JOptionPane.showInputDialog("Enter password: ");
			if(!Pass.equals("505")){
			trial = trial + 1;}
			while(!Pass.equals("505") && trial<limit){
			Pass = JOptionPane.showInputDialog("Invalid password. Please try again: ");
			if(!Pass.equals("505")){
				trial++;
			}
				else{
				trial = trial+0;
				
			}
			}
						
			}
					
			
				if (trial == limit){
			JOptionPane.showMessageDialog(null,"Contact Administrator");
			System.exit(0);
			}
			prompt = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);		
			while(prompt.compareTo(input)!=0){
				JOptionPane.showMessageDialog(null, "wrong account type" );
								
			prompt = (String) JOptionPane.showInputDialog(null, "Choose account type...","Account Type",JOptionPane.QUESTION_MESSAGE, null,choices,choices[1]);

			switch (input){
			case "Admin":
				JOptionPane.showMessageDialog(null, "Welcome Admin! You can update and read file.");
				break;
			case "Student":
				JOptionPane.showMessageDialog(null, "Welcome Student! You can only read file.");
				break;
			case "Staff":
				JOptionPane.showMessageDialog(null,"Welcome Staff! You can update, read, add, delete file.");
			break;
					
				
			}
	}
}
