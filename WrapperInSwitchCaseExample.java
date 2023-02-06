public class WrapperInSwitchCaseExample {       
       public static void main(String args[])  
       {         
            short age = 18; //4-wrapper class are use Byte Short Integer Long       
            switch (age)  
            {  
                case (16):            
                    System.out.println("You are under 18.");  
                    break;  
                case (18):                
                    System.out.println("You are eligible for vote.");  
                    break;  
                case (65):                
                    System.out.println("You are senior citizen.");  
                    break;  
                default:  
                    System.out.println("Please give the valid age.");  
                    break;  
            }             
        }  
}  