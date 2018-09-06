import javax.lang.model.util.ElementScanner6;
class RatePlan{
  private final String name;
  private final double basicCharge;
  private final TierTable pricingTiers;

  /**
   * ���[�g�v��
   * @param name
   * @param basicCharge
   * @param pricingTiers
   */
  RatePlan(String name,double basicCharge,TierTable pricingTiers){
    this.name = name;
    this.basicCharge = basicCharge;
    this.pricingTiers = pricingTiers;
  }

  String getName(){return name;}

  int getPrice(double amount){
    return (int)(basicCharge + pricingTiers.map(amount));
  }
}