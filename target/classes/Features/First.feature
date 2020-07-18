Feature: First Project performing GET and POST


Scenario: Script Execution

Given Fetch details using GET "http://ergast.com/" and "api/f1/drivers.json"
Then perform the POST request "https://reqres.in/" and "/api/users" 
And Execution completed

