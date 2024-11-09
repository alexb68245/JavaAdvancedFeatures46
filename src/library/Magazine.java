package library;

public class Magazine extends LibraryItem{

    private int issueNumber;

    public Magazine(String title, int yearPublished, int issueNumber) {
        super(title, yearPublished);
        this.issueNumber = issueNumber;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String showDetails(){
        return "Magazine title: " + getTitle() + ", year published: " + getYearPublished() + ", issue number: " + issueNumber;
    }
}
