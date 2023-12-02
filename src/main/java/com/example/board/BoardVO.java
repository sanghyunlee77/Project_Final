package com.example.board;

public class BoardVO {

    private int id;
    private String Rname;
    private String Fname;
    private int People;
    private String Kind;
    private String Pnumber;
    private String Meetday;
    private String regdate; // Assuming regdate is a string, change it to the appropriate type if needed
    private int star;
    private String contents;

    // getters and setters for each attribute

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRname() {
        return Rname;
    }

    public void setRname(String Rname) {
        this.Rname = Rname;
    }

    public String getFname() {
        return Fname;
    }

    public void setFname(String Fname) {
        this.Fname = Fname;
    }

    public int getPeople() {
        return People;
    }

    public void setPeople(int People) {
        this.People = People;
    }

    public String getKind() {
        return Kind;
    }

    public void setKind(String Kind) {
        this.Kind = Kind;
    }

    public String getPnumber() {
        return Pnumber;
    }

    public void setPnumber(String Pnumber) {
        this.Pnumber = Pnumber;
    }

    public String getMeetday() {
        return Meetday;
    }

    public void setMeetday(String Meetday) {
        this.Meetday = Meetday;
    }

    public String getRegdate() {
        return regdate;
    }

    public void setRegdate(String regdate) {
        this.regdate = regdate;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }
}
