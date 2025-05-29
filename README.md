# Barcode-128 생성기

Java를 사용하여 Code-128 형식의 바코드를 생성하는 프로그램입니다.

## 🚀 기능

- **Code-128 바코드 생성**: 사용자가 입력한 텍스트를 Code-128 형식의 바코드로 변환
- **PNG 이미지 저장**: 생성된 바코드를 PNG 형식으로 저장
- **사용자 친화적 인터페이스**: 콘솔을 통한 간단한 데이터 입력

## 📁 프로젝트 구조

```
QRcode/
├── Main.java              # 메인 실행 클래스
├── BarcodeHandler.java     # 바코드 생성 처리 클래스
├── core-3.5.3.jar         # ZXing 핵심 라이브러리
├── javase-3.5.3.jar       # ZXing Java SE 라이브러리
├── data/                   # 생성된 바코드 저장 폴더
│   └── barcode128.png      # 생성된 바코드 이미지
└── README.md              # 프로젝트 설명서
```

## 🛠️ 필요 조건

- **Java Development Kit (JDK)**: 8 이상
- **ZXing 라이브러리**: 3.5.3 버전 (포함됨)
  - `core-3.5.3.jar`
  - `javase-3.5.3.jar`

## ⚡ 설치 및 실행

### 1. 컴파일

```bash
javac -cp "core-3.5.3.jar;javase-3.5.3.jar;." *.java
```

### 2. 실행

```bash
java -cp "core-3.5.3.jar;javase-3.5.3.jar;." Main
```

### 3. 사용법

1. 프로그램을 실행하면 데이터 입력 프롬프트가 나타납니다
2. 바코드로 변환할 텍스트를 입력합니다
3. 바코드가 `./data/barcode128.png` 파일로 저장됩니다

## 📝 사용 예시

```
$ java -cp "core-3.5.3.jar;javase-3.5.3.jar;." Main
Barcode-128용 Data 입력 : Hello World
입력된 데이터: Hello World
저장 경로: ./data/barcode128.png
바코드가 생성되었습니다: ./data/barcode128.png
```

## 🔧 주요 클래스

### Main.java
- 프로그램의 진입점
- 사용자 입력 처리
- BarcodeHandler 인스턴스 생성 및 호출

### BarcodeHandler.java
- 바코드 생성 로직 담당
- ZXing 라이브러리를 사용한 Code-128 바코드 생성
- PNG 이미지 파일로 저장

## 📊 바코드 사양

- **형식**: Code-128
- **크기**: 600 x 300 픽셀
- **출력 형식**: PNG
- **저장 위치**: `./data/barcode128.png`

## 🔍 Code-128이란?

Code-128은 고밀도의 선형 바코드 심볼로지입니다:
- ASCII 128문자 전체를 인코딩 가능
- 높은 데이터 밀도
- 체크섬 내장으로 높은 신뢰성
- 물류, 재고관리 등에서 널리 사용

## 🐛 문제 해결

### 컴파일 오류
- ZXing 라이브러리가 classpath에 포함되어 있는지 확인
- Java 버전이 8 이상인지 확인

### 실행 오류
- `data` 폴더의 쓰기 권한 확인
- 입력 데이터가 Code-128에서 지원하는 문자인지 확인

## 📋 라이선스

이 프로젝트는 교육 목적으로 작성되었습니다.

## 🤝 기여

버그 리포트나 개선 제안은 언제든 환영합니다!

---

**개발자**: 김성주  
**개발 환경**: Java with ZXing Library  
**마지막 업데이트**: 2025년 5월 29일
