package example.com.recyclerviewlab;

/**
 * Created by raymour on 7/5/16.
 */
public class CustomObject2 {

    private String Title2;
    private String Description2;
    private String Color2;
    private boolean CheckBox1;

    public CustomObject2(String myTitle2, String myDescription2, String myColor2, boolean myCheckBox) {

        Title2 = myTitle2;
        Description2 = myDescription2;
        Color2 = myColor2;
        CheckBox1 = myCheckBox;
    }

    public String getTitle2() {
        return Title2;
    }

    public String getDescription2() {
        return Description2;
    }

    public String getColor2() {
        return Color2;
    }

    public boolean isCheckBox1() {
        return CheckBox1;
    }
    public void setTitle2(String title2) {
        Title2 = title2;
    }

    public void setDescription2(String description2) {
        Description2 = description2;
    }

    public void setColor2(String color2) {
        Color2 = color2;
    }

    public void setCheckBox1(boolean checkBox1) {
        CheckBox1 = checkBox1;
    }
}
