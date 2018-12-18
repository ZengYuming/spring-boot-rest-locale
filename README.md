# spring-boot-rest-locale
spring-boot rest api 的响应值，国际化，多语言 demo

测试流程：
1.http://localhost:8080/api?msg=hello 不传Accept-Language，就会返回默认的英语
2.http://localhost:8080/api?msg=hello curl -X GET -H "Accept-Language: fr" ,返回法语