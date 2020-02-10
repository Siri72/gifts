package hometask.oops;

public class gifts implements method_interface{
	int max[]= {50,100};
	String[] candies;
	
	public gifts() {
		
	}
	public gifts(String[] type,int[] max)
	{
		type=candies;
		this.max=max;
	}
	public gifts(String[] candies)
	{
		this.candies=candies;
	}
	public void display() {
		System.out.println("gift pack contains: ");
		for(int i=0;i<candies.length;i++)
		{
			System.out.println(candies[i]);
		}
	}
	public int totalweight() {
		int sum=0;
		for (int i=0;i<max.length;i++) 
			sum=sum+max[i];
		return sum;
	}
}
