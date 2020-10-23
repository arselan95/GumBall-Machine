# GumBall-Machine
Generalization Example by demonstrating Gum ball Machine

<h2>Class Diagram</h2>

![Screenshot](classdiagram.png)

<h4>Generalization</h4><br>
<ul>
  <li>FiftyCentAllCoinMachine, FiftyCentMachine, TwentyFiveCentGumballMachine are all generalized as a GumballMachine</li><br>
  <li>All these 3 classes extend the GumballMachine class.</li><br>
  <li>override the insertMoney(..) all these three classes as per requirement.</li><br>
  </ul><br>
  
  <h4>Test.java program</h4><br>
  <ul>
  <li> Test.java uses the generalized GumballMachine. </li><br>
  <li> Create instances of FiftyCentAllCoinMachine, FiftyCentMachine, TwentyFiveCentGumballMachine here </li><br>
  <li> Call the super constructor of all the classes while creating the instances </li><br>
  <li> Run the app </li><br>

<h2>Output of the application</h2>

<h4>input data</h4>

![Screenshot](input.png)

<ul>
  <li>All three machine have 7 gumballs</li><br>
  <li>insertmoney()shows the amount of money inserted</li><br>
  <li>System is updated by relevant print statements as per coins inserted and also keeps count of gumballs</li><br>
  </ul>

<h4>output</h4>

![Screenshot](output.png)



