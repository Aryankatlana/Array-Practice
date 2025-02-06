public class SorceToDestinition {

    void process(int dest , int src)
    {
        
        if(src == dest)
        {
            System.out.println("Reached to the destinition");
            return;
        }
        src++;
        process(dest, src);
        System.out.println(src+" Destinition "+dest);
    }
    public static void main(String args[])
    {
        int dest = 10 ;
        int src = 1;

        SorceToDestinition ans = new SorceToDestinition();
        ans.process(dest , src);
    }
    
}
