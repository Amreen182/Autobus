public class Autobus 
{
    private String kennzeichen;
    private int sitzplätze;
    private boolean anhanger; 
    
    public Autobus(String neuKennzeichen, int neuSitzplätze, boolean neuAnhanger)
    {
        setKennzeichen (neuKennzeichen);
        setSitzplätze  (neuSitzplätze);
        setAnhanger    (neuAnhanger);
    }
    
    public Autobus()
    {
        setKennzeichen ("W-1234A");
        setSitzplätze  (29);
        setAnhanger    (false);
    }

    
    

    
    public String getKennzeichen()
    {
        return kennzeichen;
    }
    
    public int getSitzplätze()
    {
        return sitzplätze;
    }
    
    public boolean getAnhanger() 
    {
        return anhanger;
    }
    
    public void setKennzeichen(String neuKennzeichen)
    {
        kennzeichen = neuKennzeichen;
    }
    
    public void setSitzplätze(int neuSitzplätze)
    {
        sitzplätze = neuSitzplätze;
    }
    
    public void setAnhanger(boolean neuAnhanger)
    {
        anhanger = neuAnhanger; 
    }
    
    
    
}

  
    