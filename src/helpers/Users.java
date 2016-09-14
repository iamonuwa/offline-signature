package helpers;

/**
 *
 * @author Onuwa Nnachi Isaac <i_onuwa4u@outlook.com>
 */
public class Users {

    public int id;
    public String fullname;
    public String designation;
    public String idNumber;
    public String password;
    public String role;

    public Users() {
    }

    public Users(int id, String fullname, String designation, String idNumber, String password, String role) {
        this.id = id;
        this.fullname = fullname;
        this.designation = designation;
        this.idNumber = idNumber;
        this.password = password;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    
    
    
}
