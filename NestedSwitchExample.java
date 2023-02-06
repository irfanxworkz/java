public class NestedSwitchExample
{
	public static void main(String args[])
	{
		char branch = 'E';
		int collegeYear = 2;
		switch(collegeYear)
		{
			case 1:
				System.out.println("English, Maths, Science");
				break;
			case 2:
				switch(branch)
				{
					case 'C':
					System.out.println("Operating System, Java, Data Structure");
					break;
					case 'E':
					System.out.println("Micro processors, Logic switching theory");
					break;
					case 'M':
					System.out.println("Drawing, Manufacturing Machines");
					break;	
				}
			break;
			case 3:
				switch(branch)
				{
					case 'C':
					System.out.println("Computer Organization, Mltimedia");
					break;
					case 'E':
					System.out.println("Fundamental of logic Design, Microelectronicws");
					break;
					case 'M':
					System.out.println("Internal Combustion Engine, Mechanical Vibration");
					break;
				}
			break;
			case 4:
			  	switch(branch)
				{
				
					case 'C':
					System.out.println("Data Communication and Networks, MultiMedia");
					break;
					case 'E':
					System.out.println("Embedded System, Image Processing");
					break;
					case 'M':
					System.out.println("Production Technology, Thermal Engineering");
					break;
				}
			break;
		}
	}
}
