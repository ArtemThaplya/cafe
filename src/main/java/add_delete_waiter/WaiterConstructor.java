package add_delete_waiter;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;

public class WaiterConstructor {
    private AddW addW;
    private DeleteW deleteW;
    private Statement stm;
    private String firstName;
    private String lastName;
    private int age;
    private Date employmentDate;
    private String position;


    public WaiterConstructor() {
    }


    public WaiterConstructor(AddW addW, Statement stm, String firstName, String lastName, int age, Date employmentDate, String position) {
        this.addW = addW;
        this.stm = stm;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.employmentDate = employmentDate;
        this.position = position;
    }

    public WaiterConstructor(DeleteW deleteW, Statement stm, String firstName, String lastName) {
        this.deleteW = deleteW;
        this.stm = stm;
        this.firstName = firstName;
        this.lastName = lastName;
    }


    public void actionAdd(){
        addW.add(stm, firstName, lastName, age, employmentDate, position);
    }
    public void actionDelete(){
        deleteW.delete(stm, firstName, lastName);
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
