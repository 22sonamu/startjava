# 메서드

```java
public class Hello {

	public static void main(String[] args) {
		System.out.println("합 (1-10)" + sum(1, 10));
		System.out.println("합 (1-100)" + sum(1, 100));

	}

	public static int sum(int i1, int i2) {
		int sum = 0;
		for (int i = i1; i <= i2; i++)
			sum += i;
		return sum;
	}

}
```
- public -> 접근 지정자
- static -> 객체를 생성하지 않고 실행할 수 있다.
- int -> 반환 타입 --> 반환할 타입이 없을땐 void를 쓴다.


### 예제 1
- 가위바위보 승부 출력 프로그램
```java
public class Hello {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("철수 :");
		String a = in.next();
		System.out.print("영희 :");
		String b = in.next();
		Win(a, b);

	}

	public static void Win(String c, String y) {
		String answer;
		if (c.equals(y))
			answer = "비겼습니다.";
		else if (c.equals("s")) {
			if (y.equals("r"))
				answer = "영희, 승";
			else if (y.equals("p"))
				answer = "철수, 승";
		} else if (c.equals("r")) {
			if (y.equals("p"))
				answer = "영희, 승";
			else if (y.equals("s"))
				answer = "철수, 승";
		} else if (c.equals("p")) {
			if (y.equals("s"))
				answer = "영희, 승";
			else if (y.equals("r"))
				answer = "철수, 승";
		}

		System.out.print(answer);
	}

}
```
