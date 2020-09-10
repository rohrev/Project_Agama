$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Admin_job_PayGrades.feature");
formatter.feature({
  "name": "OrangeHRM Admin_Job Features",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.scenario({
  "name": "Log in to the OrangeHRM",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.step({
  "name": "Navigates to OrangeHRM",
  "keyword": "Given "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.navigates_to_OrangeHRM()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Validate the url",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.validate_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter the  userNam and pwd",
  "keyword": "When "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.enter_the_userNam_and_pwd()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on the loginbutton",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_on_the_loginbutton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Get the page title ,take Screenshot",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.get_the_page_title_take_Screenshot()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click   Admin tab",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_Admin_tab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click JobTab menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_JobTab_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click PayGrades menu",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_PayGrades_menu()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add the PayGrades  name and click save",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.step({
  "name": "click Add button at the buttom",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_Add_button_at_the_buttom()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter PayGradesnamw",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.enter_PayGradesnamw()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click save",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_save()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the success msg",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.verify_the_success_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Add the PayGrades name and click cancel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.step({
  "name": "clicks add button",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.clicks_add_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter name in the PayGrades textbox",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.enter_name_in_the_PayGrades_textbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click cancel",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_cancel()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the page title",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.verify_the_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete the PayGrades name and click ok",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.step({
  "name": "click the check box",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_the_check_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click delete",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click Ok in the popup",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_Ok_in_the_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify the successfully deleted msg",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.verify_the_successfully_deleted_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Delete the PayGrades name and click ocancel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.step({
  "name": "click the check box next to the name",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_the_check_box_next_to_the_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks delete",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.clicks_delete()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click cancel in the popup",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_cancel_in_the_popup()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the page title",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.validate_the_page_title()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit the PayGrades name and click save",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.step({
  "name": "click the name link in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_the_name_link_in_the_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Edit",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.clicks_Edit()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clear the name in the txt box",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.clear_the_name_in_the_txt_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the name",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.enter_the_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click save button",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_save_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the success msg",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.validate_the_success_msg()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Edit the PayGrades name and click cancel",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Pay_Grade"
    }
  ]
});
formatter.step({
  "name": "click the name link in the table",
  "keyword": "Then "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_the_name_link_in_the_table()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the name link",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_the_name_link()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks Edit button",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.clicks_Edit_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clear the name from the txt box",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.clear_the_name_from_the_txt_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the name un the txt box",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.enter_the_name_un_the_txt_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click cancel button again",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.click_cancel_button_again()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "validate the page title\t is displated",
  "keyword": "And "
});
formatter.match({
  "location": "com.StepDefinition.Admin.Admin_Job_PayCard_SD.validate_the_page_title_is_displated()"
});
formatter.result({
  "status": "passed"
});
});