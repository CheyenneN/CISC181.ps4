package PS4;

public class CalcEngine {

	private double interestRate = 0;
	private double years = 0;
	private double FutureValue = 0;
	
	public CalcEngine()
	{
	
	}
	
	public CalcEngine(double InterestRate,double Years){
		
		interestRate = InterestRate;
		years = Years;		
	}
	
	public void setInterestRate (double InterestRate)
    {
		interestRate = InterestRate;
    }

    public double getInterestRate()
    {
        return interestRate;
    }

    public void setYears (double Years)
    {
        years = Years;
    }

    public double getyears()
    {
        return years;
    }
    
    public void futureValue()
    {
    	FutureValue = (1 + (this.interestRate / 12))^(this.years * 12);
    }
}
