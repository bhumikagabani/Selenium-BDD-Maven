Feature: Selection functionality

  @Patient  @Search  @positive @Demo  @bug
  Scenario Outline:Search existent patient from speed dial and see Summary patient information tabs
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient2" in the speed dial
    And search result is "visible"
    And see details
    And select "Dashboard" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @Search  @positive @Demo
  Scenario Outline:  Search existent patient from speed dial and see Observations patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient2" in the speed dial
    And search result is "visible"
    And see details
    And select "Observations" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @Search  @positive @Demo @daily @0501 @0505
  Scenario Outline:  Search existent patient from speed dial and see Notes patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Notes" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @Search  @positive @Demo @daily @0501 @0505
  Scenario Outline:  Search existent patient from speed dial and see Medication patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Medications" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @Search  @positive @Demo @daily @0501 @0505
  Scenario Outline:  Search existent patient from speed dial and see Documents patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Documents" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @Search  @positive @Demo @bug
  Scenario Outline:  Search existent patient from speed dial and see Care Programs patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient2" in the speed dial
    And search result is "visible"
    And see details
    And select "Care Programs" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @Search  @positive @Demo
  Scenario Outline:  Search existent patient from speed dial and see Information patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient2" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @Search  @positive @Demo
  Scenario Outline:  Search existent patient from speed dial and see Devices patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient2" in the speed dial
    And search result is "visible"
    And see details
    And select "Devices" patient tab
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Patient  @positive  @create @medicationCreate  @Demo @daily @0628 @bug301 @0705
  Scenario Outline:  Search existent patient from speed dial and see Information patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Medications" patient tab
    Then user click on create new medication
    And select status "Completed"
    And fill medication name
    And fill Range with low "3" and high "6" doses
    And select Unit "10*3/mL"
    And select route "Oral route"
    And select frequency "QID"
    And select is needed "on"
    And complete instructions and comments
    And complete starting date "8" and end date "18"
    And complete prescriber "Other"
    And cancel medication


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Patient  @positive  @create @medicationCreate @Demo @daily @0428 @0501 @0505 @0705
  Scenario Outline:  Search existent patient from speed dial and see Information patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Medications" patient tab
    Then user click on create new medication
    And select status "Completed"
    And fill medication name
    And fill Range with low "3" and high "6" doses
    And select Unit "10*3/mL"
    And select route "Oral route"
    And select frequency "QID"
    And select is needed "on"
    And complete instructions and comments
    And complete starting date "7" and end date "18"
    And complete prescriber "Other"
    And submit medication



    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Patient  @positive @Device @create  @Demo @daily @0420 @0501 @0505
  Scenario Outline:  Search existent patient from speed dial and create device
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Devices" patient tab
    And click on add device
    And submit device
    Then see 1 validations messages
    Then see the validation message "A device is required"
    And select device name "ForaCare D40G"
    And submit device
    Then see 1 validations messages
    And complete serial number
    And submit device
    Then see the snackbar message "Device added."


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Patient  @positive @Device @create  @Demo @daily @0501 @0505
  Scenario Outline:  Search existent patient from speed dial and create device
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Devices" patient tab
    And click on add device
    And submit device
    Then see 1 validations messages
    Then see the validation message "A device is required"
    And select device name "Smart Meter iBlood Pressure"
    And submit device
    Then see 1 validations messages
    And complete serial number
    And submit device




    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive @Device @create  @Demo
  Scenario Outline:  Search existent patient from speed dial and create device
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "PPPP" in the speed dial
    And search result is "visible"
    And see details
    And select "Devices" patient tab
    And click on add device
    And submit device
    Then see 1 validations messages
    Then see the validation message "A device is required"
    And select device name "iHealth Devices"
    And submit device
    Then see 1 validations messages
    Then see the validation message "This device has already been assigned to a patient"
    And complete serial number
    And complete type "Thermometer"
    And submit device



    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Patient  @positive  @create @addAddress @Demo  @19
  Scenario Outline:  Search existent patient from speed dial and see Information patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationZulauf" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Adress
    And submit Adress
    Then see 1 validations messages
    Then see the validation message "Type is required"
    And Complete Address section with "Idaho" state and "Work" type
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And submit Adress
    Then see the snackbar message " Address added"






    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @Demo @19
  Scenario Outline:  Search existent patient from speed dial and see Information patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationZulauf" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And select "Documents" patient tab
    And select "Information" patient tab
    And open view all address
    Then see the created address "11 King St"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @Demo @19
  Scenario Outline:  Search existent patient from speed dial and see Information patient information tab
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    Then user choose "Documents" tab
    Then user choose "patient" tab
    And find "AutomationZulauf" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And open view all address
    And click on edit address
    And Edit Address section with "Idaho" state and "Work" type
    And Edit phone and select "Work" type
    And Edit email and select "Work" type
    And save address
    Then see the snackbar message " Addresses updated "

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @2511 @daily @bug43 @05011 @0505
  Scenario Outline:Add insurance Medicare
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationGlove" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Insurance
    And submit Insurance
    Then see 1 validations messages
    Then see the validation message "A payor is required"
    And select Medicare payor
    And fill member ID
    And fill coverage start "3"
    And select type "Medicare A/B"
    And submit Insurance
    Then see the snackbar message " Insurance added"
    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @2511 @daily @bug2 @05011 @0505
  Scenario Outline:Add insurance Medicare
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationGlover" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Insurance
    And submit Insurance
    Then see 1 validations messages
    Then see the validation message "A payor is required"
    And select Medicare payor
    And fill member ID
    And fill coverage start "3"
    And select type "Medicare A/B"
    And cancel Insurance

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @2511 @daily @bug2 @0501 @0505
  Scenario Outline:Add insurance Medicare
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationSpence" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Insurance
    And submit Insurance
    Then see 1 validations messages
    Then see the validation message "A payor is required"
    And select Medicaid payor
    And fill member ID
    And fill coverage start "3"
    And cancel Insurance

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|
  @Patient  @positive  @create @addAddress @2511 @daily @bug2 @0501 @0505 @05055
  Scenario Outline:Add insurance Medicare
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationSpence" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Insurance
    And submit Insurance
    Then see 1 validations messages
    Then see the validation message "A payor is required"
    And select Medicaid payor
    And fill member ID
    And fill coverage start "3"
    And submit Insurance

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @2511 @daily @bug2 @0501 @0505 @05055
  Scenario Outline:Add insurance Medicare
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationSpence" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Insurance
    And submit Insurance
    Then see 1 validations messages
    Then see the validation message "A payor is required"
    And select Private payor
    And fill member ID
    And fill coverage start "3"
    And submit Insurance

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @2511 @daily @bug2 @0501 @0505 @05055
  Scenario Outline:Add insurance Medicare
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationSpence" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Insurance
    And submit Insurance
    Then see 1 validations messages
    Then see the validation message "A payor is required"
    And select Private payor
    And fill member ID
    And fill coverage start "3"
    And fill coverage end "5"
    And fill private insurance data
    And cancel Insurance

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @2511 @daily @bug2 @0501 @0505
  Scenario Outline:Add insurance Medicare
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationSpence" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Insurance
    And submit Insurance
    Then see 1 validations messages
    Then see the validation message "A payor is required"
    And select Private payor
    And fill member ID
    And fill coverage start "3"
    And fill coverage end "5"
    And fill private insurance data
    And submit Insurance

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Patient  @positive  @create @addAddress @Demo  @19
  Scenario Outline:  Add
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "AutomationSpence" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Adress
    And submit Adress
    Then see 1 validations messages
    Then see the validation message "Type is required"
    And Complete Address section with "Idaho" state and "Work" type
    And complete phone and select "Work" type
    And complete email and select "Work" type
    And submit Adress
    Then see the snackbar message " Address added"





    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @Demo  @daily @bug43 @bug2202 @0501 @0505
  Scenario Outline:  Add condition
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And find "Patient" in the speed dial
    And search result is "visible"
    And see details
    And select "Information" patient tab
    And click on Add Condition
    And submit Condition
    Then see 1 validations messages
    And fill display As
    And complete onset date "1" and abatement date "4"
    And select Clinical Status "Active"
    And submit Condition


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Patient  @positive  @create @addAddress @Demo @inProgress @bug2 @fix
  Scenario Outline:  Add condition
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "patient" tab
    And find "AutomationZulauf" in the speed dial
    And search result is "visible"
    And see details
    And select "Notes" patient tab
    Then user click on Add Note
    And select care program "BHI"
    And Add note title and body
    And sign and publish




    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



