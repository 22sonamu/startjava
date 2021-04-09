# 종류
![image](https://user-images.githubusercontent.com/73538957/114130216-091dcc00-993b-11eb-8469-ad8646bfee0f.png)

### 예제 1

```java
int value = 1;
value  += 1; //value 2
value -= 1; //value 1
value <<= 3; //value 8
value %= 3; //vlaue 2
```

### 예제 1

- 키보드로부터 0-999사이의 정수를 입력받아 각 자리수를 더한 결과 출력하기

```java
int a = 0;
int b = 0;
int c = 0;
System.out.print("0-999사이의 숫자를 입력하세요 :");
Scanner in = new Scanner(System.in);
int i = in.nextInt();
if (i / 100 != 0)

	a = i / 100;

if (i / 10 != 0)
	b = (i - a * 100) / 10;
if (i != 0)
	c = (i - a * 100 - b * 10);
System.out.printf("각 자리수의 합 = %d", a + b + c);
```
### 예제 3

```java
int pluOne = 1;
int minusOne = -plusOne; //miusOne = -1

int x = 1, y = 1;
System.out.println("x = " + x ", ++x = " + ++x); //x = 1, ++x = 2
System.out.println("y = " + y ", y ++ = " + y++); //y = 1, y++
System.out.println("x = " + x + ", y= " + y);// x = 2, y = 2
```

# 조건 연산자

```
조건식 ? 연산식 1 : 연산식 2
```
- 조건식에 따라 연산식 1과 연산식 2중 하나만 실행한다.

### 예제 1

```java
int x= 1;
int y;
y = (x == 1)? 10: 20;
System.out.println(y) //10
y (x>1)? x++ : x+ 20;
System.out.println(x); //1
System.out.println(y); //21
```

### 예제 2

- 졸업하려면 최소 140학점을 이수해야하는 대학이 있다. 이수한 학점 중 전공은 70학점, 교양과 일반은 30학점 이상이거나 두 영역이 80학점 이상이여야 한다. 이수한 세개의 학점을 각각 키보드로 입력받아 졸업 여부를 출력하시오

```java
public class Hello {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		int b;
		int c;
		System.out.print("전공 이수 학점 :");
		a = in.nextInt();
		System.out.print("교양 이수 학점 :");
		b = in.nextInt();
		System.out.print("일반 이수 학점:");
		c = in.nextInt();
		if (a + b + c < 140)
			System.out.println("졸업 불가");
		else if (a < 70)
			System.out.println("졸업 불가");
		else if (b < 30 || c < 30)
			if (b + c < 80)
				System.out.println("졸업 불가");
			else
				System.out.println("졸업 가능");
		else
			System.out.println("졸업 가능");

	}

}

```

### 산술 연산자 사용시 주의할 점

- % 연산자는 정수 타입만 사용한다.

### 예제

```java
int remainder = 25 % 2;
System.out.println(remander); //1
int a = 10%2;

if(a == 0)
	System.out.println("10은 짝수입니다.");
else
	System.out.println("10은 홀수입니다.");

```


### 예제 2

- 정수를 입력하면 짝수인지 홀수인지 알려주는 프로그램

```java
public class Hello {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("정수를 입력해주세요");
		a = in.nextInt();

		if (a % 2 == 0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");

	}

}
```


### 예제 3

- 초를 입력하면 시간, 분 , 초로 환산해 출력하는 프로그램
```java
public class Hello {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요");
		a = in.nextInt();

		int hour = a / 3600;
		a = a % 3600;
		int minute = a / 60;
		a = a % 60;
		System.out.printf("%d 시간 %d 분 %d초 입니다.", hour, minute, a);

	}

}
```

### 예제 3
- 어떤수가 4와 5로 나누어지는지, 혹은 하나로는 나누어지지만 두 수 모두로는 나누어지지 않는지 출력하는 프로그램


```java
public class Hello {

	public static void main(String[] args) {
		int a;
		Scanner in = new Scanner(System.in);
		System.out.print("정수 입력");
		a = in.nextInt();
		boolean answer1 = false;
		boolean answer2 = false;
		boolean answer3 = false;
		if (a % 4 == 0)
			answer1 = true;
		if (a % 5 == 0)
			answer2 = true;
		if (a % 5 == 0 && a % 4 == 0)
			answer3 = true;
		System.out.println("4로 나누어진다 : " + answer1);
		System.out.println("5로 나누어진다 : " + answer2);
		System.out.println("4와 5로 나누어진다 : " + answer3);

	}

}
```

