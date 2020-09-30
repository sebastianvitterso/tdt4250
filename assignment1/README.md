# Assignment 1

Explanation of repo structure and content.

The model folder contains the ecore file, a genmodel file and the dynamic instance called University.

The src folder contains auto generated code.

### Explanation of non intuitive classes:

* AvailableCourse: Container class for Course, deciding if a course is mandatory in a specific semester.
* OpenSlot: Class to allow not specified courses with certain requirements.

### Example of required content:

* Class: University
* Datatype: CourseCode
* Attributes: Programme -> name
* References ordinary: AvaiableCourse -> course
* References containment: Semester -> availableCourses
* References opposites: Programme -> specializations / Programme -> specializationOf
* Constraint manual: Semester -> semesterNumberMatchesPositionInList
* Constraint OCL: AvailableCourse -> mandatoryAloneInGroup
* Derived feature: Semester -> credits