Feature: Start page

  @smoke
  Scenario:User should identify successfully if they need UK visa or not.
    Given  User is on Home Page
    When I click startNow Button
    And I select Nationality "Australia"
    And I click next step Button
    And I get result message
    And I select reason for visit "Tourism or visiting family and friends"
    And I click next step Button
    Then I get result message