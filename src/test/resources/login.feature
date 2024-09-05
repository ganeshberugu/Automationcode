Feature:xx
Scenario Outline: Test
Given go to swag labs
And enter the "<username>" and "<password>"
Then click on enter


Examples:
|username|  |password|
|locked_out_user| |secret_sauce|
| standard_user |  |secret_sauce|
    