The WeatherApp is an intuitive Android application designed to provide users with a comprehensive view of weekly weather conditions, including the average temperatures and detailed daily forecasts. The app features a clean and user-friendly interface with three primary screens. The main screen displays the average minimum and maximum temperatures for the week, calculated using an array of daily weather data. Users can navigate to a detailed view screen to see specific weather conditions for each day, including temperatures and weather descriptions. The design process involved creating a structured data model to store the weather information, implementing parallel arrays for efficient data management, and using loops to calculate the average temperatures. Key functionalities include buttons for viewing detailed daily data, clearing input data, and exiting the app. Navigation between screens is smooth and intuitive, ensuring a seamless user experience. The app also includes error handling to provide constructive feedback if incorrect data is entered. The development process focused on clear and concise code with meaningful comments, ensuring maintainability and readability. The user interface design prioritized clarity and ease of use, resulting in a well-rounded, functional weather application.

WeatherApp: Comprehensive Report
Purpose of the App
The WeatherApp is developed to provide users with a detailed overview of weekly weather conditions, including daily forecasts and average temperatures. The primary objectives are to:

Display the average minimum and maximum temperatures for the week.
Allow users to view detailed weather information for each day.
Enable users to clear and re-input weather data if necessary.
Provide a user-friendly and intuitive interface for seamless navigation and data presentation.
This app serves as a valuable tool for individuals who need quick access to weekly weather forecasts, ensuring they can plan their activities accordingly.

Design Considerations
User Interface
The user interface is designed to be clean, simple, and intuitive, ensuring ease of use for all users. The design includes:

Main Screen: Displays the average temperatures for the week, with buttons to view detailed daily information, clear data, and exit the app.
Detailed View Screen: Shows specific weather data for each day, including minimum and maximum temperatures and weather conditions. It includes a back button to return to the main screen.
Data Management
Data management involves using arrays and loops to handle and process weather data efficiently. Key considerations include:

Parallel Arrays: To store days, minimum temperatures, maximum temperatures, and weather conditions.
Loops: To calculate the average temperatures for the week by iterating over the arrays.
Data Model: Utilizes a Kotlin data class (WeatherData) to encapsulate weather information for each day, enhancing code readability and maintainability.
Navigation
Navigation between screens is designed to be straightforward and intuitive:

Buttons on the main screen direct users to the detailed view screen or allow them to clear data and exit the app.
The detailed view screen includes a back button to return to the main screen.
Error Handling
Error handling ensures the app remains robust and user-friendly:

Validation checks to handle incorrect data inputs.
Providing constructive feedback to users if errors occur during data entry or processing.
Utilization of GitHub and GitHub Actions
GitHub
GitHub is used as the version control system for the WeatherApp project. It offers several benefits:

Version Control: Tracks changes to the codebase, allowing for easy rollback to previous versions if needed.
Collaboration: Facilitates collaboration among team members by allowing multiple contributors to work on the project simultaneously.
Issue Tracking: Helps manage and track bugs, feature requests, and other project-related tasks.
The project repository is structured with clear directory organization, including separate folders for source code, resources, and documentation. Meaningful commit messages ensure that each change is well-documented and easily understandable.

GitHub Actions
GitHub Actions are used to automate workflows, ensuring code quality and streamlining the development process. Key workflows implemented include:

Continuous Integration (CI): Automatically builds and tests the app whenever changes are pushed to the repository. This ensures that the codebase remains in a deployable state and that new changes do not introduce errors.
Automated Testing: Runs unit tests and integration tests to validate the functionality of the app. This helps catch bugs early in the development process.
Code Linting and Formatting: Ensures that the code adheres to defined style guidelines and best practices. This improves code readability and maintainability.

Conclusion
The WeatherApp is a comprehensive tool for managing and viewing weekly weather conditions, designed with user-friendliness and efficiency in mind. The thoughtful design considerations ensure a seamless user experience, while the use of GitHub and GitHub Actions enhances collaboration, code quality, and project maintainability. This approach ensures that the WeatherApp not only meets the current requirements but is also scalable and robust for future enhancements.

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

PSEUDOCODE FOR MAIN SCREEN
0. Start

1. Declarations
   // Array to store temperatures for 7 days
   num temperatures[7] = [0, 0, 0, 0, 0, 0, 0]

   // Array to store maximum temperatures for 7 days
   num maxTemperatures[7] = [0, 0, 0, 0, 0, 0, 0]

   // Array to store minimum temperatures for 7 days
   num minTemperatures[7] = [0, 0, 0, 0, 0, 0, 0]

   // Array to store weather conditions for 7 days
   string weatherConditions[7] = ["", "", "", "", "", "", ""]

   // Array to store EditText references for daily temperatures
   array of EditText editTexts

   // TextView to display average temperature
   TextView averageTextView

   // Button references
   Button buttonCalculate
   Button buttonDetails
   Button buttonClear
   Button buttonExit

2. OnCreate Event
   2.1 Initialize editTexts array with references to the EditText fields
   2.2 Initialize averageTextView with reference to the TextView field

   // Set button click listeners
   2.3 Set OnClickListener for buttonCalculate
       2.3.1 If collectData() returns true Then
           2.3.2 Call calculateAndDisplayAverage()
       2.3.3 EndIf

   2.4 Set OnClickListener for buttonDetails
       2.4.1 Create an Intent to start DetailedViewActivity
       2.4.2 Put temperatures, maxTemperatures, minTemperatures, and weatherConditions arrays into the Intent
       2.4.3 Start DetailedViewActivity with the Intent

   2.5 Set OnClickListener for buttonClear
       2.5.1 Call clearData()

   2.6 Set OnClickListener for buttonExit
       2.6.1 Finish the activity

3. Function collectData() returns Boolean
   3.1 For i = 0 to 6 do
       3.1.1 Get text from editTexts[i] and store in temp
       3.1.2 If temp is empty Then
           3.1.3 Show Toast message "Please fill all fields"
           3.1.4 Return false
       3.1.5 EndIf
       3.1.6 Convert temp to integer and store in temperatures[i]
       3.1.7 Get max temperature and store in maxTemperatures[i]
       3.1.8 Get min temperature and store in minTemperatures[i]
       3.1.9 Get weather condition and store in weatherConditions[i]
   3.2 EndFor
   3.3 Return true

4. Function calculateAndDisplayAverage()
   4.1 Calculate sum of temperatures array
   4.2 Calculate average by dividing sum by the size of temperatures array
   4.3 Set averageTextView text to "Average Temperature: " + average

5. Function clearData()
   5.1 For each editText in editTexts do
       5.1.1 Clear the text in editText
   5.2 EndFor
   5.3 Clear the text in averageTextView

6. Stop

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

PSEUDOCODE FOR DETAILS SCREEN
0. Start

1. Declarations
   // Array to store temperatures for 7 days
   num temperatures[7]

   // Array to store maximum temperatures for 7 days
   num maxTemperatures[7]

   // Array to store minimum temperatures for 7 days
   num minTemperatures[7]

   // Array to store weather conditions for 7 days
   string weatherConditions[7]

   // TextViews to display daily details
   array of TextView dayTextViews
   array of TextView maxTempTextViews
   array of TextView minTempTextViews
   array of TextView conditionTextViews

   // Button to navigate back to main screen
   Button buttonBack

2. OnCreate Event
   2.1 Initialize arrays with data passed from main activity
   2.2 Initialize TextViews with references to the UI elements

   // Display detailed information for each day
   2.3 For i = 0 to 6 do
       2.3.1 Set dayTextViews[i] text to "Day " + (i + 1) + ": " + temperatures[i]
       2.3.2 Set maxTempTextViews[i] text to "Max Temp: " + maxTemperatures[i]
       2.3.3 Set minTempTextViews[i] text to "Min Temp: " + minTemperatures[i]
       2.3.4 Set conditionTextViews[i] text to "Condition: " + weatherConditions[i]
   2.4 EndFor

   // Set button click listener for back button
   2.5 Set OnClickListener for buttonBack
       2.5.1 Finish DetailedViewActivity

3. Stop
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

LOGO : 
The logo that I designed depicts both of the two main seasons of the years, which makes it explicitly known at first glance that this is an app about the weather.
<img width="319" alt="image" src="https://github.com/IIEVCPMB/imad5112-practicum-exam-alaykasuresh/assets/166115296/f2cc60b9-c95c-4015-97d9-2e1ef2b8e583">

SPLASH SCREEN:
The splash screen includes the logo of the weather app called “WEATHER INC.”
My name and student number.
And a button to open to the next page which is known the main page.
<img width="208" alt="image" src="https://github.com/IIEVCPMB/imad5112-practicum-exam-alaykasuresh/assets/166115296/9fe6843f-2970-4aef-b1e7-3289ca4caa41">

MAIN SCREEN :
The main screen has an abundance of design features such as a clear button that clears the previous information, an exit button that takes you back to the home screen, each day of the week is also indicated and a button that calculates the average temperature of the week.
<img width="407" alt="image" src="https://github.com/IIEVCPMB/imad5112-practicum-exam-alaykasuresh/assets/166115296/53cd9732-ef97-453c-8ee8-32e8543fd2cd">


DETAILS SCREEN:
The main screen has an abundance of design features such as a clear button that clears the previous information, an exit button that takes you back to the home screen, each day of the week is also indicated and a button that calculates the average temperature of the week.
<img width="242" alt="image" src="https://github.com/IIEVCPMB/imad5112-practicum-exam-alaykasuresh/assets/166115296/484d5a17-aef0-490a-8cbf-bc8d7fa5c1c7">

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
