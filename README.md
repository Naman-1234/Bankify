<h1 align="center">Bankify</h1>

# Table of Contents
- Introduction
- Features and Details
- Inspiration
- Problems it solves
- Low Level Design Diagrams
- Glimpse of the Project

## Introduction
- This is a Bank Management System designed by using Programming Approach of Object Oriented Paradigm.
- This uses Java as its Programming Language.
- Java Swing Library is being used to Provide GUI(Graphical User Interface) which is acting as a frontend of the application.
- File Management System is being used to store data.
- Designing of Classes can be illustrated using UML, Class diagrams and Sequential Diagrams. Please find them here.

## Features and Details
User has an option for creating three sorts of bank accounts. Login and Security Features are also added in order to authenticate user.
Details of different bank accounts are as follows:
1. . Current account
It is the type of account in which there is no condition of minimum 
balance and has an interest rate of 0.15% p.a., Functionality provided 
in this are
    - Deposit Money
    - Withdraw Money
    - Add beneficiary
    - Balance Enquiry(Knowing about current balance after adding 
    interest up to the date entered by the user)
    - Close Account
    - Request for necessary items (Like Passbook, Cheque-book, 
    ATM Card)
2. Savings Account
Savings type is a type of account in which there is a condition to 
maintain a minimum balance of 5000 Rupees and interest rate of 
3.5% p.a., so indirectly we can call it to be a superset of current 
account and hence all its features are common to current account just 
with some additional things inside methods, So, functionality provided 
in this are:
    - Deposit Money
    - Withdraw Money
    - Add beneficiary
    - Balance Enquiry (Knowing about current balance after adding 
    interest up to the date entered by the user)
    - Close Account
    - Request for necessary items (Like Passbook, Cheque-book, 
    ATM Card)
3. Fixed Deposit Account
As the name suggests ,it is a type of account in which you have to 
deposit your money for a particular period of time not more than 48 
months and maximum amount that can be deposited is 10,00,000 , 
Criteria chosen for giving interest is that senior citizens are given 
some advantage ,and criteria of a person to be senior citizen is age, 
which is 58 or more for females and 60 or more for males, It also 
have a condition that if a person chooses to premature its FD, then 
there will be 10% deduction from the total amount including interest 
which would have been formed till that date.
Rate of interest table in detailed fashion is given below:
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125191899-6559fa00-e262-11eb-84e5-ad6f424118e4.png" alt="interest table" width="500">
</p>

## Inspiration
- Today transactions are going digital and dependency on cash is decreasing, 
which increases the need of Bank Management System, so that a person doesn’t 
need to go to Bank in order to make transactions. 
- Meeting Today’s demand, if we see the situation, whole world is going through 
a pandemic, hence need of bank system becomes utmost important. 
- Further, according to us Management systems are best in order to implement 
concept of Object-Oriented Programming for beginners, because in management 
systems, concept of inheritance and other concepts like polymorphism is easily 
visible. 

## Problem it solves
Through our System user can: 
- Create an account from anywhere. 
- Close the account from anywhere. 
- Get enquiry of Balance. 
- Add Request for Important things like ATM Card, Passbook etc. 
- Add beneficiary of his/her account. 
- Can add or withdraw money. <br><br>
 Most important thing is we are providing authentication by providing an 
unique id and username, password to user, so that only he/she can access it

## Designing Diagrams: 
Here, All the low level design diagrams are shown, Using them we got a better glimpse of the software system.
1. Use case Diagram:
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192066-6c353c80-e263-11eb-9c17-6917b905e089.jpg" alt="useCase diagram">
</p>

2. Class Diagrams:
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192143-e36ad080-e263-11eb-8867-4769559092a0.jpg" alt="class diagram" >
</p>

3. Activity Diagram
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192152-f1205600-e263-11eb-9370-e47b7fd7bf9c.jpg" alt="activity diagram" >
</p>

4. Sequence Diagram
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192169-13b26f00-e264-11eb-8da2-9f250b005457.jpg" alt="sequence diagram">
<img src="https://user-images.githubusercontent.com/63748249/125192704-def3e700-e266-11eb-8805-2cf09e9cf85d.jpg" alt="sequence diagram">
<img src="https://user-images.githubusercontent.com/63748249/125192714-ec10d600-e266-11eb-9e0c-0d7708941b91.jpg" alt="sequence diagram">
<img src="https://user-images.githubusercontent.com/63748249/125192734-f7fc9800-e266-11eb-90db-5f82ddf38b92.jpg" alt="sequence diagram">
</p>

## Glimpse of the Project
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192810-4316ab00-e267-11eb-970f-25ac1c12639b.jpg" alt="User Interface" width="800">  
</p>
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192824-50cc3080-e267-11eb-9219-d01d470a42a2.jpg" alt="User Interface" width="800">  
</p>
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192820-4b6ee600-e267-11eb-86bc-c9b762d5fcb6.jpg" alt="User Interface" width="800">  
</p>
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192832-5a559880-e267-11eb-9f07-682c155a7905.jpg" alt="User Interface" width="800">  
</p>
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192826-5295f400-e267-11eb-8bdc-711b20b9c245.jpg" alt="User Interface" width="800">  
</p>
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192837-5c1f5c00-e267-11eb-9bd3-645e895a0366.jpg" alt="User Interface" width="800">  
</p>
<p align="center">
<img src="https://user-images.githubusercontent.com/63748249/125192840-5e81b600-e267-11eb-8540-1a20c5627e71.jpg" alt="User Interface" width="800">  
</p>
<!-- ![image-010](https://user-images.githubusercontent.com/63748249/125192810-4316ab00-e267-11eb-970f-25ac1c12639b.jpg)
![image-007](https://user-images.githubusercontent.com/63748249/125192824-50cc3080-e267-11eb-9219-d01d470a42a2.jpg)
![image-008](https://user-images.githubusercontent.com/63748249/125192820-4b6ee600-e267-11eb-86bc-c9b762d5fcb6.jpg)
![image-009](https://user-images.githubusercontent.com/63748249/125192832-5a559880-e267-11eb-9f07-682c155a7905.jpg)
![image-011](https://user-images.githubusercontent.com/63748249/125192826-5295f400-e267-11eb-8bdc-711b20b9c245.jpg)
![image-012](https://user-images.githubusercontent.com/63748249/125192837-5c1f5c00-e267-11eb-9bd3-645e895a0366.jpg)
![image-013](https://user-images.githubusercontent.com/63748249/125192840-5e81b600-e267-11eb-8540-1a20c5627e71.jpg) -->
