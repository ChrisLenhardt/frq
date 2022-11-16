public class User {
    private int id;
    private String name;
    private boolean isAdmin;
    private String userNote;


    //constructor
    public User(int id, String name, boolean isAdmin){  //parameters satisfy all instance variables
        this.id = id;
        this.name = name;
        this.isAdmin = isAdmin;
        this.userNote = "";
    }

    //getters
    public int getId(){ // *scope* *return type* *name* *(parameters)*
        return id;  //All methods with a return type other than void MUST have a return
    }

    public String getName(){
        return name;
    }

    public boolean getAdmin(){
        return isAdmin;
    }

    public String getNotes(){
        return userNote;
    }

    //setters
    public void setId(int id){
        this.id = id;   //setting the parameter input to the instance variable
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAdmin(boolean isAdmin){
        this.isAdmin = isAdmin;
    }

    public void setNotes(String note){
        this.userNote = note;
    }


    //other methods

    public void addNotes(String note){
        this.userNote += note;
    }


}
