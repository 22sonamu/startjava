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

### 기초타입과 참조타입

- 예제 
	- 다음 코드를 사용해 실행할 수 있는 클래스를 만드시오
```java
public class Hello {

	
	public static void main(String[] args) {
		
		Phone myphone = new Phone();
		myphone.model = "갤럭시 s8";
		myphone.value = 100;
		myphone.print();
		
		
		Phone yourphone = new Phone();
		yourphone.model = "G6";
		yourphone.value = 85;
		yourphone.print();
	
		
	}
		
}
```

- 답
```java
class Phone{
	String model = "";
	int value = 0;
	
	void print() {
		System.out.printf("%d 만원 짜리 %s 스마트폰", model, value);
	}
}
```

### 필드와 지역변수

- 필드
	- 기본값O
	- 클래스 전체에서 사용 가능
- 지역변수
	- 기본값X(초기화 필요)
	- final 로 지정
	- 선언된 블록 내부의 선언된 후에서만 사용 가능

```java
int a= 0;
double b;

System.out.println(a+c); -->오류(지역변수)
```


### 멤버 접근

- 클래스 안
	- 필드 : 필드이름 or this.필드이름
	- 메서드 : 메서드이름 or this.메서드이름

- 클래스 밖
	- 필드 : 클래스이름.필드이름
	- 메서드 : 클래스이름.메서드이름()
	
	
- 예제
	- 클래스 MyExp -> 지수 계산해주는 클래스
	- 정수값을 리턴하는 getValue()라는 멤버 메소드를 포함하는 클래스
```java
class MyExp{
    int base = 0;
    int exp = 0;
    
    int getValue(){
        int answer = 1;
        for(int i = 0; i<exp; i++)
            answer *= base;
        return answer;
            
        }
    void print(){
        System.out.printf("%d의 %d승 = %d", this.base, this.exp, this.getValue());
    }
}


public class Main{
    public static void main(String[] args){
        MyExp number1 = new MyExp();
        number1.base = 2;
        number1.exp = 3;
        number1.print();
        
        
        
        
    }
    
}
```
### 캡슐화
- 클래스 멤버를 클래스 내부에 감추는 것
- private로 지정
- 외부에서 사용할땐 접근자와 설정자가 필요함
	- 접근자 : private로 지정된 필드에 값을 반환 (일반적으로 get사용)
	- 설정자 : private로 지정된 필드의 값을 변경 (일반적으로 set사용)
```java
class Circle {
    private double radius;
    public double getRadius(){
        return radius;
    }
    public void setRadius(double r){
        this.radius = r;
    }
    double findArea(){
        return 3.14 * radius * radius;
    }
    void show(double x, double y){
        System.out.prinf("반지름 = %.1f, 넓이 = %.1f\n", x, y);
    }
}


public class Main{
    public static void main(String[] args){
        Circle myCircle = new Circle();
        myCircle.setRadius(10.0);
        myCircle.show(myCircle.getRadius(), myCircle.findArea());      
        
    }
    
}
   
```

- 예제
	- 앞서 실습한 Phone class의 멤버를 은닉하고 동일한 결과가 나오도록 phone class 변경
```java
class Phone {
	private String model;
	private int value;

	public String getmodel() {
		return model;
	}

	public void setmodel(String s) {
		this.model = s;
	}

	public int getvalue() {
		return value;

	}

	public void setvalue(int i) {
		this.value = i;
	}

	void print() {
		System.out.println(value + "만원 짜리 " + model + "스마트폰");

	}
}

public class Hello {

	public static void main(String[] args) {
		Phone myphone = new Phone();
		myphone.setmodel("갤럭시 s8");
		myphone.setvalue(100);
		myphone.print();
	}

}
```
