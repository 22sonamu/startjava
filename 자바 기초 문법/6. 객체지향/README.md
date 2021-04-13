# 클래스 

- 상태 : 필드 , 동작 : 메서드로 정의해서 클래스로 선언
```java
class 클래스 이름{
  //필드 --> 객체의 속성
  //메서드 --> 객체의 동작
}
```


```java
public class Ball {
  double = 2.0;
  double getVolume(){
    return 4/3 * 3.14 * radius * radius * radius;
  }
}
```

### 객체 생성

```java
Ball ball1 = new Ball ();
System.out.println(ball1.getVolume());
```

- 예제
  - 사각형의 면적을 구하는 class 작성
  
Hello.java
```java
public class Hello {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle();
		System.out.println("사각형의 면적은 :" + rec.calc_area()); 

	}

}
```

Retangle.java
```java
public class Rectangle {

	int width = 10;
	int length = 50;

	int calc_area() {
		return width * length;
	}

}
```


### public class

- public class
  - 파일당 하나만 선언할 수 있다.
  - 파일명과 클래스명이 같아야 한다.
- class
  - 여러개 선언가능

```java
public class Hello {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle();
		System.out.println("사각형의 면적은 :" + rec.calc_area());

	}

}

class Rectangle {

	int width = 10;
	int length = 50;

	int calc_area() {
		return width * length;
	}
}
```

