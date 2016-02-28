 public class Roman1{

    public static String IntegerToRoman(int n){
        String roman="";
        int repeat;
        int magnitude[]={1000,900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String symbol[]={"M","CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        repeat=n/1;
        for(int x=0; n>0; x++)
	{
            repeat=n/magnitude[x];
            for(int i=1; i<=repeat; i++)
	{
                roman=roman + symbol[x];
         }
            n=n%magnitude[x];
        }
        return roman;
    }
 
    public static void main(String args[]){
        System.out.println("1: "+IntegerToRoman(1));
        System.out.println("2: "+IntegerToRoman(2));
	//System.out.println(" Enter any number between 1-1000");
    }
}
