$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Desktop.feature");
formatter.feature({
  "line": 1,
  "name": "Desktops",
  "description": "",
  "id": "desktops",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5640844800,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User verify all items are present in Deskstops tab",
  "description": "",
  "id": "desktops;user-verify-all-items-are-present-in-deskstops-tab",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "User is on Retail Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User click on Desktops tab",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User click on show all desktops",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User should see all items are present in Deskop page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginTestStepDef.User_is_on_Retail_Website()"
});
formatter.result({
  "duration": 3281196300,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDef.user_click_on_Desktops_tab()"
});
formatter.result({
  "duration": 154376000,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDef.user_click_on_show_all_desktops()"
});
formatter.result({
  "duration": 1149763100,
  "status": "passed"
});
formatter.match({
  "location": "DesktopStepDef.user_should_see_all_items_are_present_in_Deskop_page()"
});
formatter.result({
  "duration": 189648000,
  "status": "passed"
});
formatter.after({
  "duration": 1047210100,
  "status": "passed"
});
});