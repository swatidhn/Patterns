class Pattern1 
{
	public static void main(String[] args) 
	{
		int n=4;
		for(int i=0;i<=n;i++)
		{ 
			for(int j=n-i ;j>=0;j--)
			{
				System.out.print(" ");

			}
			
			for(int k=0; k< 2*i-1;k++)
			{

              System.out.print("*");
			}

			System.out.println();
		}
	}
}
