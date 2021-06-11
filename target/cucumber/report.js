$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/New_Account.feature");
formatter.feature({
  "line": 1,
  "name": "Techfios bank and cash New Account Functionality",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User enters the \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User fill up the form entering \"\u003caccountTitle\u003e\"and \"\u003cdescription\u003e\"and \"\u003cinitialBalance\u003e\"and \"\u003caccountNumber\u003e\"and \"\u003ccontactPerson\u003e\"and \"\u003cphone\u003e\"and \"\u003cinternetBankingUrl\u003e\" and clicks on submit",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password",
        "accountTitle",
        "description",
        "initialBalance",
        "accountNumber",
        "contactPerson",
        "phone",
        "internetBankingUrl"
      ],
      "line": 15,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;1"
    },
    {
      "cells": [
        "demo@techfios.com",
        "abc123",
        "mtz",
        "asdfgh",
        "12345",
        "76523865",
        "shz",
        "9723457653",
        "www.bofa@yahoo.com"
      ],
      "line": 16,
      "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2026979999,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "user is on the Techfios login page",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginAndNewAccStepDef.user_is_on_the_Techfios_login_page()"
});
formatter.result({
  "duration": 1319654401,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "User should be able to login with valid credentials",
  "description": "and open a new account",
  "id": "techfios-bank-and-cash-new-account-functionality;user-should-be-able-to-login-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 7,
  "name": "User enters the \"demo@techfios.com\" and \"abc123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User should be able to see the dashboard",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on bank and cash",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "User clicks on new account",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User fill up the form entering \"mtz\"and \"asdfgh\"and \"12345\"and \"76523865\"and \"shz\"and \"9723457653\"and \"www.bofa@yahoo.com\" and clicks on submit",
  "matchedColumns": [
    2,
    3,
    4,
    5,
    6,
    7,
    8
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "User should be able to validate new account created",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 17
    },
    {
      "val": "abc123",
      "offset": 41
    }
  ],
  "location": "LoginAndNewAccStepDef.user_enters_and(String,String)"
});
formatter.result({
  "duration": 197143999,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndNewAccStepDef.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 1641492900,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndNewAccStepDef.user_should_be_able_to_see_the_dashboard()"
});
formatter.result({
  "duration": 6249601,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndNewAccStepDef.user_clicks_on_bank_and_cash()"
});
formatter.result({
  "duration": 75804400,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndNewAccStepDef.user_clicks_on_new_account()"
});
formatter.result({
  "duration": 557309401,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mtz",
      "offset": 32
    },
    {
      "val": "asdfgh",
      "offset": 41
    },
    {
      "val": "12345",
      "offset": 53
    },
    {
      "val": "76523865",
      "offset": 64
    },
    {
      "val": "shz",
      "offset": 78
    },
    {
      "val": "9723457653",
      "offset": 87
    },
    {
      "val": "www.bofa@yahoo.com",
      "offset": 103
    }
  ],
  "location": "LoginAndNewAccStepDef.user_fill_up_the_form(String,String,String,String,String,String,String)"
});
formatter.result({
  "duration": 1331160100,
  "status": "passed"
});
formatter.match({
  "location": "LoginAndNewAccStepDef.user_should_be_able_to_validate_new_account_created()"
});
formatter.result({
  "duration": 31536400,
  "error_message": "junit.framework.ComparisonFailure: expected:\u003c[Manage Accounts]\u003e but was:\u003c[]\u003e\r\n\tat junit.framework.Assert.assertEquals(Assert.java:100)\r\n\tat junit.framework.Assert.assertEquals(Assert.java:107)\r\n\tat steps.LoginAndNewAccStepDef.user_should_be_able_to_validate_new_account_created(LoginAndNewAccStepDef.java:77)\r\n\tat ✽.Then User should be able to validate new account created(features/New_Account.feature:13)\r\n",
  "status": "failed"
});
});