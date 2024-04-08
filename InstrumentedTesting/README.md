# Running Espresso Tests in Android Studio
This guide will walk you through the process of running Espresso tests using Android Studio. Espresso is a testing framework for Android that makes it easy to write reliable user interface tests. Follow these steps to set up and run Espresso tests in your Android project.

# Prerequisites
- Android Studio 3.4 or later installed on your machine.
- Basic familiarity with Android development and Gradle build system.
  
# Setup Instructions
1. Clone the Project:

- Download the project code, preferably using git clone.

2. Import Project into Android Studio:

- Open Android Studio.
- Select File | Open... and navigate to the root directory of the project.
- Choose the ./build.gradle file and click Open.

3. Explore Project Structure:

- The application under test is located in src/main/java.
- Instrumentation Tests are in src/androidTest/java.
- Local Tests are in src/test/java.

4. Configure Instrumented Test:

- Open the Run menu and select Edit Configurations.
- Add a new Android Instrumented Tests configuration.
- Choose the app module.
- Connect a physical device or start an emulator.
- Disable animations on the device:
   - Go to Settings -> Developer options.
   - Disable "Window animation scale", "Transition animation scale", and "Animator duration scale".
- Run the newly created configuration.

5. Run Local Test Configuration:

- Open the Run menu and select Edit Configurations.
- Add a new Android JUnit configuration.
- Set Use classpath of module to app.
- Set Class to ChangeTextBehaviorLocalTest.
- Run the configuration.
  
# Viewing Test Results
- If you are using Android Studio, the Run window will display the test results.

# Additional Notes
- Make sure your project is configured correctly with the necessary dependencies for Espresso testing.
- Write your Espresso tests in the src/androidTest/java directory.
- Use the provided sample tests as a reference for writing your own tests.
  
By following these steps, you can effectively run Espresso tests in Android Studio to ensure the quality and reliability of your Android applications.
