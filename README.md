# SAT Language Documentation

This is a procedural programming language with C-like syntax. 
The lexical analysis and parsing is done using ANTLR4.
The parser trees generated from ANTLR4 is converted to intermediate byte code using our java class named SAT
The intermediate code is passed to runtime which is written in python to give the output.

**Compilation and Execution**

 1. cd `Code/SAT source code/`
 2. Run the **SAT.jar** using command: `java -jar SAT.jar <input_filename>`
 3. The `<input_filename>` is any **.sat** file in the current directory
 4. The intermediate code is generated in file named **OutputProgram.in** in current directory.
 5. cd `../../Runtime`
 6. Run the intermediate code using command: `python Runtime.py <path/to/OutputProgram.in>`
 7. This will give output for selected program
 > For example:

     SAT/> cd Code/SAT source code/
     src/Code/SAT source code/> java -jar SAT.jar factorial.sat
     src/Code/SAT source code/> cd ../../Runtime
     src/Runtime/> python Runtime.py ../Code/SAT source code/OutputProgram.in

# Video Link:
https://www.youtube.com/watch?v=VFO9jLPibuA

#Github Link:
https://github.com/shahsyedzafar/prog_lang_paradigms

# Team Members
1. Tharun Niranjan Gomudurai Pandian, 1209335331
2. Anoop Jatavallabha Vijayakumar, 1209224753
3. Syed Zafar Shah, 1209356222
