
package Business.NGO;
/**
 *
 * @author hp
 */

public class NGO {
 
    private String NgoName;
    private String ngoid;
    private static int count;

    public NGO() {
        
        ngoid="ORG"+(++count);
        
    }

    public String getNgoName() {
        return NgoName;
    }

    public void setNgoName(String NgoName) {
        this.NgoName = NgoName;
    }

  
    public String getNgoid() {
        return ngoid;
    }

    public void setNgoid(String ngoid) {
        this.ngoid = ngoid;
    }
    
    @Override
    public String toString(){
        
        return NgoName;
    }
    
    
}


