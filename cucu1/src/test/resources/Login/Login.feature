Feature: Testing Orange HRM
Scenario: To test the login page of OrangeHRM

Given User should in login page  
When enter the valid username "Admin"  

And enter the valid password "admin123"
And click on the login button

Then I should get the title "OrangeHRM"  