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
