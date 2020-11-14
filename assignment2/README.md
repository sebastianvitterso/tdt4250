# Assignment 2

## How to run the code
* Clone the repo (so far so good)
* Open both Assignment1 and Assignment2 in eclipse
* Run `Generate.java` with the current Acceleo Application run configuration:
  * Project: `assignment2` 
  * Main class: `assignment2.main.Generate` 
  * Project: `/assignment1/model/University.xmi` 
  * Project: `/assignment2/target` 
  * Configuration>Runner: `Java application`
* Open `/assignment2/target/NTNU.html`, and see the gorgeous results.


## Structure
Model code is found in assignment1, while acceleo/generating (M2T)-code is found in assignment 2. 

## Changes in assignment 1 model
* Added `opposite`-links to a few items:
  * University-Programme (`inUniversity`)
  * Programme-Semester (`inProgramme`)