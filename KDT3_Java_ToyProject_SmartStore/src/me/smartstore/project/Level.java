public class Level {
    String groupType = null;
    int minimumSpentTime = 0;
    int minimumTotalPay = 0;

    public void Level(String groupType, int minimumSpentTime, int minimumTotalPay){
        this.groupType = groupType;
        this.minimumSpentTime = minimumSpentTime;
        this.minimumTotalPay = minimumTotalPay;

        System.out.printf("\n" +
                "GroupType: %s\n" +
                "Parameter: Parameter{minimumSpentTime=%d, minimumTotalPay=%d}\n", groupType, minimumSpentTime, minimumTotalPay);
    }
}
