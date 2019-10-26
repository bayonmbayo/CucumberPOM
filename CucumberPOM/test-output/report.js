$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/com/qa/fearures/orangehrm.feature");
formatter.feature({
  "name": "",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validate orange HRM Home Page Test",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user opens browser",
  "keyword": "Given "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_opens_browser() in file:/C:/Users/bayon/eclipse-workspace/CucumberPOM/target/classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_is_on_login_Page() in file:/C:/Users/bayon/eclipse-workspace/CucumberPOM/target/classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user logs into app",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.user_enters_username_and_password() in file:/C:/Users/bayon/eclipse-workspace/CucumberPOM/target/classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate home page title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.validate_home_page_title() in file:/C:/Users/bayon/eclipse-workspace/CucumberPOM/target/classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate logged in username",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.validate_logged_in_username() in file:/C:/Users/bayon/eclipse-workspace/CucumberPOM/target/classes/"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "com.qa.stepdefinitions.HomePageSteps.close_the_browser() in file:/C:/Users/bayon/eclipse-workspace/CucumberPOM/target/classes/"
});
formatter.result({
  "status": "passed"
});
});