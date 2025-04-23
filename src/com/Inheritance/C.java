package com.Inheritance;
/*상속을 배운 개발자면
* A 클래스에 속성과 상태를
* 물려받을수 있다
* 부모클래스가  A가 되고 C 클래스가 자식이 된다
* 자바에서는 단일상속만을 지원한다 (단하나만에 부모)
* 부모는 여러명에게 나눠줄수있음*/
public class C extends A {
    //extends A
    //여기 코드에는 보이지 않지만 자동으로 A에 선언된
    //필드를 물려받는다

    int level;
    String nickName;

}
