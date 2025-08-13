Feature: Dial speed bar
  @Organization @Sorting @Demo @daily
  Scenario Outline: Go to organization tab and check organizations sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "organization" tab
    And select name sort "not sorted"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Organization @Sorting @Demo @daily
  Scenario Outline: Go to organization tab and check organizations in ascending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "organization" tab
    And select name sort "ascending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @Demo @daily
  Scenario Outline: Go to organization tab and check organizations descending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "organization" tab
    And select name sort "descending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @Demo
  Scenario Outline: Go to organization tab and check provider sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "provider" tab
    And select name sort "not sorted"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @Demo @daily
  Scenario Outline: Go to organization tab and check provider ascending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "provider" tab
    And select name sort "ascending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @Demo @daily @0501
  Scenario Outline: Go to organization tab and check provider descending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "provider" tab
    And select name sort "descending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @Demo @bug
  Scenario Outline: Go to organization tab and check user sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "user" tab
    And select name sort "not sorted"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @Demo @daily
  Scenario Outline: Go to organization tab and check user ascending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "user" tab
    And select name sort "ascending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @Demo @daily
  Scenario Outline: Go to organization tab and check user descending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then user choose "user" tab
    And select name sort "descending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Organization @Sorting @SortingPatient @Demo @daily
  Scenario Outline: Go to organization tab and check patient descending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And select name sort "descending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @SortingPatient @Demo
  Scenario Outline: Go to organization tab and check patient ascending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And select name sort "ascending"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @SortingPatient @Demo @daily
  Scenario Outline: Go to organization tab and check patient ascending sorting
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "patient" tab
    And select name sort "not sorted"


    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @FilterUser @Demo @daily
  Scenario Outline: Go to user tab and filter organization
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "user" tab
    And filter "testORGnew" with "duplicated" filter active
    And search result is "visible"



    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|
  @Organization @Sorting @FilterUser @Demo @eliminated
  Scenario Outline: Go to user tab and filter program
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "user" tab
    And filter "program" with "PCR" filter active
    And search result is "visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Organization @Sorting @FilterUser @Demo @daily
  Scenario Outline: Go to user tab and filter role
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "user" tab
    And filter "role" with "PATIENT" filter active
    Then filter results are "not visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



  @Organization @Sorting @FilterUser @Demo
  Scenario Outline: Go to user tab and filter role
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then click on "user" tab
    And filter "role" with "SYSTEM_ADMIN" filter active
    Then filter results are "visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider @Sorting @FilterProvider @Demo @daily @04202 @bug30
  Scenario Outline: Go to provider tab and filter organization
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "provider" tab
    And filter "organizaiton" with "duplicated" filter active
    Then filter results are "visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider @Sorting @FilterProvider @Demo @daily
  Scenario Outline: Go to provider tab and filter status
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "provider" tab
    And filter "status" with "Active" filter active
    Then filter results are "visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider @Sorting @FilterProvider @Demo @daily
  Scenario Outline: Go to provider tab and filter status
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "provider" tab
    And filter "status" with "Inactive" filter active
    Then filter results are "not visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Provider @Sorting @FilterProvider @Demo @daily
  Scenario Outline: Go to organization tab and filter status
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "provider" tab
    And filter "organization" with "Gab" filter active
    And filter "status" with "Inactive" filter active
    Then filter results are "not visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|

  @Organization @Sorting @FilterOrganization @Demo
  Scenario Outline: Go to organization tab and filter organization
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then click on "organization" tab
    And filter "status" with "Active" filter active
    And filter "type" with "Clinic" filter active
    Then filter results are "visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Organization @Sorting @FilterOrganization @Demo @daily
  Scenario Outline: Go to provider tab and filter type
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "organization" tab
    And filter "status" with "Inactive" filter active
    And filter "type" with "Clinic" filter active
    Then filter results are "visible"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|


  @Organization @Sorting @checkCount
  Scenario Outline: Go to all tabs and check count
    Given User launch the URL '<URL>' successfully
    And user enter username '<userid>' and password '<password>'
    And click on login button
    And user choose one organization '<ORG>'
    Then user choose "Directory" tab
    Then click on "organization" tab
    Then "organizations" count is "27"
    Then click on "provider" tab
    Then "providers" count is "47"
    Then click on "user" tab
    Then "users" count is "3"

    Examples:
      | URL       |userid|password|ORG|
      | QA |AdminQAUser|AdminQAPassword|QAOrg|



