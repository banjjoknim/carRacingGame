# 자동차 경주 게임

### 구현할 기능 목록

1. 자동차
    - 생성
    - 이름 부여
    - 이름 부여된 자동차들의 위치 초기화
    - 전진
    - 정지
    - 랜덤한 숫자 생성
    
2. 행동조건 체크
    - 자동차 전진 조건 만족 여부 판단
    - 자동차 정지 조건 만족 여부 판단
    
3. 입력
    - 자동차 이름 입력
    - 자동차 이동 횟수 입력

4. 출력
    - 전진하는 자동차 출력
    - 자동차 이름 출력
    - 게임을 완료한 후 우승자 출력

5. 제한사항 체크
    - 쉼표(,)를 기준으로 한 이름 구분
    - 이름의 5자리 이하 여부 판단
    - 우승 여부 판단

---

### 피드백 및 개선사항

- MVC 구조에 대해서 좀 더 숙지하도록 하여 `모델`, `뷰`, `컨트롤러`의 역할을 명확히 구분짓도록 하자.
- 상황에 따른 효율적인 static 의 사용도 고려하도록 하자.
- 일급 컬렉션을 적절하게 고려하여 사용할 수 있도록 하며 그 명명에 대해서도 명확하게 객체를 드러낼 수 있도록 고민하도록 하자.
- 객체 생성시 예외처리를 할 수 있다면 보다 안전한 객체를 만들 수 있고, 불필요한 객체의 생성을 방지할 수 있다. 또, 예외의 원인도 명확하게 규명하기 용이하다.
- 새로운 객체를 고려하고 있다면, 객체의 상태값에 대해서 고민해보자. 상태를 가지지 않았다면 굳이 객체로 선언할 필요가 있는지 고민해보자.
- 객체를 생성할때 예외처리도 중요하지만 원하는 상태로 객체가 초기화되는 것도 중요하다.
- 메소드명과 파라미터 모두 메소드의 의도를 드러낼 수 있도록 이름을 정하자.
- 객체의 불변성을 보장하기 위해 방어적 복사를 사용할 수 있도록 하자. 그리고 얕은 복사와 깊은 복사에 대해서 이해하도록 하자.
- 각각의 객체가 가지는 책임과 역할에 대해 고민해보고 보다 명확하게 구분짓도록 하자.
- 객체 내부의 상태값은 객체 스스로에 의해서만 다뤄질 수 있도록 설계하도록 하자.
- 메소드의 접근제한자를 알맞게 지정하도록 유념하자.
- 예외로 발생할 수 있는 상황들에 대해서 좀 더 다양한 측면으로 고민하도록 하자.
- 객체지향적인 관점에서 자율적인 객체의 의미란, 객체가 스스로의 행동을 자율적으로 결정한다는 것이다. 그렇기 때문에 객체에게 `메시지`를 전달한다는 것을 반드시 유념하도록 하자!!
- 단일 책임 원칙(Single Response Principle)을 지킬 수 있도록 유념하고 노력하자.
- 모델과 뷰의 역할을 명확하게 나눴다면 추후에 확장이 용이하도록 각각의 메소드를 설계하자.
- 불변객체의 이점에 대해 숙지하고 가능한 그 이점을 활용할 수 있도록 노력하자.
- 가능하다면 전통적인 `for문` 보다는 `for-each`(향상된 for문)을 사용하도록 하자. 가독성은 높이고 실수의 여지는 줄일 수 있다.
- 테스트 코드의 작성시 `assertJ`의 다양한 API들을 활용하여 효율적이고 가독성이 높은 코드를 작성할 수 있도록 노력하자.(assertThatThrownBy 등등)
- 코드를 작성할 때, 흐름에 맡게 변수를 선언하여 가독성을 높일 수 있도록 하자.
- 메소드를 활용하여 가독성을 높이도록 노력하자.
- 메소드의 구조를 따질때, `public`이 상단으로 올라가고 그 아래로 종속되는 `private` 메소드를 위치시키는 것이 일반적이고 가독성도 좋다.
- 테스트코드와 실제 메인 로직을 실행해서 확인해보는 습관을 들이도록 하자.
- 메소드 레퍼런스를 통해 가독성을 높이도록 노력하자.
- 추상화를 통해서 객체를 고려하는 시도를 해보도록 노력하자.
- 예외처리를 한다면 명확하게 어떤 예외인지 드러날 수 있게 하자. 그래서 목적을 분명하게 드러내자.
- 상수명 또한 통일성을 가지는 것이 좋다. 이리저리 뻗쳐있는 상수명은 보는 이로 하여금 혼란을 야기할 수 있다.
- 자바 코드 컨벤션에 대해 좀 더 숙지하도록 하자.
- 불필요한 메소드 호출을 줄이려고 노력하자.
- 객체의 생성과 초기화는 같이 이루어진다. 그렇기에 테스트 또한 같이 진행하는 것이 효율적이다.
- 객체를 테스트할때, 객체의 모든 상태값을 테스트하도록 하자. 일부만 테스트하는 것은 완전한 테스트라고 할 수 없다.
- 전략패턴을 이용하면 내부 구현을 수정하는 일 없이 행위를 변경 할 수 있다.
- 의미없는 들여쓰기는 제거하는 것이 좋다. 반대로 코드의 마지막은 한줄 띄우는게 좋다.
- 객체를 불변 객체로 만들면 많은 이점이 생긴다. 따라서 가능하면 불변 객체를 만드는 것이 좋다.
- 변수를 생성하는 시점과 사용하는 시점을 최대한 가깝게 붙여주면 가독성이 좋아지는 효과가 있으므로 유념하도록 하자.
- PR 전에는 꼭 마지막으로 테스트 코드와 실제 메인 로직을 실행해서 확인해보는 습관을 들이자.
- 추상화를 통해 객체의 존재 여부를 고민해보자.
- 객체의 생성 시점에 예외 처리를 하게 되면 잘못된 입력으로 인한 객체의 생성을 방지할 수 있고 이러한 구조로 일관성 있게 예외 처리를 한다면, 예외처리를 어디서 어떻게 진행해야 하는지 명확해지고 위치 또한 판단하기 쉬워질 것이다. `try-catch` 구조로 예외처리를 하자.
- `자바 코드 컨벤션`에 따르면 상수와 상태값은 한칸 띄워서 구분해주는 것으로 되어있다.
- 파라미터로 값을 받음으로써 의존성을 약화시키고 명확한 테스트 코드를 작성하기가 수월해질 수 있다.


### 추가 피드백

- 기능 목록은 구현해야할 기능들을 정리하는데 집중해서 작성하도록하며, 예외적인 상황도 고려하여 기능 목록에 정리하도록 하자.
- 문자열, 숫자등의 값을 하드코딩하지 말자. 상수를 만들고 이름을 부여해 역할과 의도를 드러내도록 하자. (`java 상수`와 같은 키워드로 검색해 상수 구현 방법을 학습하고 적용해보자)
- 의도를 드러낼 수 있다면 이름이 길어져도 괜찮다. 축약해서 모호해지는 것보다 길더라도 명확하게 의도를 드러내는 것이 좋다.
- `java api`를 적극적으로 활용하려고 하자. 코드의 작성을 쉽게 만들어줄뿐 아니라 가독성도 훨씬 좋게 해줄 것이다.
- 데이터의 조작이 어려운 배열 대신 `java collection(List, Set, Map 등)`을 사용하자. 그렇게하면 다양한 api를 사용할 수 있다.
- 상태를 가지는 객체에서 데이터를 꺼내려(get) 하지말고 객체에 메시지를 보내자. 객체는 자율적으로 행동을 결정하는 존재이다.
- 필드(인스턴스 변수)의 수를 최소화하도록 노력하자. 필드가 많아지면 객체의 복잡도가 높아지고 버그 발생의 가능성이 높아지게 만든다.
- 비즈니스 로직과 UI로직을 한 클래스가 담당하지 않도록 분리하자. 단일 책임의 원칙에도 위배된다.
- `View`에서 사용할 데이터라면 `getter` 메소드를 통해 데이터를 전달하자.
- '.gitignore'를 통해 `git`으로 관리할 자원에 대해서도 고려하자.

### 참고자료
- [좋은 코드를 위한 자바 메서드 네이밍](https://woowacourse.github.io/javable/2020-04-26/Method-Naming)
- [MVC 패턴](https://velog.io/@ljinsk3/Concept-MVC-Pattern)
- [자바 코딩 규칙](https://myeonguni.tistory.com/1596)
- [자바 리팩토링 - 매직 넘버의 치환(상수로의)](https://hoonmaro.tistory.com/44)
- [Avoid Null Pointer Exception in java](https://www.javacodegeeks.com/2012/06/avoid-null-pointer-exception-in-java.html)
- [equal 제대로 사용하기](https://zzikjh.tistory.com/entry/java-equal-%EC%A0%9C%EB%8C%80%EB%A1%9C-%EC%82%AC%EC%9A%A9%ED%95%98%EA%B8%B0)
- [Git Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153)
- [Private 메소드는 테스트가 필요한가? 그렇다면 어떻게 해야할까?](https://www.slipp.net/questions/253)
- [랜덤 요소가 들어간 로직의 테스트는 어떻게 해야할까?](https://www.slipp.net/questions/186)
- [일급 컬렉션 (First Class Collection)의 소개와 써야할 이유](https://jojoldu.tistory.com/412)
- [java static의 의미와 사용법](https://coding-factory.tistory.com/524)
- [static 메소드의 적절한 사용시기는 언제일까?](https://www.slipp.net/questions/58)
- [테스트코드 객체 값 비교 예쁘게 하기](https://www.podo-dev.com/blogs/232)
- [아이템 72 - 표준 예외를 사용하라](https://rok93.tistory.com/entry/%EC%95%84%EC%9D%B4%ED%85%9C72-%ED%91%9C%EC%A4%80-%EC%98%88%EC%99%B8%EB%A5%BC-%EC%82%AC%EC%9A%A9%ED%95%98%EB%9D%BC)
- [방어적 복사(defensive copy)](https://johngrib.github.io/wiki/defensive-copy.md/)
- [AssertJ 필수 부분 정리](https://pjh3749.tistory.com/241)
- [아이템 17 - 변경 가능성을 최소화하라](https://rok93.tistory.com/entry/%EC%95%84%EC%9D%B4%ED%85%9C-17-%EB%B3%80%EA%B2%BD-%EA%B0%80%EB%8A%A5%EC%84%B1%EC%9D%84-%EC%B5%9C%EC%86%8C%ED%99%94%ED%95%98%EB%9D%BC)
- [아이템 58. 전통적인 for 문보다는 for-each 문을 사용하라](https://madplay.github.io/post/prefer-foreach-loops-to-traditional-for-loops)
- [java 데이터 타입의 분류(기본, 참조타입)와 메모리 영역](https://kingpodo.tistory.com/54)
- [얕은 복사(Shallow Copy)와 깊은 복사(Deep Copy)란?](https://gwbb.tistory.com/16)
- [불변객체란?](https://brainbackdoor.tistory.com/141)
- [Java 디자인패턴 - 전략(Strategy) 패턴](https://niceman.tistory.com/133)
- [How do I keep a Scanner from throwing exceptions when the wrong type is entered?](https://stackoverflow.com/questions/2496239/how-do-i-keep-a-scanner-from-throwing-exceptions-when-the-wrong-type-is-entered)



















