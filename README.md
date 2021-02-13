# mercedes automation test execution

- Check that there is an internet connection

- Download and install browsers
    - Chrome lastest
    - Firefox lastest

- Download chrome and firefox drivers and give permission for both to execute in the machine
    - chromedriver: https://chromedriver.chromium.org/
    - firefox: https://github.com/mozilla/geckodriver/releases

Add the chrome driver and firefox driver to the system path
    - Place the chromedriver/geckodriver file in the desired folder
    "/usr/local/bin/chromedriver" and "/usr/local/bin/geckodriver"
     

- Download and configure maven
    - Maven url: https://maven.apache.org/download.cgi
    
- To run the test on a browser other than chrome, make a change to the class: Config.class.
Comment out the lines containing the Chrome information and remove the uncomment where the chrome information contains.

- At the end of the run, the prints are generated inside the project folder.

- A texts.txt file will be generated with the result of the highest value and the lowest value of the cars listed.

