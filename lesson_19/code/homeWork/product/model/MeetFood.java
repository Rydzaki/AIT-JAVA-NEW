package homeWork.product.model;

public class MeetFood extends Food {

    private String meetType;

    public MeetFood(String name, long barCode, double price, String expDate, String meetType) {
        super(name, barCode, price, expDate);
        this.meetType = meetType;
    }

    public String getMeetType() {
        return meetType;
    }

    public void setMeetType(String meetType) {
        this.meetType = meetType;
    }

    @Override
    public String toString() {
        return super.toString() + " MeetFood{" +
                "meetType='" + meetType + '\'' +
                '}';
    }
}
