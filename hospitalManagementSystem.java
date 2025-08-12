//Mkhize
//Sbongumusa 
//4323535
//CSC211 _PRAC-2


import java.util.Scanner;

public class hospitalManagementSystem{
		public node headNode;
		public node lastNode;
		public void admitPatient(patient newPatient) {
			node newNode = new node(newPatient);

			if (headNode == null) {
				headNode = newNode;
				lastNode = newNode;
			}else {
				lastNode.link = newNode;
				lastNode = newNode;
			}
			System.out.println("New patient admitted " + newPatient.getName());
		}
		
		public void admitBefore(patient newPatient, int patientID) {
			
			node newNode = new node(newPatient);
			
			if (headNode == null) {
				
				headNode = newNode;
				lastNode = newNode;
				System.out.println("Patient has been added as first");
				return;
			}
			
			if (headNode.data.getPatientID() == patientID) {
				newNode.link = headNode;
				headNode = newNode;
				System.out.println("Patient has now been added before the first ");
				//lastNode = newNode;
				return;
			}
			
			node temp = headNode ;
			while (temp.link != null && temp.link.data.getPatientID() != patientID) {
				temp = temp.link;	
				
			}
			if (temp.link != null) {
				newNode.link = temp.link;
				temp.link = newNode;
				System.out.println("patient added on the patientID: "+ patientID);
				
			}else	{
				System.out.println("Patient with ID: " + patientID + " Not found ");
			}
		}
			
			public void searchPatient(int patientID) {
				
				if (headNode == null) {
					System.out.println("No patients available");
					return;
				} 
				
				node temp = headNode;
				while(temp != null) {
					if (temp.data.getPatientID() == patientID) {
						System.out.println("Patient availabe: " + temp.data.getName());
						return;
					}
					temp = temp.link;
				}
				
				System.out.println("Patient is not available: " + patientID);
			}

			public void dischargePatient(int patientID) {
			    if (headNode == null) {
			        System.out.println("No patients available!");
			        return;
			    }

			    if (headNode.data.getPatientID() == patientID) {
			        System.out.println("Patient has been discharged " + headNode.data.getName());
			        headNode = headNode.link;
			        if (headNode == null) {
			            lastNode = null;
			        }
			        return;
			    }

			    node temp = headNode;

			    while (temp.link != null && temp.link.data.getPatientID() != patientID) {
			        temp = temp.link;
			    }

			    if (temp.link == null) {
			        System.out.println("Patient ID not found: " + patientID);
			        return;
			    }

			    System.out.println("Patient has been discharged" + temp.link.data.getName());
			    temp.link = temp.link.link;

			    if (temp.link == null) {
			        lastNode = temp;
			    }
			}

			public void listAll() {
				if (headNode == null) {
					System.out.println("There are no patients.");
					return;
				}
				
				node temp = headNode;
				System.out.println("Patients currently in the clinic");
				
					while(temp != null) {
						System.out.println("Name: "+ temp.data.getName());
						System.out.println("Age: "+ temp.data.getAge());
						System.out.println("Doctor: "+ temp.data.getDoctor());
						System.out.println("ID: "+ temp.data.getPatientID());
					
						temp= temp.link;
					}
	
			}public void sortRecords() {
				
				node thisNode = headNode;
				while (thisNode != null) {
					node nextNode = thisNode.link;
					
					while(nextNode != null) {
						if (thisNode.data.getPatientID() >= nextNode.data.getPatientID()) {
							patient temp = thisNode.data;
							thisNode.data = nextNode.data;
							nextNode.data = temp;
						}
						nextNode = nextNode.link;
					}
					thisNode = thisNode.link;
				}
				System.out.println("Sorted by ID");
			}
			
			public int totalPatients() {
				int count = 0 ;
				node currentNode = headNode;
				while (currentNode != null) {
					count ++;
					currentNode = currentNode.link;
					
				}return count;
			}
			// NOTE:
			// The main method and menu system below were generated with assistance from ChatGPT.
			// I used it to understand how to implement menu-driven programs in Java.
			// The rest of the code was written by me.


			public static void main(String[] args) {
			        hospitalManagementSystem hospital = new hospitalManagementSystem();
			        Scanner scanner = new Scanner(System.in);
			        
			        while (true) {
			            System.out.println("Hospital Management System");
			            System.out.println("1. Admit Patient");
			            System.out.println("2. Admit Patient Before Another");
			            System.out.println("3. Search Patient");
			            System.out.println("4. Discharge Patient");
			            System.out.println("5. List All Patients");
			            System.out.println("6. Sort Records by ID");
			            System.out.println("7. Total Patients");
			            System.out.println("8. Exit");
			            System.out.print("Choose an option: ");
			            
			            int decision= scanner.nextInt();
			            scanner.nextLine();
			            
			            switch(decision) {
			            case 1:
			            	System.out.print("Enter a patient name: ");
			            	String namePatient = scanner.nextLine(); 

			            	System.out.print("Enter the Age: ");
			            	int AgePatient = scanner.nextInt();
			            	scanner.nextLine();
			            	//scanner.nextLine();

			            	System.out.print("Enter the Doctor's name for this patient: ");
			            	String doctor = scanner.nextLine();

			            	System.out.print("Enter the patient ID: ");
			            	int patientID = scanner.nextInt();  

			            	hospital.admitPatient(new patient(namePatient, AgePatient, doctor, patientID));
			            	break;

			            case 2:
			            	System.out.print("Enter a patient name: ");
			            	namePatient = scanner.nextLine();
			            	System.out.print(" Enter the Age:");
			            	AgePatient = scanner.nextInt();
			            	System.out.print(" Enter the Doctor's name for this patient:");
			            	doctor = scanner.nextLine();
			            	System.out.println("Enter the patient ID");
			            	patientID = scanner.nextInt();
			            	
			            	hospital.admitPatient(new patient(namePatient, AgePatient, doctor, patientID));
			            	break;
			            	
			            case 3:
			            	System.out.println("please enter the patientID in order to search");	
			            	patientID = scanner.nextInt();
			            	hospital.searchPatient(patientID);
			            	break;
			            
			            case 4:
			            	System.out.println("Please enter the patientID in order to delete");
			            	patientID = scanner.nextInt();
			            	hospital.dischargePatient(patientID);
			            	break;
			            case 5:
			            	hospital.listAll();
			            	break;
			            case 6:
			            	hospital.sortRecords();
			            	break;
			            case 7:
			            	System.out.println("Total Patients: " + hospital.totalPatients());
			            	break;
			            	
			            case 8:
			            	
			            	System.out.println("Quiting process...");
			            	System.out.println("Thank you for using our Sytem");
							System.out.println("--------------------------------------------------------------");
			            	return;
			            	
			            default:
			            	System.out.println("Invalid option entered, please try again");
			            	
			            	//break;
			            	scanner.close();
			            }
			            
			            
			        }
			           
			}
	}
