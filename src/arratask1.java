import java.util.Arrays;
import java.util.Scanner;

public class arratask1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in) ;		
		int[] nums= {1,55,7,898,55};
		//System.out.println(nums);
		String str = Arrays.toString(nums) ; //burdada sayilari list ediyr
		
	    System.out.println( str  );
	    int greater = 100;
	    int count=0;
		for(int i = 0; i < nums.length ; i++) {
			if(nums[i] >greater) {
				count++;
				System.out.println(nums[i]);//burda buyuk olanlari gosteryr
				System.out.print(count);//burda kactane olduklarini gosteriyr

	}

}
}
}