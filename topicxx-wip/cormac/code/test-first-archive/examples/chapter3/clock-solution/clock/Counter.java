package clock;

class Counter
{
  private final int limit;
  private int value;
  
  Counter(final int limit, final int value)
  {
      assert (limit > 0 && 0 <= value && value < limit);
      this.limit = limit;
      this.value = value;
  }
  
  int getValue()
  {
      assert (this.limit > 0 && 0 <= this.value && this.value < this.limit);
      return this.value;
  }
  
  int getLimit()
  {
      assert (this.limit > 0 && 0 <= this.value && this.value < this.limit);
      return this.limit;
  }
  
  void increment()
  {
      assert (this.limit > 0 && 0 <= this.value && this.value < this.limit);
      this.value = (this.value + 1) % this.limit;
      return;
  }
}
