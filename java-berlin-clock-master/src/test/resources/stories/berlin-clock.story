Story: The Berlin Clock

Meta:
@scope interview

Narrative:
    As a clock enthusiast
    I want to tell the time using the Berlin Clock
    So that I can increase then number of ways that I can read the time
    
    
Scenario: Invalid Input-Format is not correct
When the time is 00:00:000
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00:00:0
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00-00-00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00:00-00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00-00:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00 00 00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00a00a00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00800800
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is aa:00:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00:bb:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00:00:cc
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is ##:00:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00:$$:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO


Scenario: Invalid Input-Format is not correct
When the time is 00:00:@@
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO


Scenario: Invalid Input-Format is not correct
When the time is #4:00:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00:3#:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is 00:00:7&
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO


Scenario: Invalid Input-Format is not correct
When the time is hj:&9 9:
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Format is not correct
When the time is h$
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Invalid time
When the time is 25:00:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Invalid time
When the time is 00:61:00
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Invalid time
When the time is 00:00:99
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Invalid Input-Invalid time
When the time is 25:60:60
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO


Scenario: Just after Midnight
When the time is 00:00:02
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Just after Midnight
When the time is 00:00:01
Then the clock should look like
O
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Early Morning
When the time is 05:00:00
Then the clock should look like
Y
ROOO
OOOO
OOOOOOOOOOO
OOOO


Scenario: Night
When the time is 21:00:00
Then the clock should look like
Y
RRRR
ROOO
OOOOOOOOOOO
OOOO

Scenario: Night
When the time is 20:00:00
Then the clock should look like
Y
RRRR
OOOO
OOOOOOOOOOO
OOOO

Scenario: Night
When the time is 02:00:00
Then the clock should look like
Y
OOOO
RROO
OOOOOOOOOOO
OOOO

Scenario: Night
When the time is 01:13:01
Then the clock should look like
O
OOOO
ROOO
YYOOOOOOOOO
YYYO

Scenario: Night
When the time is 01:47:01
Then the clock should look like
O
OOOO
ROOO
YYRYYRYYROO
YYOO

Scenario: Afternoon
When the time is 14:23:00
Then the clock should look like
Y
RROO
RRRR
YYRYOOOOOOO
YYYO


Scenario: Afternoon
When the time is 14:02:02
Then the clock should look like
Y
RROO
RRRR
OOOOOOOOOOO
YYOO

Scenario: Afternoon
When the time is 13:59:57
Then the clock should look like
O
RROO
RRRO
YYRYYRYYRYY
YYYY

Scenario: Evening
When the time is 18:59:53
Then the clock should look like
O
RRRO
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 00:00:00
Then the clock should look like
Y
OOOO
OOOO
OOOOOOOOOOO
OOOO

Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like
O
RROO
RRRO
YYROOOOOOOO
YYOO

Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like
O
RRRR
RRRO
YYRYYRYYRYY
YYYY

Scenario: Midnight
When the time is 24:00:00
Then the clock should look like
Y
RRRR
RRRR
OOOOOOOOOOO
OOOO
