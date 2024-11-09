package generic.library;

public class Newspaper {

    private String name;
    private int issueNumber;
    private int yearPublished;

    public void setName(String name){
        this.name = name;
    }

    public void setIssueNumber(Integer issueNumber){
        this.issueNumber = issueNumber;
    }

    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }

    public String getName() {
        return name;
    }

    public int getYearPublished() {
        return yearPublished;
    }

    public int getIssueNumber() {
        return issueNumber;
    }
}
