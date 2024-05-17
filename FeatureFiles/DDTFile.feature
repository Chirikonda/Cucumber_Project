Feature: Login data driven test   with Excel

  Scenario Outline: Login Data Driven Excel
    Given user navigates to login page
    Then the user should be navigates to MyAccountPage  by passing email and password with excel row "<row_index>"

    Examples: 
     |row_index|
     |        1|
     |        2|
     |        3|
     |        4| 
    
    
    
    
    