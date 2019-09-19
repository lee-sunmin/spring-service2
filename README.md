# 인터넷뱅킹 이용 현황 정보 제공 API 개발

## 개발 프레임워크

- Spring boot 2.1.x
- JDK 1.8.0
- Mybatis, H2

## 문제해결 전략

> **Mybatis 사용**  
과제의 요구사항을 분석 한 결과 쿼리를 사용하면 쉽게 해결 할 수 있을 것이라 판단했습니다.  
JPA 쿼리도 고려해 보았으나, Mybatis를 사용하면 쉽게 접근 할 수 있을 것이라 생각하여 채택하였습니다.  

> **Package 구조**  
Controller, Service, DAO, DTO, VO 로 package를 구성하였습니다.  
sql 쿼리로 들어오는 데이터들의 구조는 변경점이 없기 때문에 VO로,  
db에 저장하기 위한 테이블 구조를 가진 데이터는 DTO로 지정했습니다.  

> **ApplicationRunner 사용**  
ApplicationRunner를 통해 어플리케이션 구동 시 csv 파일을 읽어서 db에 저장하는 Service를 호출했습니다.  
csv에 접근하는 경로는 jar파일이 있는 target 폴더 기준 상대경로로 접근했습니다.


## 빌드 및 실행 방법

#### 서비스 시작

``` java -jar spring-service-0.0.1-SNAPSHOT.jar ```

### [API 테스트 시나리오]

#### 1. 인터넷뱅킹 서비스 접속 기기 목록을 출력하는 API 

> Method : GET

> URL : http://localhost:8080/list

[출력]

```JSON
[ {
  "device_name" : "스마트폰",
  "device_id" : 1000
}, {
  "device_name" : "데스크탑 컴퓨터",
  "device_id" : 1001
}, {
  "device_name" : "노트북 컴퓨터",
  "device_id" : 1002
}, {
  "device_name" : "기타",
  "device_id" : 1003
}, {
  "device_name" : "스마트패드",
  "device_id" : 1004
} ]
```

#### 2. 각 년도별로 인터넷뱅킹을 가장 많이 이용하는 접속기기를 출력하는 API 

> Method : GET

> URL : http://localhost:8080/max

[출력]

```JSON
[ {
  "year" : 2011,
  "device_id" : "1001",
  "device_name" : "데스크탑 컴퓨터",
  "rate" : 95.1
}, {
  "year" : 2012,
  "device_id" : "1001",
  "device_name" : "데스크탑 컴퓨터",
  "rate" : 93.9
}, {
  "year" : 2013,
  "device_id" : "1001",
  "device_name" : "데스크탑 컴퓨터",
  "rate" : 67.1
}, {
  "year" : 2014,
  "device_id" : "1000",
  "device_name" : "스마트폰",
  "rate" : 64.2
}, {
  "year" : 2015,
  "device_id" : "1000",
  "device_name" : "스마트폰",
  "rate" : 73.2
}, {
  "year" : 2016,
  "device_id" : "1000",
  "device_name" : "스마트폰",
  "rate" : 85.1
}, {
  "year" : 2017,
  "device_id" : "1000",
  "device_name" : "스마트폰",
  "rate" : 90.6
}, {
  "year" : 2018,
  "device_id" : "1000",
  "device_name" : "스마트폰",
  "rate" : 90.5
} ]
```

#### 3. 특정 년도를 입력받아 그 해에 인터넷뱅킹에 가장 많이 접속하는 기기 이름을 출력하는 API

> Method : GET

> URL : http://localhost:8080/year/2011

[출력]

```JSON
{
  "year" : 2011,
  "device_name" : "데스크탑 컴퓨터",
  "rate" : 95.1
}
```

#### 4. 디바이스 아이디를 입력받아 인터넷뱅킹에 접속 비율이 가장 많은 해를 출력하는 API

> Method : GET

> URL : http://localhost:8080/id/1000

[출력]

```JSON
{
  "year" : 2017,
  "device_name" : "스마트폰",
  "rate" : 90.6
}
```





