public class GoodStudentDriver {
    public static void main (String args []){
        GoodStudent studentOne = new GoodStudent("Alan", "Turing", "191254", 3.56, true);
        GoodStudent studenTwo = new GoodStudent("Florance", "NightingGale", "182010",3.89, false);
        GoodStudent studentThree = new GoodStudent("Grace", "Hopper", "190692", 3.99, true);
        //Creates Student ID
        System.out.println("Alan's ID: " +  studentOne.CreateId());
        System.out.println("Florance's ID: " + studenTwo.CreateId());
        System.out.println("Grace's ID: "+studentThree.CreateId());
        //Tells if student's boost for being a CS student
        System.out.println("Alan's GPA: "+ studentOne.CSGPA());
        System.out.println("Florence's GPA: " + studenTwo.CSGPA());
        System.out.println("Grace's GPA: " + studentThree.CSGPA());
        //toString Call for Alan Turing
        System.out.println(studentOne.toString());
        //setters and getters for Florence's ID and GPA
        studenTwo.setIdNumber("95366");
        studenTwo.setGPA(3.92);
        System.out.println("Florences ID: " + studenTwo.getIdNumber() + " and " + "Florence's GPA: " + studenTwo.getGPA());
        //getters for output Grace's First name and CS status
        System.out.println("Grace's First Name: " + studentThree.getFirstName() +" and "+ "CsStatus: "+ studentThree.getcsStudent());
    }
}