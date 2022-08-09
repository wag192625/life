public class FibonacciFunction {
	public static void main(String[] args)  {
		int n = 10;
		
		for(int i = 0; i < n; i++) // 피보나치 수열 출력
			System.out.print(Fibonacci(i) + " ");
	}
	
	// 피보나치 수열의 결과를 구하는 메서드 선언
	public static int Fibonacci(int n)
	{
		if(n == 0)
			return 0;
		
		if(n == 1 || n == 2)
			return 1;
		
		else 
			return Fibonacci(n - 1) + Fibonacci(n - 2);
	}
}