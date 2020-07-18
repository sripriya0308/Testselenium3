$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("First.feature");
formatter.feature({
  "line": 1,
  "name": "First Project performing GET and POST",
  "description": "",
  "id": "first-project-performing-get-and-post",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Script Execution",
  "description": "",
  "id": "first-project-performing-get-and-post;script-execution",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Fetch details using GET \"http://ergast.com/\" and \"api/f1/drivers.json\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "perform the POST request \"https://reqres.in/\" and \"/api/users\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Execution completed",
  "keyword": "And "
});
formatter.match({
  "arguments": [
    {
      "val": "http://ergast.com/",
      "offset": 25
    },
    {
      "val": "api/f1/drivers.json",
      "offset": 50
    }
  ],
  "location": "FirstScript.start(String,String)"
});
formatter.result({
  "duration": 1522135700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://reqres.in/",
      "offset": 26
    },
    {
      "val": "/api/users",
      "offset": 51
    }
  ],
  "location": "FirstScript.execution_in_progress(String,String)"
});
formatter.result({
  "duration": 1575183200,
  "status": "passed"
});
formatter.match({
  "location": "FirstScript.executioncompleted()"
});
formatter.result({
  "duration": 34800,
  "status": "passed"
});
});