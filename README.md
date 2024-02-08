<h2>WordAnalyzer</h2> 
 
Objectives: This first practical work aims to get you familiar with assertions and debugging tools. You will use the debugger that is a part of Apache NetBeans. It will also help you develop an understanding of the concept of logging and practice the use of logging statements.

Preparation for this lab:
Download the source files WordAnalyzer.java, WordAnalyzerTester1.java, WordAnalyzerTester2.java, and WordAnalyzerTester3.java from blackboard. The WordAnalyzerTester programs simply test WordAnalyzer class. Import these files into a new project.



<h1>Exercise 1: Using assertions.</h1>
<ol><p>The WordAnalyzerTester1 class tests firstRepeatedCharacter method that is part of WordAnalyzer class. This method returns the first repeated character in a word in adjacent positions, such as o in roommate, but it contains a bug</p></ol>
<il>Without running the program, predict the output assuming the firstRepeatedCharacter method works correctly.</il>	
<il>Run the program. What output do you get?</il>
<li>In theory, there are two different exceptions that can be thrown in the call at line 26 [word.charAt(i + 1)]. What are they?</li>
<li>Explain the nature of the bug, and how to fix it.</li> 
<li>What output did you get after you fixed the bug?</li>
<li>Modify WordAnalyzerTester and add a call test(null). Where is an exception thrown? Why not in the constructor?</li>
<li>Add an assertion to the WordAnalyzer constructor: [assert aWord != null;]</li>
<P>  Note: Assertions are disabled by default. Add the -ea option to VM options to enable them. Run > Set Project Configuration > Customize.
Run the modified WordAnalyzerTester (the version with the assert statement). What is the stack trace now? Why is that more helpful?
Note: Using assertions does not fix your bugs. It simply gives a more accurate report about the causes of errors.</P>



<h2>Exercise 2: Using a debugger.</h2>
<ol><p>The WordAnalyzerTester2 class tests countRepeatedCharacters method that is part of WordAnalyzer class. This method counts the groups of repeated characters. For example, the word mississippiii has a count of 4. However, the method contains a bug.</p></ol>
<li>Run WordAnalyzerTester2. What output do you get? Does it always yield the expected result?</li>
<li>Set a breakpoint at the method call that does not yield the expected result and launch the debugger.</li>
<li>Execute the "Step Into" command and try to find and fix the bug. What is the code of your countRepeatedCharacters method now??</li>
<li>Run WordAnalyzerTester2 again. What is the output now??</li>




<h3>Exercise 3: Using logging statements.<h3>
<ol><p>The WordAnalyzerTester3 class tests firstMultipleCharacter method that is part of WordAnalyzer class. This method returns the first multiple occurring character in a word in adjacent positions, such as i in missisippi, but it contains a bug.</p></ol>
<li>Which input to the firstMultipleCharacter method does not yield the expected result??</li>
<li>Use logging to find the problem. Add appropriate logging statements at appropriate places of the find method. What is the code of your find method??</li>
<li>What output do you get when you run the WordAnalyzerTester3 class??</li>
<li>	Look at the logging messages. Explain why the firstMultipleCharacter method does not work.?</li>
<li>You can fix the problem by modifying either the firstMultipleCharacter method or the find method. Fix the problem. What fix did you make?  ?</li>
<li>Run the program again. What output do you get now??</li>
<li>Write your logging statements to an external file. ?</li>
<li>	Now you no longer need the logging messages. Add the appropriate statement to turn them off.?</li>
