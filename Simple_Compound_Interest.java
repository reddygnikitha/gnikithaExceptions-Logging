package Exception_and_Logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Simple_Compound_Interest {

	public double compound_intrest(double amount,double time,double rate)
	{
		double com;
		com=amount * Math.pow(1.0+rate/100.0,time) -amount;
		return com;
	}
	public double simple_intrest(double amount,double time,double rate)
	{
		double sim ;
		sim=(amount * time * rate)/100;
		return sim;
	}
}
class client
{
	private static final Logger LOGGER=LogManager.getLogger();
	public static void main(String args[]) {
		Simple_Compound_Interest c_s=new Simple_Compound_Interest();
		double amount=1000;
		double time=2;
		double rate=1.5;
		double com,sim;
		com=c_s.compound_intrest(amount,time,rate);
		sim=c_s.simple_intrest(amount,time,rate);
		LOGGER.error(sim);
		LOGGER.error(com);
	}
}
