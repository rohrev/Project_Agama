@A_JobTitles 
Feature: OrangeHRM Admin_Job Features 

Background: 
	Given  Navigates to OrangeHRM website 
	And   Verify the url 
	When   Enter the  uNam and pwd 
	And   clicks on the loginbutton 
	Then   Get the page title and  take Screenshot 
	Given  ClickS ON   Admimin tab 
	Then  Click the Job subtab 
	And  Click jobtitle menu 	

Scenario: Add the Job title and click save 
	Then  click Add button
	Then  click Add buttAnd  Enter jobTitle, click,save and verify the message 	
	
Scenario: Add the Job title and  click cancel 

	Then  clicks Add button 
	And  Enter jobTitle in text,cancel ,validate page title
#	 
#	And  Click cancel button 
#	And 	Get the page title 
#	And  Validate page title 
#	
#	
#Scenario: Edit the Job title and save 
#
#	Given  Select the link under the jobTitle Table 
#	And  Check the checkbox next to selection 
#	Then  Click the Edit button 
#	And  Edit the entry in the jobtitletxt box 
#	And  Click the save 
#	And  VAlidate the success messsage after saving 
#	
#Scenario: Edit the Job title and cancel 
#
#	Given  Select the link injob Title Table 
#	And  Check the checkbox near to selection 
#	Then  Click Edit button 
#	And  Edit the entry in the text box 
#	And  Click cancel 
#	
#Scenario: Delete the entry from the Job title table and click ok 
#	Given  Check the check box next to an entry 
#	And  Cliclk delete button 
#	When  Popup window will open 
#	And  Verify the msg in the pop up 
#	And  Click ok 
#	And  Validate the success deleted msg 
#	
#Scenario: Delete the entry from the Job title table and click cancel 
#	Given  Check the check box in the table 
#	And  Click delete button 
#	When  Popupwindow opens 
#	And  Verify the msg in the pop up 
#	And  Click cancel 
#	And  Validate the page heading of the page 
#	
#	
#	
#	
#	
#	
#	
