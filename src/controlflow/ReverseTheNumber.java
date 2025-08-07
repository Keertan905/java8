package controlflow;
//12345  54321
//12345 = 15
public class ReverseTheNumber{
public static void main(String[] args) {
	int n=12345;
	int sum =0;
	
// while(n>0) {
// apply reminder concept
//	int remainder  = n%10;
// sum = sum + remainder;
//	n= n/10;
// }
// System.out.println(sum);
	int reverse = 0;
	while(n>0) {
		int remainder = n%10;
		reverse = reverse*10+ remainder;
		n = n/10; 
	}
	System.out.println(reverse);
}
}
