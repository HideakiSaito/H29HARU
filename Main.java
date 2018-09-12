import javax.lang.model.util.ElementScanner6;

public class Main{
  public static void main(String[] args) {
    RatePlan palnA = new RatePlan("ƒvƒ‰ƒ“A",1123.30 , new TieredRateTable(0,19.62,120,26.10,300,30.12));
    RatePlan palnB = new RatePlan("ƒvƒ‰ƒ“B",1040.10 , new TieredRateTable(0,18.17,120,24.17,300,27.77));
    double amount = 200.0;
    int d = palnA.getPrice(amount) - palnB.getPrice(amount);
    if(d<0){
      System.out.printf("%s‚ª%d‰~ˆÀ‚¢%n",palnA.getName(),-d);
    }else if (d>0){
      System.out.printf("%s‚ª%d‰~ˆÀ‚¢%n",palnB.getName(),d);
    }else{
      System.out.println("—¼ƒvƒ‰ƒ“‚Å“¯Šz");
    }
  }
}