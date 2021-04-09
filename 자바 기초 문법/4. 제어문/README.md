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











  
### switch문

# 반복문

### for문

### while문 

### do ~ while문

# 분기문

### break문

### continue문

