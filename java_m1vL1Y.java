import javax.swing.JOptionPane;
import javax.swing.JOptionPane;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num,k;
		Armstrung a = new Armstrung();
		do
		{
			
		   num=Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER"));
           k=a.Arm(num);	
		}while(k==0);

	}	
}


public class Armstrung {
   
	   private int num1,sum;
	   private int rem;
	   public int Arm(int num)
	   {  sum=0;
		  num1=num; 
		   while(num>0)
		   {
			sum+=(num%10)*(num%10)*(num%10);
			num/=10;
		   }
		   
		 if(num1==sum)
		 {
			  JOptionPane.showMessageDialog(null, num1+"  IS  AN ARMSTRUNG" );
			  rem=Integer.parseInt(JOptionPane.showInputDialog("1.TO CONTINUE \n2.TO EXIT"));
			  if(rem==1 )
			   {
		        return 0 ;
		        }
			  else{
				   return 1;
		 
			     }
		 }
		 else
		 {   JOptionPane.showMessageDialog(null,num1+" NOT AN ARMSTRUNG"); 
		      rem=Integer.parseInt(JOptionPane.showInputDialog("1.TO CONTINUE \n2.TO EXIT"));
			  if(rem==1 )
			   {
		        return 0 ;
		        }
			  else{
				   return 1;
		 
			     }
		  }
	   
	  }

  }
