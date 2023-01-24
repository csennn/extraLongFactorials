import java.io.*;
import java.math.*;

class Result {

	public static void extraLongFactorials(int n) {

		BigInteger result = BigInteger.valueOf(1);
		for (int i = n; i >= 1; i--) {
			result = result.multiply(BigInteger.valueOf(i));
		}
		System.out.println(result);

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		Result.extraLongFactorials(n);

		bufferedReader.close();
	}
}
