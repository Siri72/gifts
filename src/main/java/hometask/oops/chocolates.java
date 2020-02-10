package hometask.oops;

public class chocolates extends gifts {

	String[] candies;
	int [] weight;
	public chocolates(String[] candies,int [] weight) {
		this.candies=candies;
		this.weight=weight;
	}
		
		public void display() {
			System.out.println("The chocolates in the gifts are :");
			for(int i=0;i<candies.length;i++)
			{
				System.out.print(candies[i]);
				System.out.println(" - "+weight[i]);
			}
			
		}
		public int totalweight() {
			int total=0;
			for(int i=0;i<weight.length;i++)
				total=total+weight[i];
			return total;
		}

}
