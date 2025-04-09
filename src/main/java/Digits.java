import java.util.ArrayList;

public class Digits
{

	private ArrayList<Integer> digitList;

	public Digits(int num)
	{ /* to be implemented in part (a) */ 
	    digitList= new ArrayList<Integer>();
		if(num>0){
			while(num!=0){
				digitList.add(0,num%10);
				num=num/10;
			}
		}else if(num==0){
			digitList.add(0);
		}
	}

	public boolean isStrictlyIncreasing()
	{ /* to be implemented in part (b) */
		if(digitList.size()==1){
			return true;
		}
		for(int i =0; i<digitList.size()-1; i++){
			if(digitList.get(i)>digitList.get(i+1)){
				return false;
			}
		}
		return true;
	}
	
	public String toString()
	{
		return digitList.toString();
	}
}
