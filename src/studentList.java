

public class studentList {
    public static void main(String[] args){
        Student[] studentList = new Student[4];
        studentList[0]  = new Student("s1", "Robby");
        studentList[1]  = new Student("s2", "Fahad");
        studentList[2]  = new Student("s3", "Hillary");
        studentList[3]  = new Student("s4", "Rachel");
        
        for(int i=0; i < studentList.length; i++){
            System.out.println(studentList[i].getStudentName());
        }
    }
}
