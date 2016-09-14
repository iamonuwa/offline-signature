package helpers;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import offlinesignature.Verification;

/**
 *
 * @author Onuwa Nnachi Isaac <i_onuwa4u@outlook.com>
 */
public class Database {
    
    private Connection mConnection;
    private final String URL = "jdbc:mysql://localhost:3306/signature";
    private final String userName = "root";
    private final String password = "";
    
    private static final String DBURL = "jdbc:mysql://localhost:3306/signature?autoReconnect=true&useSSL=false&"
                    + "user=root";

    public Database() {
    }
    
    public Connection getConnection(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            mConnection = DriverManager.getConnection(DBURL);
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error in Connection. Please try again");
        }
        return mConnection;
    }
    


    public String signin(String idNumber, String password){
        try {
            PreparedStatement mPreparedStatement = mConnection.prepareStatement("SELECT * FROM users WHERE idNumber = ? AND password = ?");
            mPreparedStatement.setString(1, idNumber);
            mPreparedStatement.setString(2, password);
            
            ResultSet mResultSet = mPreparedStatement.executeQuery();
            if(mResultSet.next()){
                return mResultSet.getString("fullname");
            }
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }   
        return null;
    }
    
    
    public int registerStaff() throws SQLException{
        Users mUser = new Users();
        String fullname = mUser.getFullname();
        String designation = mUser.getDesignation();
        String password = mUser.getPassword();
        String idNumber = mUser.getIdNumber();
        String role = mUser.getRole();
        PreparedStatement mPreparedStatement = mConnection.prepareStatement("INSERT INTO users VALUES(?, ?, ?, ?, ?)");
        mPreparedStatement.setString(1, fullname);
        mPreparedStatement.setString(2, designation);
        mPreparedStatement.setString(3, password);
        mPreparedStatement.setString(4, idNumber);
        mPreparedStatement.setString(5, role);
            
        return mPreparedStatement.executeUpdate();
    }
   
    public ArrayList<Accounts> getAccount(String acct_num) throws FileNotFoundException, IOException{
        ArrayList<Accounts> data = new ArrayList<>();
        String sql = "SELECT * FROM accounts WHERE acct_num = '"+ acct_num+"'";
        try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)){
            ResultSet mResultSet = statement.executeQuery(sql);
            while (mResultSet.next()) { 
                int id = mResultSet.getInt("id");
                String fullname = mResultSet.getString("fullname");
                String gender = mResultSet.getString("gender");
                String dob = mResultSet.getString("dob");
                String signature = mResultSet.getString("signature");
                Accounts mAccounts = new Accounts(id, acct_num, fullname, gender, dob, signature);
                data.add(mAccounts);
            }
            return data;
        } catch (SQLException | NumberFormatException e) {
        {
            e.printStackTrace();
        }
        
        return null;
    }
    }
    
        public Boolean addData(String name, String designation, String idNumber, String role, String password) {
       
        String sql = "INSERT INTO users(fullname, designation, idNumber, role, password) VALUES('" + name + "','" + designation + "','" + idNumber + "', '" + role + "', '" + password + "')";
        try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)) {
            statement.execute(sql);
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }

    
    public DefaultTableModel getData() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("NAME");
        defaultTableModel.addColumn("DESIGNATION");
        defaultTableModel.addColumn("ID NUMBER");
        defaultTableModel.addColumn("ROLE");
        String sql = "SELECT * FROM users";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
               
                String mID = resultSet.getString("id");
                String mFullname = resultSet.getString("fullname");
                String mDesignation = resultSet.getString("designation");
                String mIDNumber = resultSet.getString("idNumber");
                String mRole = resultSet.getString("role");
                defaultTableModel.addRow(new String[]{mID, mFullname, mDesignation, mIDNumber, mRole});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    public Boolean deleteData(String id){

        String sql = "DELETE FROM users WHERE id ='" + id + "'";


        try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)){
            statement.execute(sql);
            return true;

        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
    
    
    public Boolean updateData(String id, String name, String designation, String idNumber, String role) {
       
        String sql = "UPDATE users SET fullname ='" + name+  "',designation ='" + designation + "',idNumber ='" + idNumber + "' WHERE id ='" + id + "'";
        try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)) {
            statement.execute(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
//    Enroll Database Manipulation
    
    public DefaultTableModel getEnrollData() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("NAME");
        defaultTableModel.addColumn("ACCOUNT NUMBER");
        defaultTableModel.addColumn("GENDER");
        defaultTableModel.addColumn("DATE OF BIRTH");
        defaultTableModel.addColumn("SIGNATURE PATH");
        String sql = "SELECT * FROM accounts";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
               
                String mID = resultSet.getString("id");
                String mFullname = resultSet.getString("fullname");
                String mAccount = resultSet.getString("acct_num");
                String mDOB = resultSet.getString("dob");
                String mGender = resultSet.getString("gender");
                String mSignature = resultSet.getString("signature");
                defaultTableModel.addRow(new String[]{mID, mFullname, mAccount, mDOB, mGender, mSignature});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean addEnrollData(String accountNumber, String name, String dob, Object gender, String signatureValue) {
        try {
            String sql = "INSERT INTO accounts(acct_num, fullname, gender, dob, signature) VALUES('" + accountNumber + "','" + name + "','" + gender.toString() + "', '" + dob + "', '" + signatureValue + "')";
            try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)) {
            statement.execute(sql);
            return true;
        
        }
            } catch (SQLException ex) {
        }
        return false;
        
    
        
        
        
    }
    
    
    public Boolean deleteEnrollData(String id){

        String sql = "DELETE FROM accounts WHERE id ='" + id + "'";


        try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)){
            statement.execute(sql);
            return true;

        }catch(Exception ex)
        {
            ex.printStackTrace();
            return false;
        }
    }
    
     public Boolean updateEnrollData(String id, String accountNumber, String name, String dob, Object gender, String signatureValue) {
       
        String sql = "UPDATE users SET fullname ='" + name+  "',acct_num ='" + accountNumber + "', dob = '" + dob + "', signature = '" + signatureValue + "',gender ='" + gender + "'  WHERE id ='" + id + "'";
        try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)) {
            statement.execute(sql);
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return false;
        }
    }
     
     public boolean addAuditData(String date, String accountNum, String user) {
        try {
            String sql = "INSERT INTO audit(date, accounts_id, users_id) VALUES('" + date + "','" + accountNum + "','" + user + "')";
            try(Connection connection = DriverManager.getConnection(URL, userName, password); Statement statement = connection.prepareStatement(sql)) {
            statement.execute(sql);
            return true;
        
        }
            } catch (SQLException ex) {
        }
        return false;
     }
     
     public DefaultTableModel getAuditData() {
        DefaultTableModel defaultTableModel = new DefaultTableModel();
        defaultTableModel.addColumn("ID");
        defaultTableModel.addColumn("DATE");
        defaultTableModel.addColumn("ACCOUNT NUMBER");
        defaultTableModel.addColumn("EDITOR");
        String sql = "SELECT * FROM audit";
        try(Connection connection = DriverManager.getConnection(URL, userName, password);Statement statement = connection.prepareStatement(sql)) {
            ResultSet resultSet = statement.executeQuery(sql);
            
            while (resultSet.next()) {
               
                String mID = resultSet.getString("id");
                String mDate = resultSet.getString("date");
                String mAccountNumber = resultSet.getString("account_number");
                String mUser = resultSet.getString("user");
                defaultTableModel.addRow(new String[]{mID, mDate, mAccountNumber, mUser});
            }
            return defaultTableModel;
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
