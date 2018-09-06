//import javax.lang.model.util.ElementScanner6;

public class Main{
  public static void main(String[] args) {
    RatePlan palnA = new RatePlan("プランA",1123.30 , new TieredRateTable(0,19.62,120,26.10,300,30.12));
    RatePlan palnB = new RatePlan("プランB",1040.10 , new TieredRateTable(0,18.17,120,24.17,300,27.77));
    double amount = 543.0;
    int d = palnA.getPrice(amount) - palnB.getPrice(amount);
    if(d<0){
      System.out.printf("%sが%d円安い%n",palnA.getName(),-d);
    }else if (d>0){
      System.out.printf("%sが%d円安い%n",palnB.getName(),d);
    }else{
      System.out.println("両プランで同額");
    }
  }
}