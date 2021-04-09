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

