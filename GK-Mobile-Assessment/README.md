# MobileAutomationTesting

# Project name/Introduction:
    => Mobile Automation Testing => App under test [Universal Music Player]

# Installations:
    => To run this project on your machine you will need to install the following tools:
       1.Java version: 11.0.1 JDK
       2 Maven : Apache Maven 3.6.3
       3.Appium version: 1.0.2
       4.Android studio version: 11.0
       5. IntelliJ community version 2020.1
       5.Git

# How to Run/Execute the tests:
     => Start up appium server
     => Start up android studio, start the virtual device under virtual device manager.
     => Assuming you already installed the APK app 'Universal Music Player'.
     => Before running the appium script click on menu button from the device emulator to activate the app
        and the name of the app will display from top and the title 'Genres'. 
     => As soon you have launched you android device emulator and your appium server is running and pointing
        to your local URL, then open your project using IntelliJ.
     => Open your test class under src/test/java/AppiumAutomationTest/UniversalMusicPlayerTest
     => Then right click and run the test
     => Make sure your device emulator is visible to see the test as it runs.
     => When the test has ran successful it will click 'Genres' title and select the genre music then
        select the song and it will play then pause the song.
     => Then the test will be done to execute and if there is any error the test will fail and display
        the exception caused the test to fail, otherwise the test has passed. 

# Troubleshooting:
     => If the test fails to execute, please make sure you started appium server and point it to your local URL
        and to see the test execution make sure you started the android device emulator to see the test as it
        executes.

# Requirements:
     => app APK
     =>Appium

