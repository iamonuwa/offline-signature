package helpers;

import java.sql.Blob;

/**
 *
 * @author Onuwa Nnachi Isaac <i_onuwa4u@outlook.com>
 */
public class Accounts {
    
    public int id;
    public String acct_num;
    public String fullname;
    public String gender;
    public String dob;
    public String passport;
    public String signature;

    public Accounts(int id, String acct_num, String fullname, String gender, String dob, String signature) {
        this.id = id;
        this.acct_num = acct_num;
        this.fullname = fullname;
        this.gender = gender;
        this.dob = dob;
        this.signature = signature;
    }

    public Accounts() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcct_num() {
        return acct_num;
    }

    public void setAcct_num(String acct_num) {
        this.acct_num = acct_num;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }
    
    
}
