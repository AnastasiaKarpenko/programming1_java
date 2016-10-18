
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        
       
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }
    
    public Money plus(Money added) {
        Money money = new Money(this.euros + added.euros, this.cents + added.cents);
        return money;        
    }
    
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }
        return false;
    }
    
    public Money minus(Money decremented) {

        if (this.less(decremented)) {
            int eurosNew = 0;
            int centsNew = 0;

            return new Money(eurosNew, centsNew);
        } else {
            int eurosNew = this.euros - decremented.euros;
            int centsNew = this.cents - decremented.cents;
            if (this.cents < decremented.cents) {
                eurosNew--;
                centsNew = 100 - decremented.cents;
            }

            return new Money(eurosNew, centsNew);
        }
    }

}
