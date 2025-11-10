# portfolio-api

## 기능 목록
1. 코멘트 등록 기능
2. 코멘트 조회 기능

## 1. 코멘트 등록 기능

### request type
POST 요청

### request body
```json
{
    "name": "이름",
    "comment": "코멘트 내용"
}
```

### response

> `<Success>` 패스

> `<Error>`

## 2. 코멘트 조회 기능

### request body
```json
none
```

### response

```json
{
  "comments": ["{name: 이름, comment: 코멘트 내용}"]
}
```
