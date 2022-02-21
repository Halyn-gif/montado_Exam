$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/viviennsabo/src/test/resources/loginTest/login.feature");
formatter.feature({
  "line": 2,
  "name": "User Login",
  "description": "",
  "id": "user-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LoginTest"
    },
    {
      "line": 1,
      "name": "@FullRegression"
    }
  ]
});
formatter.scenarioOutline({
  "line": 6,
  "name": "R001 Login with invalid Login",
  "description": "",
  "id": "user-login;r001-login-with-invalid-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@R001"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User opens \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \u0027\u003clogin\u003e\u0027 login into \u0027Login\u0027 input on \u0027Login\u0027 page",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \u0027\u003cpassWord\u003e\u0027 passWord into \u0027PassWord\u0027 input on \u0027Login\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on \u0027SingIn\u0027 button on \u0027Login\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User sees alert message with text \u0027\u0027",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "user-login;r001-login-with-invalid-login;",
  "rows": [
    {
      "cells": [
        "login",
        "passWord"
      ],
      "line": 15,
      "id": "user-login;r001-login-with-invalid-login;;1"
    },
    {
      "cells": [
        "login",
        "pass"
      ],
      "line": 16,
      "id": "user-login;r001-login-with-invalid-login;;2"
    },
    {
      "cells": [
        "",
        ""
      ],
      "line": 17,
      "id": "user-login;r001-login-with-invalid-login;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 25492378400,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "R001 Login with invalid Login",
  "description": "",
  "id": "user-login;r001-login-with-invalid-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@R001"
    },
    {
      "line": 1,
      "name": "@FullRegression"
    },
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User opens \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \u0027login\u0027 login into \u0027Login\u0027 input on \u0027Login\u0027 page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \u0027pass\u0027 passWord into \u0027PassWord\u0027 input on \u0027Login\u0027 page",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on \u0027SingIn\u0027 button on \u0027Login\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User sees alert message with text \u0027\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_StepDefinition.userOpensLoginPage()"
});
formatter.result({
  "duration": 13154421200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "login",
      "offset": 13
    }
  ],
  "location": "LoginPage_StepDefinition.user_enters_Wrong_login_login_into_Login_input_on_Login_page(String)"
});
formatter.result({
  "duration": 3324529500,
  "error_message": "java.lang.AssertionError: can not work with elementorg.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027userSigninLogin\u0027]\"}\n  (Session info: chrome\u003d98.0.4758.82)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP\u0027, ip: \u0027192.168.43.219\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.82, chrome: {chromedriverVersion: 98.0.4758.80 (7f0488e8ba0d8..., userDataDir: C:\\Users\\dolin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53592}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ac20024c9b58e0955f4d29b2244ed35f\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027userSigninLogin\u0027]}\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat pages.ParentPage.writeErrorAndStopTest(ParentPage.java:71)\r\n\tat pages.ParentPage.enterTextToElement(ParentPage.java:31)\r\n\tat pages.LoginPage.enterEmailInSignIn(LoginPage.java:94)\r\n\tat StepDefinition.LoginPage_StepDefinition.user_enters_Wrong_login_login_into_Login_input_on_Login_page(LoginPage_StepDefinition.java:19)\r\n\tat ✽.When User enters \u0027login\u0027 login into \u0027Login\u0027 input on \u0027Login\u0027 page(C:/viviennsabo/src/test/resources/loginTest/login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "pass",
      "offset": 13
    }
  ],
  "location": "LoginPage_StepDefinition.user_enters_Wrong_pass_passWord_into_PassWord_input_on_Login_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPage_StepDefinition.user_click_on_SingIn_button_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 35
    }
  ],
  "location": "LoginPage_StepDefinition.user_sees_alert_message_with_text_Invalid_username_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1932744200,
  "status": "passed"
});
formatter.before({
  "duration": 5329368900,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "R001 Login with invalid Login",
  "description": "",
  "id": "user-login;r001-login-with-invalid-login;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 5,
      "name": "@R001"
    },
    {
      "line": 1,
      "name": "@FullRegression"
    },
    {
      "line": 1,
      "name": "@LoginTest"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User opens \u0027Login\u0027 page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User enters \u0027\u0027 login into \u0027Login\u0027 input on \u0027Login\u0027 page",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User enters \u0027\u0027 passWord into \u0027PassWord\u0027 input on \u0027Login\u0027 page",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User click on \u0027SingIn\u0027 button on \u0027Login\u0027 page",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User sees alert message with text \u0027\u0027",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginPage_StepDefinition.userOpensLoginPage()"
});
formatter.result({
  "duration": 9423380000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 13
    }
  ],
  "location": "LoginPage_StepDefinition.user_enters_Wrong_login_login_into_Login_input_on_Login_page(String)"
});
formatter.result({
  "duration": 3077798400,
  "error_message": "java.lang.AssertionError: can not work with elementorg.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\".//*[@id\u003d\u0027userSigninLogin\u0027]\"}\n  (Session info: chrome\u003d98.0.4758.82)\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.14.0\u0027, revision: \u0027aacccce0\u0027, time: \u00272018-08-02T20:19:58.91Z\u0027\nSystem info: host: \u0027LAPTOP\u0027, ip: \u0027192.168.43.219\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_271\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 98.0.4758.82, chrome: {chromedriverVersion: 98.0.4758.80 (7f0488e8ba0d8..., userDataDir: C:\\Users\\dolin\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:53638}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: ce6c8cdb41a7a5832f6dd2a94528ef66\n*** Element info: {Using\u003dxpath, value\u003d.//*[@id\u003d\u0027userSigninLogin\u0027]}\r\n\tat org.junit.Assert.fail(Assert.java:88)\r\n\tat pages.ParentPage.writeErrorAndStopTest(ParentPage.java:71)\r\n\tat pages.ParentPage.enterTextToElement(ParentPage.java:31)\r\n\tat pages.LoginPage.enterEmailInSignIn(LoginPage.java:94)\r\n\tat StepDefinition.LoginPage_StepDefinition.user_enters_Wrong_login_login_into_Login_input_on_Login_page(LoginPage_StepDefinition.java:19)\r\n\tat ✽.When User enters \u0027\u0027 login into \u0027Login\u0027 input on \u0027Login\u0027 page(C:/viviennsabo/src/test/resources/loginTest/login.feature:8)\r\n",
  "status": "failed"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 13
    }
  ],
  "location": "LoginPage_StepDefinition.user_enters_Wrong_pass_passWord_into_PassWord_input_on_Login_page(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "LoginPage_StepDefinition.user_click_on_SingIn_button_on_Login_page()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "",
      "offset": 35
    }
  ],
  "location": "LoginPage_StepDefinition.user_sees_alert_message_with_text_Invalid_username_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 1254365100,
  "status": "passed"
});
});