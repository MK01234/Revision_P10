package sg.edu.rp.c346.revision_p10;

/**
 * Created by 17045740 on 24/7/2018.
 */

public class contactList {

    private String name;
    private int number;
    private String info;

    //public EmployeeList(String name,Float info ) {
    //  this.name = name;
    //this.info = info;
    //}


    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public contactList(String name, String info, int number) {
        this.name = name;
        this.info = info;
        this.number = number;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getInfo(){
        return info;
    }
    public String setInfo(){
        return info;
    }


    //public String getInfoString() {
    //  String str = info.longValue(Float.) + "/" + date.get(Calendar.MONTH) + "/" + date.get(Calendar.YEAR);

    //return str;
    //}


//    }

    @Override
    public String toString() {
        return "To Do This{" +
                "Title='" + name + '\'' +
                ", info='" + info + '\'' + "salary" + number +
                '}';
    }

}


