# lab3
>OOP Lab2. Racovcena Irina. FAF-212

## Hotel Simulation
In this laboratory work I've tried to implement Inheritance which is one of the OOP principles. Next below you can see the diagram of all my classes and their relations:

![Blank diagram](https://user-images.githubusercontent.com/113358365/193716474-949521f0-4d72-4e3d-833f-5d02ff10c574.png)


As you can see, I have a root class `Guest` where all the children classes come from.

Let's start with the class `Room` which inherits from `Guest`. This class has methods `av_room()` and `index()` which are needed for the class `Manager`. It will need them in order to get availbable room and their indexes. Class `Manager` has children itself. It will transmit them methods `giveTips()` and `need_help()`. So, the manager will be able to count the bill and find out, if the guest struggles with his heavy bags.

The second branch from the root class class leads to class `Check`. It has 2 children where we check if the guest likes his room. Children inherit from their parent methods `check_answer()` and `check_cleaned()` which are going to be generated randomly. Depending on the answers, we'll try to find a solution which will make our guest happy. If the guest remains unsatisfied, he will leave a bad review about our hotel. Hence, we'll need the class `Complaint`.


The third branch is dedicated to all the services our guest might get a need in. There are 4 classes such as `Repair`, `Medical`, `Souvenir` and `Taxi` which inherit methods the following methods: `check_isIll()`, `check_trip()`, `check_wants()`, `check_isBroken()`, `check_before()`. All of these methods help us to understand what the guests demands.
