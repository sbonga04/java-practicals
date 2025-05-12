#ProlemToSolve 
Question 2: Singly Linked List [30] 

You are required to program in Java and use object-oriented programming 
concepts. Do not use built-in java methods for your tasks: write your own 
code. 
Scenario: 
Suppose you are an administrator at a small-town hospital, and you need a 
program to help you manage patient records. Each patient has a unique 4-digit 
patient ID, and you want to use a linked list to store and manage patient 
records.

Question 2.1 
1. Create a class called Patient with the following attributes/variables:  
a. String name – Name of the patient  
b. int age – Age of the patient   
c. String doctor – Doctor attending/attended to the patient  
d. int patientID – Unique 4 digit patient ID of the patient 
2. Create the necessary methods for the above attributes/variables: 
a. get methods – Accessor method for the variable  
b. set methods – Mutator method for the variable  
c. toString method – String representation of the object  

Question 2.2 
1. Create a class called Node with the following attributes/variables: 
a. Patient patient – Patient object that is stored inside the Node 
object 
b. Node nextNode – Node object that is used to reference/point to 
the next Node object 
2. Create the necessary methods for the above attributes/variables: 
a. get methods – Accessor method for the variable  
b. set methods – Mutator method for the variable 
c. toString method – String representation of the object 

Question 2.3 
Create a class called HospitalManagementSystem with the following 
attributes/variables and methods: 
● Attributes: 
a. Node headNode – Contains the reference/pointer of the first 
Node object 
● Methods: 
1. Implement a function admitPatient(Patient newPatient) to add 
a patient at the end of the linked list. 
a. Ask the administrator to input all the necessary patient 
information. 
b. Use the information to create a Patient object 
c. Pass through the Patient object as the parameter to the 
function 
d. Store the Patient object into the Node object  
e. “Link” the object with the rest of the linked list 

2. Implement a function admitBefore(Patient newPatient, int 
patientID) to add a patient in front of another patient given its 
patientID. 
a. Ask the administrator to input all the necessary patient 
information. 
b. Use the information to create a Patient object 
c. Pass through the Patient object and patientID as the 
parameter to the function 
d. Search for the matching Patient object 
e. Store the Patient object into the Node object 
f. 
“Link” the object with the rest of the linked list 

3. Implement a function searchPatient(int patientID) to search 
for a patient by its patientID and return the patient object. 
a. Ask the administrator to input the patientID. 
b. If the patient doesn’t exist display an appropriate 
message. 

4. Implement a function dischargePatient(int patientID) to 
remove a patient from the linked list by its patientID code. 
a. If the patient doesn’t exist, please display an appropriate 
message. 

5. Implement a function listAllPatients() to display all the 
patients in the linked list. 
a. If there are no patients, please display an appropriate 
message 

6. Implement a function sortRecords() to sort all the patients in 
the linked list by its patientID code ascendingly. 

7. Implement a function totalPatients() to count the total amount 
of patients in the linked list and return it. 
Driver Code 
Write a main method inside the HospitalManagementSystem class, create a 
menu system that allows the Administrator input commands to interact with the 
system. Below is the menu system that students should aim to recreate. Give an 
appropriate message after each action to notify the Administrator if an action 
was successful. Make use of the toString() to print the Patient objects. 
Sample Input 
Welcome to the new Hospital Management System 
Admit patient 
Admit patient before a specific patient ID 
Search patient by patient ID 
Discharge patient by patient ID 
List all patients 
Sort patients by patient ID 
Count total patients 
Exit 
Enter your choice: 
Sample Output 
John Doe has been admitted to the hospital. 
Jane Smith has been admitted to the hospital. 
Alice Johnson has been admitted to the hospital. 
All patients in the hospital: 
Patient: John Doe (treated by Dr. Brown, Patient ID: 1234) 
Patient: Jane Smith (treated by Dr. Adams, Patient ID: 5678) 
Patient: Alice Johnson (treated by Dr. Williams, Patient ID: 9101) 
Total number of patients in the hospital: 3 
Patient found: Patient: Jane Smith (treated by Dr. Adams, Patient ID: 5678) 
Patient discharged: Patient: Jane Smith (treated by Dr. Adams, Patient ID: 5678) 
All patients in the hospital: 
Patient: Alice Johnson (treated by Dr. Williams, Patient ID: 9101) 
Patient: John Doe (treated by Dr. Brown, Patient ID: 1234) 
All patients in the hospital after sorting: 
Patient: John Doe (treated by Dr. Brown, Patient ID: 1234) 
Patient: Alice Johnson (treated by Dr. Williams, Patient ID: 9101)
