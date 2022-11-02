public class VendingMachine {
    private int canCount;
    private int tokenCount;

    public VendingMachine(){
        canCount = 0;
        tokenCount = 0;
    }
    public VendingMachine(int canCount) {
        this.canCount = canCount;
    }
    public void insertToken(){
        canCount--;
        tokenCount++;
    }
    public void fillUp(int cans){canCount += cans;}
    public int getCanCount(){ return canCount;}
    public int getTokenCount(){ return tokenCount;}

    public int getcanCount() {
        return canCount;
    }
}
