package hometask.oops;

public class sweets extends gifts{
	
	String[] candies;
	int [] weight;
	public sweets(String[] candies,int [] weight) {
		this.candies=candies;
		this.weight=weight;
	}
		public void display() {
			System.out.println("The sweets in the gifts are :");
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

	