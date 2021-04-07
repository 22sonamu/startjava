# 변수

## 문자와 문자열

```java
public static void main(String[] args) {

		char a = 65;
		System.out.println(a); // A로 출력됨

		char c = '\u0041';
		System.out.println(c); // A로 출력됨 (유니코드 값)
		
		char c = "A"; //A는 문자가 아니라 문자열이라서 오류
		
		}
  ```
  
  ```java
  public static void main(String[] args) {

		char ga1 = '가';
		char ga2 = '\uac00';

		boolean cham = true;
		boolean geojit = false;

		System.out.println(ga1); //가
		System.out.println((int) ga1); //44032
		System.out.println(ga2); //가
		System.out.println(++ga2); //각
		System.out.println(cham + "가 아니면" + geojit + "입니다."); //true 가 아니면 false 입니다.

	}
  
```

## var 

- 자바 10부터 지원하는 예약어
- 초깃값을 통하여 데이터 타입 추론 가능



```java
public static void main(String[] args) {

		var number = 100;
		var korean = "한국";
		var oops; //오류, 이런식으로 안됨
	}
```	

## 상수

- 변경할 수 없는 데이터를 담는 함수
- 변수와 구분하기 위해 모두 대문자로 표기한다.
- 반드시 final로 지정

## 타입 변환

- 자동 타입 변환 (타입 범위가 넓은 방향으로 )
	- double>float>long>int>short,char>byte


```java
double d1 = 5 * 3.14;
double d2 = 1;
```

- 강제 타입 변환
```java
//double의 3.14를 float로 변환해 3.14F로 저장
float f = (float)3.14

// int의 300 dmf byte로 변환--> 데이터 손실 발생
byte b = (byte)300;

//double의 3.14를 byte로 형 변환 --> 데이터 손실, 3만 저장
byte x = (byte)3.14;

//float의 3.14를 double로 형 변환 --> 데이터 손실 없음
double d = (double)3.14f;


#### 예제
```java
int i ;
double d;
byte b;

i = 7/4;
System.out.println(i); //1 --> int형
d = 7/4;
System.out.println(d); // 1.0 --> double형
d = 7/(double)4; //1.75 // double로 몫을 담고, 두 숫자중 하나만 실수형이면 소숫점까지 나눌 수 있다.

i = 7/(double)4; //오류
```

#### 예제 2

- int를 바이트로 바꾸는 프로그램 만들기
```java
public static void main(String[] args) {
		byte b;
		
		int i = 300;
		if (i < Byte.MIN_VALUE || i >Byte.MAX_VALUE)
			System.out.println("바이트 타입으로 변환 할 수 없습니다.");
		else
			b = (byte)i;
	}
```
```
>>> 바이트 타입으로 변환할 수 없습니다.
```





