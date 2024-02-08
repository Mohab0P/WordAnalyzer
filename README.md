# WordAnalyzer
 
Objectives: This first practical work aims to get you familiar with assertions and debugging tools. You will use the debugger that is a part of Apache NetBeans. It will also help you develop an understanding of the concept of logging and practice the use of logging statements.

Preparation for this lab:
Download the source files WordAnalyzer.java, WordAnalyzerTester1.java, WordAnalyzerTester2.java, and WordAnalyzerTester3.java from blackboard. The WordAnalyzerTester programs simply test WordAnalyzer class. Import these files into a new project.



Exercise 1: Using assertions. 
The WordAnalyzerTester1 class tests firstRepeatedCharacter method that is part of WordAnalyzer class. This method returns the first repeated character in a word in adjacent positions, such as o in roommate, but it contains a bug.
	Without running the program, predict the output assuming the firstRepeatedCharacter method works correctly.
	Run the program. What output do you get?
	In theory, there are two different exceptions that can be thrown in the call at line 26 [word.charAt(i + 1)]. What are they?  
	Explain the nature of the bug, and how to fix it. 
	What output did you get after you fixed the bug?
	Modify WordAnalyzerTester and add a call test(null). Where is an exception thrown? Why not in the constructor?
	Add an assertion to the WordAnalyzer constructor: [assert aWord != null;]
Note: Assertions are disabled by default. Add the -ea option to VM options to enable them. Run > Set Project Configuration > Customize.
	Run the modified WordAnalyzerTester (the version with the assert statement). What is the stack trace now? Why is that more helpful?
Note: Using assertions does not fix your bugs. It simply gives a more accurate report about the causes of errors.



Exercise 2: Using a debugger.
The WordAnalyzerTester2 class tests countRepeatedCharacters method that is part of WordAnalyzer class. This method counts the groups of repeated characters. For example, the word mississippiii has a count of 4. However, the method contains a bug.
	Run WordAnalyzerTester2. What output do you get? Does it always yield the expected result?
	Set a breakpoint at the method call that does not yield the expected result and launch the debugger.
	Execute the "Step Into" command and try to find and fix the bug. What is the code of your countRepeatedCharacters method now?
	Run WordAnalyzerTester2 again. What is the output now?




Exercise 3: Using logging statements.
The WordAnalyzerTester3 class tests firstMultipleCharacter method that is part of WordAnalyzer class. This method returns the first multiple occurring character in a word in adjacent positions, such as i in missisippi, but it contains a bug.
	Which input to the firstMultipleCharacter method does not yield the expected result?
	Use logging to find the problem. Add appropriate logging statements at appropriate places of the find method. What is the code of your find method?
	What output do you get when you run the WordAnalyzerTester3 class?
	Look at the logging messages. Explain why the firstMultipleCharacter method does not work.
	You can fix the problem by modifying either the firstMultipleCharacter method or the find method. Fix the problem. What fix did you make?  
	Run the program again. What output do you get now?
	Write your logging statements to an external file. 
	Now you no longer need the logging messages. Add the appropriate statement to turn them off.
