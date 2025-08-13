Feature: workboard
  @Workboard @Sorting @daily
  Scenario Outline: Go to organization tab and check organizations sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then user choose "Rpm" tab
    Then user choose "observations" tab
    And search result is "visible"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Workboard @Sorting @daily
  Scenario Outline: Go to observations tab and expand observation row
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then click on "observations" tab
    Then check if patients are visible
    And select first "disabled" related notes in board
    Then click on first new expandable row
    Then view expanded row
    And view Add Note with enabled status
    And View Related Notes with disabled status
    And Signed-off with enabled status


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily
  Scenario Outline: Add Note via observation tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "observations" tab
    Then check if patients are visible
    Then click on expandable row
    Then view expanded row
    And view Add Note with enabled status
    And Signed-off with enabled status
    When click on Add Note
    Then sign and publish
    Then see 1 validations messages
    Then fill note 
    Then sign and publish
    Then see the snackbar message "Note added"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily
    Scenario Outline: Add Note via observation tab and cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "observations" tab
    Then check if patients are visible
    Then click on expandable row
    Then view expanded row
    And view Add Note with enabled status
    And Signed-off with enabled status
    When click on Add Note
    Then sign and publish
    Then see 1 validations messages
    Then fill note
    Then cancel
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|




  @Workboard @Sorting @daily
  Scenario Outline: See related notes
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "observations" tab
    Then check if patients are visible
    Then check first related notes in board
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Workboard @Sorting @daily
  Scenario Outline: Sign-Off via observation tab with note added
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then click on "observations" tab
    Then check if patients are visible
    And select first "enabled" related notes in board
    Then click on first in progress expandable row
    Then view expanded row
    And Signed-off with enabled status
    Then sign off observation


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily
    Scenario Outline: Sign-Off via observation tab with no note added
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then click on "observations" tab
    Then check if patients are visible
    And select first "disabled" related notes in board
    Then click on first new expandable row
    Then view expanded row
    And Signed-off with enabled status
    Then sign off observation
    And confirm sign Off

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily
  Scenario Outline: Sign-Off via observation tab with no note added and cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then click on "observations" tab
    Then check if patients are visible
    And select first "disabled" related notes in board
    Then click on first new expandable row
    Then view expanded row
    And View Related Notes with disabled status
    And Signed-off with enabled status
    Then sign off observation
    And cancel sign Off

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily @atrisk
  Scenario Outline: Go to At-Risk tab and check At-Risk sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then user choose "Rpm" tab
    Then user choose "atrisk" tab
    And search result is "visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Workboard @Sorting @daily @atrisk
  Scenario Outline: Go to At-Risk tab and expand At-Risk row
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then user choose "atrisk" tab
    And search result is "visible"
    Then check if patients are visible
    And select first "disabled" related notes in board
    Then click on first new expandable row
    Then view expanded row
    And view Add Note with enabled status
    And View Related Notes with disabled status
    And Signed-off with enabled status

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily @atrisk
  Scenario Outline: Add Note via At-Risk tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then user choose "atrisk" tab
    Then check if patients are visible
    Then click on expandable row
    Then view expanded row
    And view Add Note with enabled status
    And Signed-off with enabled status
    When click on Add Note
    Then sign and publish
    Then see 1 validations messages
    Then fill note
    Then sign and publish
    Then see the snackbar message "Note added"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily @atrisk
  Scenario Outline: Add Note via At-Risk tab and cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then user choose "atrisk" tab
    Then check if patients are visible
    Then click on expandable row
    Then view expanded row
    And view Add Note with enabled status
    And Signed-off with enabled status
    When click on Add Note
    Then sign and publish
    Then see 1 validations messages
    Then fill note
    Then cancel

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily @atrisk
  Scenario Outline: See related notes in At-Risk tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then user choose "atrisk" tab
    Then check if patients are visible
    Then check first related notes in board
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily @atrisk
  Scenario Outline: Sign-Off via At-Risk tab with note added
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then user choose "atrisk" tab
    Then check if patients are visible
    And select first "enabled" related notes in board
    Then click on first in progress expandable row
    Then view expanded row
    And Signed-off with enabled status
    Then sign off observation


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily @atrisk
  Scenario Outline: Sign-Off via At-Risk tab with no note added
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then user choose "atrisk" tab
    Then check if patients are visible
    And select first "disabled" related notes in board
    Then click on first new expandable row
    Then view expanded row
    And Signed-off with enabled status
    Then sign off observation
    And confirm sign Off

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Workboard @Sorting @daily @atrisk
  Scenario Outline: Sign-Off via At-Risk tab with no note added and cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Workboard" tab
    Then click on "Rpm" tab
    Then user choose "atrisk" tab
    Then check if patients are visible
    And select first "disabled" related notes in board
    Then click on first new expandable row
    Then view expanded row
    And View Related Notes with disabled status
    And Signed-off with enabled status
    Then sign off observation
    And cancel sign Off

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|