package add_delete_waiter;

import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;

public class WaiterConstructor {
    private AddW addW;
    private DeleteW deleteW;
    private Connection con;
    private String firstName;
    private String lastName;
    private int age;
    private String employmentDate;
    private String position;


    public WaiterConstructor() {
    }


    public WaiterConstructor(AddW addW, Connection con, String firstName, String lastName, int age, String employmentDate, String position) {
        this.addW = addW;
        this.con = con;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;
        this.position = position;
    }

    public WaiterConstructor(DeleteW deleteW, Connection con, String firstName, String lastName) {
        this.deleteW = deleteW;
        this.con = con;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void actionAdd(){
        addW.add(con, firstName, lastName, age, employmentDate, position);
    }
    public void actionDelete(){
        deleteW.delete(con, firstName, lastName);
    }

    public AddW getAddW() {
        return addW;
    }

    public void setAddW(AddW addW) {
        this.addW = addW;
    }

    public DeleteW getDeleteW() {
        return deleteW;
    }

    public void setDeleteW(DeleteW deleteW) {
        this.deleteW = deleteW;
    }
}
