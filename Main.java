import javax.lang.model.util.ElementScanner6;

public class Main{
  public static void main(String[] args) {
    RatePlan palnA = new RatePlan("�v����A",1123.30 , new TieredRateTable(0,19.62,120,26.10,300,30.12));
    RatePlan palnB = new RatePlan("�v����B",1040.10 , new TieredRateTable(0,18.17,120,24.17,300,27.77));
    double amount = 200.0;
    int d = palnA.getPrice(amount) - palnB.getPrice(amount);
    if(d<0){
      System.out.printf("%s��%d�~����%n",palnA.getName(),-d);
    }else if (d>0){
      System.out.printf("%s��%d�~����%n",palnB.getName(),d);
    }else{
      System.out.println("���v�����œ��z");
    }
  }
}