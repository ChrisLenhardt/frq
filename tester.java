public class tester {
    public static void main(String [] args){
        User u1 = new User(200405087, "Christopher Lenhardt", true);

        User[] userDataBase = new User[3];  //create an array of users

        userDataBase[0] = u1;

        System.out.println(userDataBase[0].getId());
    }
}
