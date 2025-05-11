//Mkhize 
//Sbongumusa 
//4323535
//CSC211 _PRAC-2




import java.util.Scanner;

public class HospitalManagementSystem{
		public Node headNode;
		public Node lastNode;
		public void admitPatient(Patient newPatient) {
			Node newNode = new Node(newPatient);
			
			if (headNode == null) {
				headNode = newNode;
				lastNode = newNode;
			}else {
				lastNode.link = newNode;
				lastNode = newNode;
			}
			System.out.println("New patient admitted " + newPatient.getName());
		}
		
		public void admitBefore(Patient newPatient, int patientID) {
			
			Node newNode = new Node(newPatient);
			
			if (headNode == null) {
				
				headNode = newNode;
				lastNode = newNode;
				System.out.println("Patient has been added as first");
				return;
			}
			
			if (headNode.data.getPatientID() == patientID) {
				newNode.link = headNode;
				headNode = newNode;
				System.out.println("Patinet has now been added before the first ");
				//lastNode = newNode;
				return;
			}
			
			Node temp = headNode ;
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
			
			public Patient searchPatient(int patientID) {
				
				if (headNode == null) {
					System.out.println("No patients available");
					return null;
				} 
				
				Node temp = headNode;
				while(temp != null) {
					if (temp.data.getPatientID() == patientID) {
						System.out.println("Patient availabe: " + temp.data.getName());
						return temp.data;
					}
					temp = temp.link;
				}
				
				System.out.println("Patient is not available: " + patientID);
				return null;
		}
		/*	public void dischargePatient(int PatientID) {

				
	
			    if (headNode.data.getPatientID() == PatientID) {
			    	
			        System.out.println(" Patient " + headNode.data.getName() + " discharged.");
			        headNode = headNode.link;
			        
			        if (headNode == null) {
			        	lastNode = null;
			        }
			        return;
			    }
			    Node temp = headNode;
			    
			    if (temp.link != null) {
			    	System.out.println("Patient  has been released: " + temp.link.data.getName());
			    	temp.link = temp.link.link;
			    	
			    	if (temp.link == null) {
			    		lastNode = temp;
			    	}
			    	
			    }else 
			    {
			    	System.out.println("patient is not available " + PatientID );
			    }
			    while(temp.link != null && temp.link.data.getPatientID() != PatientID) {
			    	temp = temp.link;
			    }
			    if (headNode == null) {
			    	System.out.println("Patinets are not available");
			    }
			}*/
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

			    Node temp = headNode;

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
				
				Node temp = headNode;
				System.out.println("Patients currently in the clinic");
				
					while(temp != null) {
						System.out.println("Name: "+ temp.data.getName());
						System.out.println("Age: "+ temp.data.getAge());
						System.out.println("Doctor: "+ temp.data.getDoctor());
						System.out.println("ID: "+ temp.data.getPatientID());
					
						temp= temp.link;
					}
	
			}public void sortRecords() {
				
				Node thisNode = headNode;
				while (thisNode != null) {
					Node nextNode = thisNode.link;
					
					while(nextNode != null) {
						if (thisNode.data.getPatientID() >= nextNode.data.getPatientID()) {
							Patient temp = thisNode.data;
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
				Node currentNode = headNode;
				while (currentNode != null) {
					count ++;
					currentNode = currentNode.link;
					
				}return count;
			}

			public static void main(String[] args) {
			        HospitalManagementSystem hospital = new HospitalManagementSystem();
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

			            	hospital.admitPatient(new Patient(namePatient, AgePatient, doctor, patientID));
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
			            	
			            	hospital.admitPatient(new Patient(namePatient, AgePatient, doctor, patientID));
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
			            	return;
			            	
			            default:
			            	System.out.println("Invalid option entered, please try again");
			            	
			            	//break;
			            	scanner.close();
			            }
			            
			            
			        }
			           
			}
	}