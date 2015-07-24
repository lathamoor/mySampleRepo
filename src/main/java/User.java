/**
 * Created by latha on 7/23/15.
 */
public class User {
    private int userNo;
    private int userNameIndex;
    private String userName;
    private transient String userTrainset;
    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public int getUserNameIndex() {
        return userNameIndex;
    }

    public void setUserNameIndex(int userNameIndex) {
        this.userNameIndex = userNameIndex;
    }

    /**
     * test
     * @return
     */
    public String  getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;

    }

    public static void main(String args[]){
        System.out.println("hema");
    }


    public String getUserTrainset() {
        return userTrainset;
    }
}
