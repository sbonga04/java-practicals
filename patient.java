//Mkhize 
//Sbongumusa 
//4323535
//CSC211 _PRAC-2

public class Patient{
		String name;
		int age;
		String doctor;
		int patientID;
		
		public Patient(String name,int age,String doctor,int PatientID) {
			this.name = name;
			this.age = age;
			this.doctor = doctor;
			this.patientID = PatientID;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setDoctor(String doctor) {
			this.doctor = doctor;
		}
		public void setPatientID(int patientID) {
			this.patientID = patientID;
		}
		public String getName() {
			return name;
		}
		public int getAge() {
			return age;
		}
		public String getDoctor() {
			return doctor;
		}
		public int getPatientID() {
			return patientID;
		}
		
		/*static class Node {
			Patient patient;
			Node next;
			
			public void setPatient(Patient patient) {
				this.patient = patient;
			}
			public void setNext(Node next) {
				this.next = next;
			}
			public Patient getPatient() {
				return patient;
			}
			public Node getNext() {
				return next;
			}*/
		
	}
