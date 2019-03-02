# 안드로이드 Basic
## 1. 프로젝트 생성
### 1) 생성방법
1. Start a new Android Studio Project 클릭

2. Application Name 과 Company Domain 부분 작성
![default](https://user-images.githubusercontent.com/25294147/53683682-0eb18c80-3d47-11e9-9155-d9bb7a038b25.PNG)

- 하단에 Include C++ Support 혹은 Include Kotlin Support 체크시 해당 프로젝트에서 사용가능함
<br>

3. Minimum SDK 레벨 설정
- 애플리케이션이 지원하는 가장 낮은 API 레벨을 의미한다.
  ex. API 24 이전에는 지문인식 기능을 지원하는 API가 없지만 24 이후에는 지원됨
 
- 무조건 API 레벨을 올리거나 무조건 낮게 잡는 것은 좋지 않다.
  + API 레벨을 높이는 경우에는 지원할 수 있는 기기의 수가 줄어들 수 있기 때문이다.
  + 앱의 핵심기능을 사용할 수 없는 경우가 발생하기 때문이다.

![default](https://user-images.githubusercontent.com/25294147/53683765-ed9d6b80-3d47-11e9-97d1-08f264fae000.PNG)
<br>

4. Activity 템플릿 결정
- 안드로이드에서의 Activity란?
  + 사용자와 상호 작용하는 가장 기본적인 요소
  + UI 라는 이름의 View를 가지고 있으며 안드로이드 애플리케이션에서 사용자에게 보여지는 화면을 의미한다.

![default](https://user-images.githubusercontent.com/25294147/53683787-453bd700-3d48-11e9-8dbb-c703c3c8888b.PNG)

- 새로 만들어 보는 것이기 때문에 Empty Activity를 클릭한다.
<br>

5. Activity 와 Layout 이름 지정
- Generate Layout File 및 Backwards Compability 항목은 기본적으로 체크되어 있다.

![default](https://user-images.githubusercontent.com/25294147/53683819-a663aa80-3d48-11e9-9bea-b1ccf4d15eea.PNG)
<br><br>

### 2) 실행하기
- 생성하게되면 다음과 같은 화면이 나타난다.

![default](https://user-images.githubusercontent.com/25294147/53683832-f9d5f880-3d48-11e9-9aba-1d611b9c11d8.PNG)
<br>

- 화면의 우측 상단에 보면 Run 버튼이 있을 것이다. 
- 클릭을 하게 되면 다음과 같은 창이 보일것이다.
  + 설정을 마친 상황이기에 스크린샷과 다를 수 있다.
  + 기본적으로는 Available Virtual Device 에 아무런 기기도 검색되지 않을 것이다.
  + 아래의 Create New Virtual Machine 을 클릭하자

![default](https://user-images.githubusercontent.com/25294147/53683876-97c9c300-3d49-11e9-89c4-1fdcaeb9c78b.PNG)
<br>

- 클릭하게되면 아래와 같이 가상 머신을 설정하는 창이 나올것이다.
- 이번 예제에서는 Nexus 5X 머신을 사용할 것이므로 체크 후 Next를 클릭한다.

![default](https://user-images.githubusercontent.com/25294147/53683894-d3648d00-3d49-11e9-9992-ebd9b4235a00.PNG)
<br>

- 다음으로는 안드로이드 시스템 설정에 관한 페이지가 나온다.
  + 현재 최신 OS인 Pie 까지 지원가능하다.
  + 이번 예제에서는 최신 버전인 Pie를 사용하므로 체크 후 Next를 클릭한다.

![default](https://user-images.githubusercontent.com/25294147/53683917-19215580-3d4a-11e9-82ed-3d72232a9999.PNG)
<br>

- 마지막으로 설정 내용에 대한 요약본을 보여준다.

![default](https://user-images.githubusercontent.com/25294147/53683927-466e0380-3d4a-11e9-80c7-6173e9c2969b.PNG)
<br>

- 설정이 완료되면 한 번 실행시켜보자
- 정상적으로 동작한다면 아래와 같은 가상머신이 실행될 것이다.

![default](https://user-images.githubusercontent.com/25294147/53683965-b086a880-3d4a-11e9-8996-b6fa8865fedb.PNG)
<br>


## 2. 프로젝트 구조


