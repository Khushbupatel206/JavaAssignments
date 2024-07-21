package Assignment3;

public class ReThrowExceptionDemo {

	public int test(int n1, int n2) {
	     try{
	           return n1/n2;
	      }catch(ArithmeticException e){
	         throw e; 
	      }
	   }
	 
	 public static void main(String[] args) {
		 
		 ReThrowExceptionDemo ex = new ReThrowExceptionDemo();
		     
		 try{
		          
			 System.out.println(ex.test(30, 0));
		      
		 }catch(Exception e){
		          e.printStackTrace();
		      }
		   }
}
