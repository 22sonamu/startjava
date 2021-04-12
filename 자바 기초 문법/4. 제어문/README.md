# 조건문
### if문
- 조건문이 true 일 때만 실행문을 수행
- 조건식이 true일 때 수행할 실행문이 하나라면 {}를 생략가능

```java
if(조건문){
  실행문;
}
```


### if ~ else문

```java
if(조건식){
  실행문;
}else{
  실행문;
}
```


- 예제 1
  - 입력받은 정수가 19이상이면 성년 아니면 미성년을 출력하는 프로그램
```java
public class Hello {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("나이 입력");
		a = in.nextInt();
		if (a < 19)
			System.out.println("미성년");
		else
			System.out.println("성년");

	}

}
```

### 다중 if문

- 예제
	- 점수를 입력하면, 학점을 출력하는 프로그램

```java
public class Hello {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int a = in.nextInt();

		if (a >= 90)
			System.out.println("A");
		else if (a >= 80)
			System.out.println("B");
		else if (a >= 70)
			System.out.println("C");
		else
			System.out.println("F");

	}

}
```
# 반복문

### while문


```java
int i = 1;
while(a<5){
	System.out.print(i); //1234
	i++; 
}
```


- while(true)
	- 오류 미발생
	- 본체를 탈출할 실행문이 필요하다.
- while(false)
 	- 오류 발생

- 예제 
	- 구구단 2단부터 9단까지 출력
```java
public class Hello {

	public static void main(String[] args) {
		int a = 2;
		int b = 1;
		while (a <= 9) {
			b = 1;
			while (b <= 9) {

				System.out.printf("%d * %d = %d\n", a, b, a * b);
				b++;
			}
			a++;
		}

	}

}
```
### do while문
```java
do{반복실행문들
}while(조건식);
```
- while문과 비슷하지만 do반복문 본체를 실행한 후 조건식을 평가한다.

```java
int i = 1;
do{
	System.out.print(i); //1234
	i++;
}while(i<5);
```

- 예제
	- 오른쪽으론 2씩 곱하고, 아래쪽으론 1씩 곱하는 배열 프로그램
```java
public class Hello {

	public static void main(String[] args) {
		int row = 1;
		int column = 2;
		do {
			row = 1;
			do {
				System.out.printf("%d ", column * row);
				row++;
			} while (row <= 9);
			System.out.print("\n");
			column++;
		} while (column <= 9);

	}

}
```
- 예제 2
	- 키보드로 입력된 양의 정수 중에서 짝수만 덧셈해서 출력하는 프로그램. 단 , 입력된 정수가 양수가 아니면 입력 종료
```java
public class Hello {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = 0;
		int b = 0;
		do {
			System.out.print("양의 정수를 입력하세요");
			b = in.nextInt();
			if (b % 2 == 0)
				a = a + b;
		} while (b % 2 == 0);
		System.out.print("입력한 양의 정수중에서 짝수의 합은" + a);

	}

}
```

- 예제 3
	- 다섯자리 숫자를 입력받고, 각자리의 수가 짝수인지 홀수인지, 짝수의 갯수와 홀수의 갯수를 출력하는 프로그램

```java
public class Hello {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("5자리 숫자를 입력하세요");
		int answer_1 = 0;
		int answer_2 = 0;

		int a = in.nextInt();
		int num1 = a % 10;
		a -= num1;
		System.out.printf("1의 자리 :%d \n", num1);
		if (num1 % 2 == 0)
			answer_1 += 1;
		else
			answer_2 += 1;

		int num2 = (a % 100) / 10;
		a -= num2 * 10;
		System.out.printf("10의 자리 :%d\n", num2);
		if (num2 % 2 == 0)
			answer_1 += 1;
		else
			answer_2 += 1;
		int num3 = (a % 1000) / 100;
		a -= num3 * 100;
		System.out.printf("100의 자리 :%d\n", num3);
		if (num3 % 2 == 0)
			answer_1 += 1;
		else
			answer_2 += 1;
		int num4 = (a % 10000) / 1000;
		System.out.printf("1000의 자리 :%d\n", num4);
		if (num4 % 2 == 0)
			answer_1 += 1;
		else
			answer_2 += 1;
		a -= num4 * 1000;
		int num5 = a / 10000;
		System.out.printf("10000의 자리 :%d\n", num5);
		if (num5 % 2 == 0)
			answer_1 += 1;
		else
			answer_2 += 1;

		System.out.printf("짝수의 갯수 : %d\n", answer_1);
		System.out.printf("홀수의 갯수:%d", answer_2);

	}

}
```
### for문
```java
for(초기식; 조건식; 증감식){
반복 실행문;
}
```

- 초기식은 시작할때 한번만 실행
- 초기식 실행 후 조건식 평가

```java
for (int i = 1; i<5; i++)
	System.out.print(i); //1234
```
- 예제
	- 1부터 입력된 정수까지 합을 출력

```java
public class Hello {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력하세요");
		int a = in.nextInt();
		int answer = 0;
		for (int i = 1; i <= a; i++) {
			answer += i;
		}
		System.out.println(answer);

	}

}
```


- 예제 2
	- 오른쪽으론 2씩 곱하고, 아래쪽으론 1씩 곱하는 배열 프로그램

```java
public class Hello {

	public static void main(String[] args) {
		for (int column = 2; column <= 9; column++) {
			for (int row = 1; row <= 9; row++) {
				System.out.printf("%d ", column * row);

			}
			System.out.print("\n");
		}

	}

}
```
- 예제 3
![image](https://user-images.githubusercontent.com/73538957/114350876-c8c18680-9ba4-11eb-9eba-3af466e009a4.png) 출력하는 프로그램



```java
public class Hello {

	public static void main(String[] args) {
		for (int row = 1; row <= 5; row++) {
			for (int a = 1; a <= row; a++) {
				System.out.print("*");
			}
			System.out.print("\n");

		}
	}

}
```
- 초기식, 조건식, 증감식을 생략하면 무한반복문이 됨
```java
for (;;)
;
```
- 초기식이나 증감식이 2개 이상 필요하면 , 로 구분
```java
for (int i = 0, j = 10; i<j; , i ++, j++){
}
```

- 예제 4
	- 각 변의 길이가 20 이하이고 각 변의 길이가 정수인 직각 삼각형의 모든 변을 구하여라


```java
public class Hello {

	public static void main(String[] args) {
		for (int a = 1; a < 20; a++) {
			for (int b = 1; b < 20; b++) {
				for (int c = 1; b < 20; c++) {
					if (a * a + b * b == c * c) {
						System.out.printf("%d, %d, %d \n", a, b, c);
					}
				}
			}
		}
	}

}
```

- 예제 5
	- 단을 입력받아 구구단을 출력하는 프로그램





### switch문



### for문

### while문 

### do ~ while문

# 분기문

### break문

### continue문

