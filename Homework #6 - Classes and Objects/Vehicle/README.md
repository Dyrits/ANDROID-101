# Vehicle

## Table of contents
- [Related content](#related-content)
- [General information](#general-information)
- [Technologies](#technologies)
- [Status](#status)
  - [Features](#features)
  - [To-do](#to-do)
- [Contributing](#contributing)
- [Contact](#contact)

## Related content
**Website:** [Pirple](https://www.pirple.com/)
**Course:** Android 101
**Content:** Kotlin Classes and Objects / Homework #6: Classes and Objects

## General information

### Description by [Pirple](https://www.pirple.com/)

#### Details:
 
Create a class called "Vehicle" and add methods that allow you to set the "Make", "Model", "Year,", and "Weight".

The class should also contain a "NeedsMaintenance" boolean that defaults to False, and and "TripsSinceMaintenance" Integer that defaults to 0.

Next create a subclass that inherits the properties of Vehicle class. Call this new subclass "Cars".

The Cars class should contain a method called "Drive" that sets the state of a boolean isDriving to True.  It should have another method called "Stop" that sets the value of isDriving to false.

Switching isDriving from true to false should increment the "TripsSinceMaintenance" counter. And when TripsSinceMaintenance exceeds 100, then the NeedsMaintenance boolean should be set to true.

Add a "Repair" method to either class that resets the TripsSinceMaintenance to zero, and NeedsMaintenance to false.

Create 3 different cars, using your Cars class, and drive them all a different number of times. Then print out their values for Make, Model, Year, Weight, NeedsMaintenance, and TripsSinceMaintenance

#### Extra Credit:

Create a Planes class that is also a subclass of Vehicle. Add methods to the Planes class for Flying and Landing (similar to Driving and Stopping), but different in one respect: Once the NeedsMaintenance boolean gets set to true, any attempt at flight should be rejected (return false), and an error message should be printed saying that the plane can't fly until it's repaired.

## Technologies
- Kotlin
- Android Studio

## Status
Homework (1.0) completed the 19/11/2020.

### Features
All the required features (as described in [General information](#general-information)) have been implemented.

### To-do
The homework, if approved, will not be reworked.

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
Please make sure to update tests as appropriate (if any).

## Contact
Created by [Dylan J. Gerrits](https://github.com/Dyrits).
