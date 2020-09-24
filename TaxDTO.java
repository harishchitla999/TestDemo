package dto;

public class TaxDTO
{
  private long bill_id;
  private String name;
  private float total_amount;
  private float tds;
  private float net_amount;

  public long getBill_id()
  {
    return this.bill_id;
  }

  public void setBill_id(long bill_id) {
    this.bill_id = bill_id;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public float getTotal_amount() {
    return this.total_amount;
  }

  public void setTotal_amount(float total_amount) {
    this.total_amount = total_amount;
  }

  public float getTds() {
    return this.tds;
  }

  public void setTds(float tds) {
    this.tds = tds;
  }

  public float getNet_amount() {
    return this.net_amount;
  }

  public void setNet_amount(float net_amount) {
    this.net_amount = net_amount;
  }

  public String toString()
  {
    return "TaxDTO [bill_id=" + this.bill_id + ", name=" + this.name + 
      ", total_amount=" + this.total_amount + ", tds=" + this.tds + 
      ", net_amount=" + this.net_amount + "]";
  }
}