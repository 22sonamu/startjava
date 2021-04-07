# 화면에 데이터 출력

```java
println() //내용 출력 후 행을 바꾼다.
print() //내용만 출력하고 행은 바꾸지 않는다.
printf() //포맷을 지정해서 출력한다.
```

## printf
- 예제
```java
int x = 5;
double pi = 3.14;
System.out.printf("x = %d and pi = %f \n", x, pi);
```
  - %다음에 -가 있으면 왼쪽 정렬
  - %다음에 숫자 있으면 출력될 자리수 지정
  - %a.b
    - a는 출력될 전체 자리 수(소수점 이하 포함),b는 소수점 이하 자리수
    - 출력할 내용이 자리수 보다 작으면 공백으로 채움
    - % 다음에 0이 있으면 0으로 채움

![image](https://user-images.githubusercontent.com/73538957/113899834-2900a300-9808-11eb-946e-ebd1e9ce5dac.png)

- 예제 2
```java
int i = 97;
System.out.printf("%o", i); //141
System.out.printf("%x, i); //61
System.out.printf("%c", i); //a
System.out.printf("%5d", i); //   97
System.out.printf("%05d", i);//00097
String s = "Java";
System.out.printf("%5s", s);// Java
System.out.printf("%-5s", s);//Java
double f = 3.14f;
System.out.printf("%e", f); //3.14000e+00 -->지수표기법
System.out.printf("%4.1", f); //  3.1
System.out.printf("%04.1f", f); // 03.1 --> 알아보기
System.out.printf("%-4.1f", f); //3.1
```

# 키보드로 입력

1. Scanner 클래스의 경로 이름을 컴파일러에 알린다.
```java
import java.util.Scanner;
```
2. Scanner 객체 생성
```java
Scanner in = new Scanner(System.in);
```

3. 데이터 입력 받기
```java
int x = in.nextInt();
```
![image](https://user-images.githubusercontent.com/73538957/113904794-6b78ae80-980d-11eb-901d-9f5592ec1a54.png)

- 예제
   - 두개의 수를 입력받아 곱셈해주는 프로그램 만들기
```java
Scanner in = new Scanner(System.in);
int x = in.nextInt();
int y = in.nextInt();
System.out.printf("%d * %d 는 %d입니다. " , x, y, x*y);
```

- 예제 2
  - 원기둥의 밑면의 반지름, 높이를 입력하면 부피를 구해주는 프로그램 만들기
```java
Scanner in = new Scanner(System.in);
System.out.println("원기둥 밑면의 반지름은?");
int radius = in.nextInt();
        
System.out.println("원기둥의 높이는?");
int height = in.nextInt();
        
System.out.println("원기둥의 부피는 "+ radius * radius * 3.14 * height);
```

