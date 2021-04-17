# 문자열
- String 타입의 변수를 먼저 선언해야함

```java
String name1 = "문자열";
String s1 = "안녕 자바";
String s1 = new String("안녕 자바") //위와 다른 변수이다.
```


- 문자열의 비교
  - 비교문자 사용불가
  
![image](https://user-images.githubusercontent.com/73538957/115054922-c8feb080-9f1b-11eb-809c-696f588936ea.png)

- 예제 
  - 객체 파일에서 만들었던 Car class를 Red=red로 인식하도록 수정하시오
```java
class Car {
	static int number = 0;
	static int rednumber = 0;
	String color;

	public Car(String s) {
		this.color = s;
		number += 1;
		if (s.equals("red") | (s.equalsIgnoreCase("Red") == true))
			rednumber += 1;
	}

	static int getNumOfCar() {
		return number;
	}

	static int getNumOfRedCar() {
		return rednumber;
	}
}

public class Hello {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		Car c2 = new Car("blue");
		Car c3 = new Car("Red");
		System.out.printf("자동차 수: %d, 빨간색 자동차 수: %d", Car.getNumOfCar(), Car.getNumOfRedCar());

	}

}
```

- 문자열 조작
![image](https://user-images.githubusercontent.com/73538957/115055289-3ca0bd80-9f1c-11eb-9cac-db8754426257.png)


- 예제 
  - 문자열과 문자를 매개변수로 가지는 메서드
  - 문자열에 포함된 특정 문자의 갯수를 반환하는 메서드

```java
public class Hello {

	public static void main(String[] args) {
		int a = CountChar("hello", 'o');
		System.out.println(a);
	}

	static int CountChar(String s, char c) {
		int num = 0;
		int long1 = s.length();
		for (int i = 0; i <= (long1 - 1); i++) {
			if (s.charAt(i) == c)
				num += 1;

		}
		return num;
	}

}
```
- String클래스에서 제공하는 정적 메서드
![image](https://user-images.githubusercontent.com/73538957/115057127-a28e4480-9f1e-11eb-959d-d5ef564e550f.png)

- 예제
  - url을 입력받은 후 'com'으로 끝나는지, 'java'를 포함하는지 조사하는 프로그램
  - 'bye'를 입력하면 프로그램 종료


```java
public class Hello {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("url을 입력하세요");
		String s = in.next();
		int howlong = s.length();
		if (s != "bye") {
			boolean a = s.contains("java");
			if (a == true)
				System.out.println("자바 포함");
			boolean b = s.endsWith("com");
			if (b == true)
				System.out.println("com으로 끝남");
		}

	}

}
```
# StringBuffer

- String과 달리 객체 생성 후 String값 변경 가능
- append 와 insert 메소드를 통해 조작
![image](https://user-images.githubusercontent.com/73538957/115058066-ca31dc80-9f1f-11eb-8804-6b3c2c9ce52f.png)


```java
StringBuffer sb = new StringBuffer("java");
```

- 주요 메소드
![image](https://user-images.githubusercontent.com/73538957/115058124-d87ff880-9f1f-11eb-989f-8a2fdec3c002.png)

- 예제
  - 입력받은 단어의 문자 수를 카운트해 -형태로 표현하는 프로그램

```java
public class Hello {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("단어 입력");
		String s = in.next();

		int length = s.length();

		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s.length(); i++)
			sb.append("-");

		System.out.printf("단어 (" + length + "글자):" + sb);

	}

}

```
- 예제 2
  - 단어 맞추기 프로그램
```java
public class Hello {

	public static void main(String[] args) {

		String hiddenString = "hello";
		StringBuffer outputString = new StringBuffer();
		Scanner scan = new Scanner(System.in);
		String user;
		for (int i = 0; i<hiddenString.length(); i++)
			outputString.append("-");
		System.out.println("\n 단어("+hiddenString.length()+"글자" + "):"+outputString);
		System.out.println("l 문자를 입력하세요");
		user = scan.next();
		char ch = user.charAt(0);
		for (int i = 0;i<hiddenString.length(); i++) {
			if (hiddenString.charAt(i) == ch) {
				outputString.setCharAt(i, ch);
				System.out.println("\n단어:"+outputString);
			}
		}
	}

}
```




