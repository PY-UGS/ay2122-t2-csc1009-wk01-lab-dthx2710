public class week_1{
    public static void main (String[] args){

        // Example 1
        String name = "Dylan";
        System.out.println("Hello, I am " + name + "!");

        // Example 3
        int courseId = 1009;
        String courseName = "None";
        switch(courseId){
            case 1006:
                courseName = "Maths 2";
                break;
            case 1007:
                courseName = "Operating Systems";
                break;
            case 1008:
                courseName = "Data Structure and Algorithm";
                break;
            case 1009:
                courseName = "Object-Oriented Programming";
                break;
            case 1010:
                courseName = "Computer Networks";
                break;
            default:
                courseName = "Unknown Course ID";
                break;
        }
        System.out.println("CSC" + courseId + " - " + courseName);

        // Example 4
        for (int i = 102; i >= 66 ; --i){
            if (i % 2 == 1){
                // odd number
                System.out.println(i);
            }
        }
    }
}