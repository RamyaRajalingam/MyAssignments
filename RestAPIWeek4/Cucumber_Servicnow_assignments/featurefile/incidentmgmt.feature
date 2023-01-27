Feature: Incidents
Background:
Given Setup BaseURI
And Validate Credential

Scenario: Create Incident with body as String

When Create Incident with requestbody '{"short_description": "My first incident created via RestAssured","description": "Created with Cucumber"}'
Then StatusCode is 201 

Scenario Outline: Create Incident with FileBody
When Create Incident with file'<filename>'
Then StatusCode is 201 
Examples:
|filename|
|createincident.json|
|createincident2.json|

Scenario: Update Incident with body as String
When Update Incident With requestbody '{"description": "Update Incident using requestbody", "short_description": "Incident Updation using cucumber","urgency": "2"}'
Then StatusCode is 200

Scenario Outline: Update Incident with FileBody
When Update Incident with file'<filename>'
Then StatusCode is 200
Examples:
|filename|
|modifyincident.json|

Scenario: Get a particular Incidents
When Get the incident by sysid
Then StatusCode is 200

Scenario: Delete Incident
When Delete an Incident
Then StatusCode is 204