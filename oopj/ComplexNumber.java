
public class ComplexNumber 
{

	private int num1;
	private int num2;
	
	void setNumber(int num1,int num2)
	{
		this.num1=num1;
		this.num2=num2;
	}
	int getnum1()
	{
		return num1;
	}
	int getnum2()
	{
		return num2;
	}
	int computeComplexNumber()
	{
		return num1*num2;
	}
	public static void main(String[] args) 
	{
		//ComplexNumber objComplex=new ComplexNumber();
		ComplexNumber arr[]=new ComplexNumber[5];
		System.out.println("Enter 5 pair of elements: ");
		for(int itemp=0;itemp<5;itemp++)
		{
			arr[itemp]=new ComplexNumber();
			arr[itemp].setNumber(Console.getInt(),Console.getInt());
		}
		
		for(int itemp=0;itemp<5;itemp++)
		{
			System.out.print(arr[itemp].getnum1()+" "+arr[itemp].getnum2()+"= ");
			System.out.println(arr[itemp].computeComplexNumber());
		}

	}

}
