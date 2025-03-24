public class DistributePensAmongStudents { 
    public static void main(String[] args) { 
        int totalPens = 14, totalStudents = 3; 
        int pensEachStudent = totalPens / totalStudents; 
        int remainingPens = totalPens % totalStudents; 
        System.out.println("The Pen Per Student is " + pensEachStudent + " and the remaining pen not distributed is " + remainingPens); 
    } 
} 
