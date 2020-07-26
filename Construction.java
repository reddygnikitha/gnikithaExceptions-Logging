import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

class Construction {

	public double Construction(double area,int i)
	{		
		double cost;
		double array[]= {
				area*1200,area*1500,area*1800,area*2500
		};
		cost=array[i];
		return cost;
	}
}
class server{
	private static final Logger LOGGER=LogManager.getLogger();
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Construction cs=new Construction();
		//Didn't used "println"
		 LOGGER.info("Enter 1:Standard Material 2:Above Standard Material 3:High Standard Material 4:High Standard Material and Fully Ay=utomated");
		 int i=sc.nextInt();
		 double area=20;
		 double cost;
		cost=cs.Construction(area,i);
		LOGGER.info(cost);
	}

}