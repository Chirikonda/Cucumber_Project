Feature: Login with Valid Credentials

  #@sanity @regression
 Scenario: Successful Login with Valid Credentails
  Given the user navigates to login page
  When user enter email as "dangothu128@gmail.com" and password as "7702938956"
  And the user click on the Login button
  Then the user should be redirected to the MyAccount page
 #@regression
  #Scenario Outline: Login Data Driven
   #Given the user navigates to login page
    #When user enter emails as "<email>" and password as "<password>"
    #And the user click on the Login button
    #Then the user should be redirected to the MyAccount page

    #Examples: 
     # | email                 |  | password   |
      #| dangothu128@gmail.com |  | 7702938956 |
      #| dangothu126@gmail.com |  | 9000014129 |

      
      
     