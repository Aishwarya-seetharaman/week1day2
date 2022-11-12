package week1.day2;

public class array{
	public static void main(String[] args) {
		
	int[] num= {11,22,33,55,33,44,33};
    int Count = 0;
    for (int i = 0; i < num.length; i++)
        if(num[i]==33) {
            
            Count++;

            System.out.println(Count);
        }
    
	}
}

\

