# Infection Tracker AtB
This is a infection-tracking application for bus-users in Trondeheim, specifically those who use buses connecting at Prinsens Gate or Kongens Gate.

## Installation

To install, follow these steps:

### 1. Follow Hallvard's Eclipse setup

Start with Eclipse (2020-06 or 2020-09) for Java and DSL developers, and install the following features on top, using the `Help > Install New Software...` dialog.

From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category checked:
* Acceleo - model to text transformation (M2T) and OCL interpreter view
* Ecore Diagram Editor (SDK) - editor for ecore models as diagram
* EMF Forms SDK - forms for ecore models
* Sirius Specifier Environment - diagram-based DSL framework
* Sirius Properties Views - Specifier Support
* Mylyn WikiText - editor for various wiki markup formats, including markdown

From the standard software site (select Eclipse 2020-06 in drop-down) and with Group Items by Category un-checked:
* Acceleo Query SDK - OCL implementation

### 2. Download and import the project
Download/clone the repository, and open this (the `project`-)folder in Eclipse.

### 3. Fetch fresh data from the bartebuss-API, and install the data
We use [Bartebuss](https://bartebuss.no)'s API to get sorted, realtime data about public transport in Trondheim. 

To fetch fresh data, open and run `atb.model.import/src/core/Setup.java`'s main-method. This will create a new `data.xmi`-file in the same folder. 
Move this file into the `atb.diagram.examples.v2`-package root folder, and open `representations.aird`. 
Add a new model instance by clicking the Add-button in the left part, and selecting the `data.xmi`-file. 
(We've experienced that this sometimes does nothing, but retrying once or twice usually does the trick.)

### 4. Run the application

#### Getting started
Run a new Eclipse instance from the run-menu. 
Import the packages `atb.diagram.examples.v2` and `atb.diagram.v2` into the package explorer, and open `representations.aird` from the aforementioned `examples`-package.

Create a new atb-diagram, by double clicking `atb-diagram` and selecting `Container` as the root node for the diagram. 
This will initialize the diagram, and might take a while (the xmi-file might be over 400 000 lines long).

#### Maneuvering the diagram
We recommend having the outline-view open in another pane in Eclipse, to help navigation within the enormous graph. 
It is also possible to search for bus stops by clicking `Ctrl+O`, and typing in the name of the bus stop.

Fun fact, the graph is a sort of map, due to the nodes being connected if they are neighbours in a bus line. It sure doesn't look like Trondheim, though. 

#### Creating a registration
To create a registration, you must select where they boarded the bus, by double clicking the green bus-stop box. 
When prompted to create a `new DepartureDiagram`, click `OK`. This will open a diagram showing the departures from this bus-stop. 
To select the departure you were on, simply double click the departure-time, and click `OK` in the next prompt as well.
The next diagram shows all the stops on the selected bus line, and you must now select the stop where you got off the bus. 
  > «Same procedure as every year, James.» -Miss Sophie

This final diagram shows all the travel-registrations for the selected bus-trip (a trip is a bus' travel on a line, from the line's start, to its end).

To add another, simply drag from the menu on the right a `new Registration`, and drop it onto the box in the diagram. This creates a new registration, which you can click once to select, then once more to edit. The input must be formatted as `<NAME NAMESON>:<PHONE NUMBER>` to register correctly. 







