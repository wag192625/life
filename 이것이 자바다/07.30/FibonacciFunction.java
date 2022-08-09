public class FibonacciFunction {
	public static void main(String[] args)  {
		int n = 100;

		for(int i = 0; i < n; i++) // 피보나치 수열 출력
			System.out.println(Fibonacci(i) + " ");
	}
	
	// 피보나치 수열의 결과를 구하는 메서드 선언
	public static int Fibonacci(int n)
	{
		if(n == 0 || n == 1 || n == 2) {
			if(n == 1 || n == 2) {
				return 1;}
			return 0;
		}
		else{
			return Fibonacci(n - 1) + Fibonacci(n - 2);
		}
	}
}