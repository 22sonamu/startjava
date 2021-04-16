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

### 생성자
- 클래스로 객체를 생성할 때는 필드를 초기화해야한다.
- 초기화하지 않는다면 기본값으로 초기화된 객체만 생성할 수 있다.
- 반환 타입은 없다.
- 오버로딩 할 수 있다.

```java
class 이름 = new class 이름(); <--생성자
```
- 예제 (생성자 정의)
```java
class Circle{
	private double radius;
	public Circle(double r){ //생성자
		radius = r;
	}
}

public class CircleDemo_{
	public static void main(String[] args){
		Circle mycircle = new Circle(10.0);
	}
}
```


- 예제 2
	- 원의 면적을 구하는 CircleConstructor 클래스 만들기


```java
class CircleConstructor {
	double pi = 3.14;
	double radius;
	double area;

	public CircleConstructor(double radius) {
		area = radius * radius * pi;
		System.out.println("원의 면적은" + area + "입니다.");

	}

}

public class Hello {

	public static void main(String[] args) {

		CircleConstructor circle = new CircleConstructor(100.0);
	}

}
```

- 예제 3
	- 삼각형을 나타내는 클래스 작성
		- 속성: 실숫값의 밑변과 높이(은닉)
		- 생성자 : 멤버변수에 인자 전달
		- 동작 : 넓이 구하기, 접근자

```java
class Triangle {
	private double alx;
	private double height;

	public void setalx(double d) {
		alx = d;
	}

	public double getalx() {
		return this.alx;
	}

	public void setheight(double d) {
		height = d;
	}

	public double getheight() {
		return this.height;
	}

	public Triangle(double a, double b) {
		this.alx = a;
		this.height = b;
	}

	public double findArea() {
		double answer = alx * height * 0.5;
		return answer;
	}
}

public class Hello {

	public static void main(String[] args) {

		Triangle t1 = new Triangle(10.0, 5.0);
		System.out.println(t1.findArea());
	}

}
```

- 오버로딩 예제
```java
class Circle{
	double radius;
	String color;
	public Circle(double r, String c){
		radius = r;
		color = c;
	}
	public Circle(double r){
		radius = r;
		color = "파랑";
	}
	public Circle(String c){
		radius = 10.0;
		color c;
	}
	public Circle(){
		radius = 10.0;
		color = c;
	}
}
```
	

### 매개변수 값 

- call by reference
	- 매개변수의 원래 주소에 값을 저장
	- 클랙스 객체를 인수로 전달했을 때 사용
- call by value
	- 매개변수의 값을 복사해서 처리
	
	
	
```java
class Number{
	int x;
	int y;
	
}
public class Hello {
	static void swap(Number z) {
		int temp = z.x;
		z.x = z.y;
		z.y = temp;
	}

	public static void main(String[] args) {

		Number n = new Number();
		n.x = 10;
		n.y = 20;
		System.out.println("swap()메소드 호출 전" + n.x + ","+n.y);//10,20
		swap(n);
		System.out.println("swap()메소드 호출 후"+ n.x+","+n.y);//20,10
	}

}
```

- 예제
	- 3개의 숫자를 입력받아 swap시키는 프로그램
```java
class Number {
	int a;
	int b;
	int c;

}

public class Hello {
	static void swap(Number n) {
		int start = n.a;
		n.a = n.c;
		n.c = n.b;
		n.b = start;

	}

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		Number n = new Number();
		n.a = a;
		n.b = b;
		n.c = c;
		System.out.println("전" + n.a + n.b + n.c);

		swap(n);
		System.out.println("후" + n.a + n.b + n.c);

	}

}
```
- 예제 2
	- 삼각형 넓이 비교하는 프로그램
```java
class Triangle {
	private double alx;
	private double height;

	public void setalx(double d) {
		alx = d;
	}

	public double getalx() {
		return this.alx;
	}

	public void setheight(double d) {
		height = d;
	}

	public double getheight() {
		return this.height;
	}

	public Triangle(double a, double b) {
		this.alx = a;
		this.height = b;
	}

	public double findArea() {
		double answer = alx * height * 0.5;
		return answer;
	}
}

public class Hello {
	
	static void isSameArea(Triangle t1, Triangle t2) {
		if (t1.findArea() == t2.findArea())
			System.out.println("같습니다.");
		else
			System.out.println("틀립니다.");
		
	}

	public static void main(String[] args) {

		Triangle t1 = new Triangle(10.0, 5.0);
		Triangle t2 = new Triangle(5.0, 10.0);
		isSameArea(t1, t2);
	}
		

}
```

- 예제 3
	- 길이 속성만 가진 직선을 모델링한 line클래스를 작성해라
```java
class Line {
	int l;

	String isSameLine(Line line) {
		if (this.l == line.l)
			return "맞습니다";
		else
			return "틀립니다.";
	}

	public Line(int a) {
		this.l = a;

	}
}

public class Hello {

	public static void main(String[] args) {
		Line a = new Line(1);
		Line b = new Line(1);
		System.out.println(a.isSameLine(b));

	}

}
```
