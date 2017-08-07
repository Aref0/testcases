# testcases

Testcses to test the returned Movies list according to some sorting criteria
========================================================
the technologies used to build this tests:

1. Java 1.8
2. Selenium 3.4.0
3. log4j-api 2.8.2
4. testng 6.10
5. geckodriver 1.17
5. Firefox 54.0 (32-bit)
6. OS Linux Ubuntu i686 (32-bit)
7. netbeans 8.2

========================================================

How to run the tests?

1. open the configuration class
2. set the configuration as desired 
3. to run the test suite run the testng.xml that will run all the tests
--------------------------------------------------------

How the tests work?

1. if you set the autoDetection in the configuration class to "true" 
   - code will find the OS in use and will use the webdriver accordingly 
   - this option is limited to Linux, Mac, and windows 32bit only
   - if you wish to use any other driver with any other operating system or architecture 
     please modify this manually in the configuration class

2. if you left the autoDetection set to "False" as default the driver specified in the configuration class will be used directly and 
code will not find the OS and it's associated webdriver


