Feature:  baidu Search
  Open baidu and search

  @TestngScenario
  Scenario:  baidu search selenium
    Given Go to Baidu
    When I find baidu logo
    And type the search text "selenium"
    And click the submit
    Then wait the query result
