package com.epam.mjc;


public class StudentManager {

  private static final long[] IDs = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

  public Student find(long studentID) throws StudentException{
    
    if (studentID > 11 || studentID < 1) {
            throw new StudentManagerException("Could not find student with ID" + studentID);
        }
        return Student.getValueOf(studentID);
  }

  
  public static void main(String[] args) {
    StudentManager manager = new StudentManager();

    for (int i = 0; i < IDs.length; i++) {
            try {
                Student student = manager.find(IDs[i]);
                System.out.println("Student name " + student.getName());
            } catch (StudentException exception) {
                System.out.println(exception);
            }
        }
  }  
}
class StudentException extends IllegalArgumentException{
  public StudentException(String message) {
        super(message);
    }
}
