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
![image](https://user-images.githubusercontent.com/73538957/114399302-bca4eb80-9bdb-11eb-9aba-41fb4ad4ab91.png)

# 메서드 오버로딩

- 메서드 이름은 같지만 시그니처가 다른 메서드를 정의하는 것
	- 메서드 시그니처 
		- 메서드 이름, 매개변수의 개수, 매개변수의 타입과 순서를 의미
```java
public class Main{
    public static void main(String[] args){
        int i1 = 3, i2 = 7, i3 = 10;
        
        double d1 = 7.0, d2 = 3.0;
        System.out.printf("max(%d, %d) = %d\n", i1, i2, max(i1, i2));
        System.out.printf("max(%.1f, %.1f) = %.1f\n", d1, d2, max(d1, d2));
	    System.out.printf("max(%d, %d, %d) = %d\n", i1, i2,i3, max(i1, i2, i3));
    }
    
    
    public static int max(int n1, int n2){
        int result = n1 > n2 ? n1: n2;
        return result;
    }
    public static double max(double n1, double n2){
        double result = n1>n2 ? n1 : n2;
        return result;
    }
    public static int max(int n1, int n2, int n3){
        return max(max(n1, n2), n3);
    }
    
    
}
```

### 값 전달

```java
public class Main{
    public static void main(String[] args){
        int x = 0;
        System.out.println("increment 메서드를 호출하기 전의 x는 " + x); //0
        increment(x);
        System.out.println("increment 메서드를 호출한 후의 x는 " + x); //1
        
    }
    
    public static void increment(int n){
        System.out.println("increment 메서드를 호출하기 전의 n는 " + n); //0
        n++;
        System.out.println("increment 메서드를 호출하기 전의 n는 " + n); //1
    }
    
    
    
}
     
```




