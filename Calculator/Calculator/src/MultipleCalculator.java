
public class MultipleCalculator extends Calculator{
	
	int c=0,d=0;
	
	public MultipleCalculator(int x, int y) {
		super(x, y);
	
	}
	public  void multiply()
{
		c=x*y;
		System.out.println("Sub = "+c);
		
	}
	public void division(){
		d=x/y;
		System.out.println("Muli = "+d);
	}
	
	
	public static void main(String args[]){
		MultipleCalculator C1= new MultipleCalculator(5,5);
		C1.add();
		C1.sub();
		C1.multiply();
		C1.division();
	}

}
