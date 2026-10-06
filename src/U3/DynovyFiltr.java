package U3;

public class DynovyFiltr implements FilrtZprav {
    public boolean prijma(String text) {
        if (text == null){
            return false;
        }
        String t = text.trim().toLowerCase();
        if (t.isEmpty()){
            return false;
        }
        return t.contains("dyne");
    }
}
