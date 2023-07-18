package com.example;
    class Priv_access{
        private   int idd;
         private String namee;
            String lastName;
            void getDetails(){
//            	System.out.println(id);
//            	System.out.println(name);
            }
            // getter and setter
            void getId() {
            	System.out.println(idd);
            }
            void getNamee() {
            	System.out.println(namee);
            }
            int setId(int i) {
            	this.idd=i;
            	return idd;
            }
            String setNamee(String n) {
            	this.namee=n;
            	return namee;
            }
            void getLastname() {
            	System.out.println(lastName);
            }
            
    }
    

public class Private_access_Modifier {
         
	public static void main(String[] args) {
		Priv_access person1=new Priv_access();
		person1.lastName="yadav";
//		person1.name="lokindraaa";
//       person1.getDetails();
		person1.setId(45);
		person1.setNamee("lokii");
		person1.getId();
		person1.getNamee();
		person1.getLastname();
	}

}
