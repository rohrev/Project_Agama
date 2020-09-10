Feature: Totest the OrangeHRM

 Scenario: Click the  Login functionality of OrangeHRM 
 Given To Launch the browser and navigate to the URL
 When Enter username and password
 Then  Cllick submit button
 Then  Get the page title and Screenshot
    
#Scenario Outline:  Clicking the  Login functionality of OrangeHRM with datadriven
# Given  Launch the browser and navigate to the URL
# When Enter "<uName>" and "<psw>"
# Then  Cllick submitt button
# Then  Get the page title and  take Screenshot
# Then Get the page title and screen shot
# 
#    
# 
# Examples:
# |uName   |psw      |
# |Admin   |admin123 |
# |admin   |password |