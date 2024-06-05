# CORS Tester with Spring Boot Thymeleaf

Spring boot thymeleaf 웹 서버를 이용한 BE 서버 CORS 테스터입니다.<br>
`application.properties`에서
```
server.port = 5173
```
FE의 서버 포트를 바꿔 설정할 수 있습니다.<br>

`ApiTestController.java`에서
```
package com.test.cors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiTestController {

    @RequestMapping("/view")
    public String view() {
        return "cors";
    }

    @RequestMapping("/view-post")
    public String viewPost() {
        return "cors-post";
    }

    @RequestMapping("/view-delete")
    public String viewDelete() {
        return "cors-delete";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }

}
```
각 필요한 메서드를 설정할 수 있습니다.<br><br>

`resources/templates`의 html 파일 중 원하는 BE api를 call 할 수 있습니다.

```
<!DOCTYPE html>
<html lang="ko" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>this is title</title>
</head>
<body>
post-test

<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
    $(function() {
        $.ajax({
            url: "http://localhost/api/v1/member/signin", // 요청할 URL
            type: "POST", // HTTP 메서드
            data: JSON.stringify({ key: "value" }), // 전송할 데이터
            contentType: "application/json", // 전송할 데이터의 타입
            success: function(response) { // 요청이 성공하면 실행될 콜백 함수
                alert("response success");
            },
            error: function() { // 요청이 실패하면 실행될 콜백 함수
                alert("fail");
            }
        });
    });

</script>
</body>
</html>
```
중 `url: "http://localhost/api/v1/member/signin", // 요청할 URL`를 통해 url 설정<br>
`type: "POST", // HTTP 메서드`을 통해 메서드 설정이 가능합니다.<br>
기타 여러 설정도 html 커스텀을 해서 사용하면 됩니다.


---

This is a BE server CORS tester using a Spring Boot Thymeleaf web server.

In the application.properties file, you can set the FE server port by changing:

yaml
코드 복사
server.port = 5173
In ApiTestController.java, you can set the required methods:

typescript
코드 복사
package com.test.cors;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiTestController {

    @RequestMapping("/view")
    public String view() {
        return "cors";
    }

    @RequestMapping("/view-post")
    public String viewPost() {
        return "cors-post";
    }

    @RequestMapping("/view-delete")
    public String viewDelete() {
        return "cors-delete";
    }

    @RequestMapping("/test")
    public String test() {
        return "test";
    }
}
You can call the desired BE API in the HTML files under resources/templates.

php
코드 복사
<!DOCTYPE html>
<html lang="ko" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>this is title</title>
</head>
<body>
post-test

<script src="https://code.jquery.com/jquery-3.5.1.min.js" integrity="sha256-9/aliU8dGd2tb6OSsuzixeV4y/faTqgFtohetphbbj0=" crossorigin="anonymous"></script>
<script>
    $(function() {
        $.ajax({
            url: "http://localhost/api/v1/member/signin", // Request URL
            type: "POST", // HTTP Method
            data: JSON.stringify({ key: "value" }), // Data to send
            contentType: "application/json", // Data type to send
            success: function(response) { // Callback function executed on successful request
                alert("response success");
            },
            error: function() { // Callback function executed on failed request
                alert("fail");
            }
        });
    });

</script>
</body>
</html>
You can set the URL through url: "http://localhost/api/v1/member/signin", // Request URL and set the method through type: "POST", // HTTP Method. You can customize other settings by modifying the HTML as needed.
