import java.util.ArrayList;

public class ArrayListExample {
        public static void main(String[] args) {
            //This line declares and initializes a ArrayList object named userDataArrayList that can store objects of type UserData
            ArrayList<UserData> userDataArrayList = new ArrayList<>();

            //This line creates a new UserData object with the values 100(id) and Siva(name).
            // The object is then added to the arraylist userDataArrayList.
            // This process is repeated for the next three userData objects, each with different values.
            userDataArrayList.add(new UserData(100,"Siva"));
            userDataArrayList.add(new UserData(102,"Raj"));
            userDataArrayList.add(new UserData(104,"Alia"));

            System.out.println();
            System.out.println("User Details");

            //This line starts a for-each loop that iterates over each element u in the arrayList userDataArrayList.
            // It assigns the current element to the variable u of type UserData.
            for (UserData u:userDataArrayList){
                //Inside the for-each loop, this line calls the displayInfo() method on each UserData object u.
                // The method prints the id and name parts of the userDetails.
                u.displayInfo();
                System.out.println();
            }
        }
    }
    //Creating a class named as userData
    class UserData{
        //Declared 2 variables
        private Integer id;
        private String name;

        //Constructor
        public UserData(Integer id,String name){
            this.id=id;
            this.name=name;
        }

        //method of this class
        public void displayInfo(){
            System.out.print("Id : "+id);
            System.out.print("\t Name : "+name);
        }
    }


