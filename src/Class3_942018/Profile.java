/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class3_942018;

/**
 *
 * @author al
 */
public class Profile {
    
    private String fName;
    private String lName;
    private String userName;
    private String classRank;
    private int numberOfCourses;
    private String semester;
    private String major;
    private byte creditsThisSemester;

//Constructors
    public Profile(){
        
    }

    public Profile(String fName, String lName, String userName, String classRank, int numberOfCourses, String semester, String major, byte creditsThisSemester) {
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.classRank = classRank;
        this.numberOfCourses = numberOfCourses;
        this.semester = semester;
        this.major = major;
        this.creditsThisSemester = creditsThisSemester;
    }

    public Profile(String fName, String lName, String userName, String semester, String major, byte creditsThisSemester) {
        this.fName = fName;
        this.lName = lName;
        this.userName = userName;
        this.semester = semester;
        this.major = major;
        this.creditsThisSemester = creditsThisSemester;
    }

 
// Getters
    public String getfName() {
        return fName;
    }

    public String getlName() {
        return lName;
    }

    public String getUserName() {
        return userName;
    }

    public String getMajor() {
        return major;
    }

    public String getClassRank() {
        return classRank;
    }

    public int getNumberOfCourses() {
        return numberOfCourses;
    }

    public String getSemester() {
        return semester;
    }
    
    public byte getCreditsThisSemester() {
        return creditsThisSemester;
    }
    
//Setters
    public void setfName(String fName) {
        this.fName = fName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setClassRank(String classRank) {
        this.classRank = classRank;
    }

    public void setNumberOfCourses(int numberOfCourses) {
        this.numberOfCourses = numberOfCourses;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
    
    public void setCreditsThisSemester(byte creditsThisSemester) {
        this.creditsThisSemester = creditsThisSemester;
    }
        
}
