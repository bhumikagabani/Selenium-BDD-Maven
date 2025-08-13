Feature: Main tests

  @Selection
  Scenario Outline:Select any user using checkbox and clear the selection,
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And select and deselect options

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Selection
  Scenario Outline:Select any provider using checkbox and clear the selection,
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user choice provider tab
    And select and deselect options
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @User @Creation @Positive @Demo @daily @one
  Scenario Outline: Select Add User from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add user section
    And select title "Mr"
    And complete all names
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And select access role "SYSTEM_ADMIN"
    And select designation "Dietician"
    And select enrolled program "CCM"
    And select language spoken "English"
    And complete about section
    And submit
    And validate email

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @User @Creation @Negative @Demo @daily
  Scenario Outline: Select Add User from speed dial and fill in the details, click on Cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add user section
    And select title "Mr"
    And complete all names
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And select access role "SYSTEM_ADMIN"
    And select designation "Dietician"
    And select enrolled program "CCM"
    And select language spoken "English"
    And complete about section
    And cancel

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @User @Creation @validation @Demo @daily
  Scenario Outline: Select Add User from speed dial and fill in the details, click on Cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add user section
    And submit
    Then see 4 validations messages

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Provider @Creation @positive @new @Demo @daily @work
  Scenario Outline: Select Add Provider from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add provider section
    And complete all names
    And complete NPI
    And complete Qualification as "Bachelor of Arts"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    # And Complete Address section with "Idaho" state and "Work" type
    And complete about section
    And submit



    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider @Creation @validation @Demo @daily
  Scenario Outline: Select Add Provider from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add provider section
    And submit
    Then see 1 validations messages


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider @Creation @Negative @Demo @daily @work @0428 @0505 @05055
  Scenario Outline: Select Add Provider from speed dial and fill in the details, click on Cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add provider section
    And complete all names
    And complete NPI
    And complete Qualification as "Bachelor of Arts"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    #And Complete Address section with "Idaho" state and "Work" type
    And complete about section
    And cancel



    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Organization @Create @positive @Demo
  Scenario Outline: Select Add Organization from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add organization section
    And complete all names
    And complete organization type "Clinic"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And Complete Address section with "Arizona" state and "Work" type
    And complete about section
    And submit



    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|
    
  @Organization @Create @validation @Demo
  Scenario Outline: Select Add Organization from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add organization section
    And submit
    Then see 0 validations messages



    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Create @Negative @Demo
  Scenario Outline: Select Add Organization from speed dial and fill in the details, click on Cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And user go to add organization section
    And complete all names
    And complete organization type "Clinic"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And Complete Address section with "Arizona" state and "Work" type
    And complete about section
    And cancel



    Examples:
      | URL       |userid|password|ORG|
      | Reliq |rAdminUser|rAdminPassword|DevOrg|

  @Patient @Creation @Positive @Demo @bug
  Scenario Outline: Select Add Patient from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    And user go to add patient section
    And select account status "Active"
    And select title "Mr"
    And complete all names
    And complete birth date
    And select gender "Male"
    And select language spoken "English"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And Complete Address section with "Arizona" state and "Work" type
    And complete identifier "Dulcian ID"
    And select care provider "Wednesday Testing"
    #And select enrolled program "CCM"
    And submit

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient @Creation @Negative
  Scenario Outline: Select Add Patient from speed dial and fill in the details, click on cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    And user go to add patient section
    And select account status "Active"
    And select title "Mr"
    And complete all names
    And complete birth date
    And select gender "Male"
    And select language spoken "English"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And Complete Address section with "Arizona" state and "Work" type
    And complete identifier "Dulcian ID"
    And select care provider "Wednesday Testing"
    #And select enrolled program "CCM"
    And cancel

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Edit @User @Negative
  Scenario Outline: Select Edit User from speed dial and fill in the details, click on Cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user should see user tab
    And select first
    And click on edit
    #And select title "Mr"
    #And complete all names
    And complete phone and select "Work" type
    And select access role "SYSTEM_ADMIN"
    And select designation "Dietician"
    #And select enrolled program "CCM"
    And select language spoken "English"
    And complete about section
    And cancel

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Edit @User @positive
  Scenario Outline: Select Edit User from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user should see user tab
    And select first
    And click on edit
    And select title "Miss"
    And complete all names
    And complete phone and select "Personal" type
    And select access role "SYSTEM_ADMIN"
    And select designation "Dietician"
    And select enrolled program "PCM"
    And select language spoken "English"
    And complete about section
    And submit

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Edit @Provider @Positive
  Scenario Outline: Select Edit Provider from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "provider" tab
    And select first
    And click on edit
    And complete all names
    And complete NPI
    And complete Qualification as "Bachelor of Arts"
    And complete phone and select "Work" type
    And Complete Address section with "Idaho" state and "Work" type
    And complete about section
    And submit

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Edit @Provider @Negative
  Scenario Outline: Select Edit Providerfrom speed dial and fill in the details, click on Cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "provider" tab
    And select first
    And click on edit
    And complete all names
    And complete NPI
    And complete Qualification as "Bachelor of Arts"
    And complete phone and select "Work" type
    And Complete Address section with "Idaho" state and "Work" type
    And complete about section
    And cancel

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @OrganizationEdit @Edit @positive
  Scenario Outline: Select Edit Organization from speed dial and fill in the details, click on Submit
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "organization" tab
    And select first
    And click on edit
    And complete all names
    And complete organization type "Clinic"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And Complete Address section with "Idaho" state and "Work" type
    And complete about section
    And submit

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Edit @negative
  Scenario Outline: Select Edit Organization from speed dial and fill in the details, click on Cancel
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "organization" tab
    And select first
    And click on edit
    And complete all names
    And complete organization type "Clinic"
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And Complete Address section with "Idaho" state and "Work" type
    And complete about section
    And cancel

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @User @Search  @negative @Demo
  Scenario Outline: Search not existent user from speed dial
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "user" tab
    And find "Anacardo" in the speed dial
    And search result is "not visible"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @User @Search  @positive @Demo
  Scenario Outline: Search existent user from speed dial
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "user" tab
    And find "Jairo" in the speed dial
    And search result is "visible"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider @Search  @negative @Demo
  Scenario Outline: Search not existent provider from speed dial
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "provider" tab
    And find "Anacardo" in the speed dial
    And search result is "not visible"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider  @Search  @positive @Demo
  Scenario Outline: Search existent provider from speed dial
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "provider" tab
    And find "automation" in the speed dial
    And search result is "visible"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Organization @Search  @negative @Demo
  Scenario Outline: Search not existent organization from speed dial
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "organization" tab
    And find "Anacardo" in the speed dial
    And search result is "not visible"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Search  @positive @Demo
  Scenario Outline: Search existent organization from speed dial
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "organization" tab
    And find "duplicated" in the speed dial
    And search result is "visible"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|







