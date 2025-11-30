# Environment Setup & JVM Understanding

### Setup Documentation

#### Install JDK and configure development environment



1. Download JDK Installation file from the official website(Oracle)

![Official Download Jdk from Oracle](images/jdk_install_step1.png)

2. Install JDK in the system

    ![start installation](images/step2.png)

3. Select Installation directory and click next

    ![select installation directory](images/step3.png) 

4. Java installed succesfully

![installed successfully](images/step4.png)

5. Open System properties -> go to the environment variables -> system variables -> edit Path -> add our java installed path
   System variable path is updated automatically during the installation - no need to update separately

    ![environment variables](images/step5.png)

6. Java is installed successfully, check java installed or not in command prompt 

    ![installed successfully](images/step6.png)

7. Run an hello world program

    ![Hello World](images/helloworld.png)

javac - It is an utility program provided by java to do compilation - convertion of high level language to byte code(Intermediary code) - the byte code is understood by JVM.

java - program used to run the java code - convertion of byte code to machine code(Instructions)

JDK(java development kit) 
 - JRE + Library files  
 - JVM + development tools

 
> Download From : https://www.oracle.com/java/technologies/downloads/

-> Install : JDK 25 is the latest Long-Term Support (LTS)        
-> After Installing close and re-open command prompt and run below command
-> java --version

-> Install IDE (Visual Studio Code - vs code)
   -> Download From : https://code.visualstudio.com/download
   -> After Installing open start menu and search for vs code

-> JVM - JRE - JDK 

    -> JVM - Java Virtual Machine 

        -> Virtual Machine : A logical machine inside a physical machine 

        -> Executes Byte Code 

        -> java Main- invokes jvm to run byte code 

        -> JVM technically converts byte code to machine code 
    
    -> JRE - Java Runtime Environment

        -> Runtime Environment : Providing required infrastructure to run programs / apps 

        -> Providers & Consumers 

        -> Consumers need JRE to run java Applications

        -> NOTE : JRE includes JVM 

    -> JDK - Java Development Kit 

        -> Development Kit : Provides required tools to develop/build programs / apps 

        -> Used by Providers i.e Developers 

        -> NOTE : JDK includes JRE 