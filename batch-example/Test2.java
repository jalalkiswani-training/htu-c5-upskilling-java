import java.util.Random;
public class Test2{
	public static void main(String args[]){
		int size=Integer.parseInt(args[0]);
		int arr[]=new int[size];
		Random rand = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i]=rand.nextInt(65)+35;
		}
		
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}
		System.out.println("Sum ="+sum);
	}
}