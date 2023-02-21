$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Include/features/Login.feature");
formatter.feature({
  "name": "Login Website",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Login with valid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "name": "User directed to homepage",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ]
    },
    {
      "cells": [
        "problem_user",
        "secret_sauce"
      ]
    },
    {
      "cells": [
        "performance_glitch_user",
        "secret_sauce"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with valid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.access_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter standard_user and secret_sauce",
  "keyword": "When "
});
formatter.match({
  "location": "Login.fillData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User directed to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.access_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter problem_user and secret_sauce",
  "keyword": "When "
});
formatter.match({
  "location": "Login.fillData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User directed to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with valid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.access_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter performance_glitch_user and secret_sauce",
  "keyword": "When "
});
formatter.match({
  "location": "Login.fillData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User directed to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyHomepage()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Login with invalid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.step({
  "name": "User enter \u003cusername\u003e and \u003cpassword\u003e",
  "keyword": "When "
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "[blank]",
        "secret_sauce"
      ]
    },
    {
      "cells": [
        "standard_user",
        "[blank]"
      ]
    },
    {
      "cells": [
        "[blank]",
        "[blank]"
      ]
    },
    {
      "cells": [
        "abcdef",
        "HAHA"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Login with invalid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.access_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter [blank] and secret_sauce",
  "keyword": "When "
});
formatter.match({
  "location": "Login.fillData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyError()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.access_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter standard_user and [blank]",
  "keyword": "When "
});
formatter.match({
  "location": "Login.fillData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyError()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.access_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter [blank] and [blank]",
  "keyword": "When "
});
formatter.match({
  "location": "Login.fillData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyError()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Login with invalid account",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User access login page",
  "keyword": "Given "
});
formatter.match({
  "location": "Login.access_loginPage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter abcdef and HAHA",
  "keyword": "When "
});
formatter.match({
  "location": "Login.fillData(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "Login.clickLogin()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get error message",
  "keyword": "Then "
});
formatter.match({
  "location": "Login.verifyError()"
});
formatter.result({
  "status": "passed"
});
});