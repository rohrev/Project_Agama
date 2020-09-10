@Pay_Grade 
Feature: OrangeHRM Admin_Job Features 

Scenario: Log in to the OrangeHRM 
	Given   Navigates to OrangeHRM 
	And   Validate the url 
	When   Enter the  userNam and pwd 
	And   click on the loginbutton 
	Then   Get the page title ,take Screenshot 
	And  Click   Admin tab 
	And click JobTab menu
	
	And  Click PayGrades menu 

Scenario: Add the PayGrades  name and click save 
	Then  click Add button at the buttom
	And  Enter PayGradesnamw 
	Then click save 
	And verify the success msg 
	
Scenario: Add the PayGrades name and click cancel 
	Then  clicks add button 
	And  Enter name in the PayGrades textbox 
	Then click cancel 
	And verify the page title 
	
Scenario: Delete the PayGrades name and click ok 
	Then  click the check box 
	Then click delete 
	And Click Ok in the popup 
	And verify the successfully deleted msg 
	
Scenario: Delete the PayGrades name and click ocancel 
	Then  click the check box next to the name 
	Then clicks delete 
	And Click cancel in the popup 
	And validate the page title 
	
Scenario: Edit the PayGrades name and click save 
	Then  click the name link in the table 
	#And Click the button add
	And clicks Edit 
	And  clear the name in the txt box 
	And enter the name 
	And Click save button 
	And validate the success msg 
	
Scenario: Edit the PayGrades name and click cancel 
	Then  click the name link in the table 
	#And Add button click
	And Click the name link
	And clicks Edit button 
	And  clear the name from the txt box 
	And enter the name un the txt box 
	And Click cancel button again 
	And validate the page title	 is displated