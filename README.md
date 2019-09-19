# 인터넷뱅킹 이용 현황 정보 제공 API 개발

## 개발 프레임워크

- Spring boot 2.1.x
- JDK 1.8.0
- Mybatis, H2

## 문제해결 전략



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





