Feature: Search a flight
  Scenario: search flight based on fastest and cheap price
    Given Launch Browser
    When  Launch flights homepage
    When I input source flight and destination flight
    And I Click on Search button
    Then Search Results should displayed

