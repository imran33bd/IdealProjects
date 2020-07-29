import com.sun.xml.internal.bind.v2.runtime.output.StAXExStreamWriterOutput;

public class Country {
    public static void main(String[] args) {
        Country myCountry = new Country();
        myCountry.hometown();
        myCountry.capital();
    }
    public void hometown(){
        System.out.println("i am originally from Sylhet");
        System.out.println("i love my hometown");
    }
    public void capital(){
        System.out.println("Dhaka is the capital of Bangladesh");
    }
}

