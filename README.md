# KDTcom 웹 사이트

## 프로젝트 소개
이 프로젝트는 **Spring Framework** 기반의 전통적인 스프링 MVC 웹 애플리케이션입니다.  
회원 관리, 사용자 인증, 파일 업로드 등 기본적인 웹 서비스 기능을 제공하며, XML 설정 파일(JSP, Tiles 등)을 활용하여 구성되었습니다.

## 주요 기능
- **회원 관리 및 인증**  
  사용자 등록, 로그인, 인증 기능을 통해 안정적인 회원 관리 시스템을 구현했습니다.
- **파일 업로드**  
  파일 업로드 및 관리 기능을 제공하여, 사용자에게 편리한 서비스를 지원합니다.
- **웹 컨트롤러**  
  `AdminController.java`와 `MainController.java`를 통해 다양한 HTTP 요청을 처리합니다.
- **데이터 접근 및 매핑**  
  MyBatis를 활용하여 데이터 접근을 효율적으로 수행하며, `member-mapper.xml`을 통한 매핑을 설정했습니다.

## 기술 스택
- **언어**: Java
- **프레임워크**: Spring Framework (Spring MVC)
- **ORM**: MyBatis
- **빌드 도구**: Maven
- **뷰 템플릿**: JSP, Tiles
- **로깅**: Log4j

## 🧑‍💻 개발자 정보  
- **개발자**: 오승안 / OH SEUNG ANH 
- **이메일**: dhtmddks98@naver.com, ahn980321@gmail.com 
- **GitHub**: https://github.com/OurOh
- **개인블로그**: https://ouroh.tistory.com/

## 폴더 구조 설명
```plaintext
.settings
src/main/
├── java/net/musecom/kdtcom/
│   ├── controller/
│   │   ├── AdminController.java
│   │   └── MainController.java
│   ├── dao/
│   │   ├── MemberDao.java
│   │   ├── MemberDaoImpl.java
│   │   └── MemberMapper.java
│   ├── model/
│   │   └── MemberDto.java
│   └── service/
│       ├── ClientIpAddress.java
│       ├── CustomAuthService.java
│       └── FileUploadService.java
├── resources/
│   ├── mappers/
│   │   └── member-mapper.xml
│   ├── tiles/
│   ├── log4j.xml
│   ├── tiles.xml
│   └── mybatis-config.xml
webapp/
├── WEB-INF/
│   ├── spring/
│   │   ├── appservlet/
│   │   │   └── servlet-context.xml
│   │   ├── root-context.xml
│   │   └── security-content.xml
│   ├── views/
│   │   ├── include/
│   │   ├── admin/
│   │   ├── layout/
│   └── web.xml
res/
├── admin/
│   ├── css/
│   └── js/
├── css/
└── js/
   
target/
├── classes/
│   ├── mappers/
│   │   └── member-mapper.xml
│   ├── net/musecom/kdtcom/
│   ├── tiles/
│   └── mybatis-config.xml
├── m2e-wtp/web-resources/META-INF
└── maven/net.musecom/kdtcom/
    ├── MANIFEST.MF
    └── maven-status/
        └── maven-compiler-plugin/compile/default-compile/
            ├── createdFiles.lst
            └── inputFiles.lst
.classpath
.gitattributes
.project
README.md
pom.xml
