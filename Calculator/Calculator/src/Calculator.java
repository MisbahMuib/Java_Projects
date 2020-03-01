
public class Calculator {
	public int x;
	public int y;
	
	public Calculator(int x, int y){
		this.x = x;
		this.y = y;
	}
	public void add(){
		int a=x+y;
		System.out.println("Add ="+a);
		
	}
	public void sub(){
		int b=x-y;
		System.out.println("sub ="+b);
	}
	

}
