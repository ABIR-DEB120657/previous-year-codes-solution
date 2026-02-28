package arrarys;
class Department {
    int departmentid;
    String departmentname;
    String departmentlocation;
 void setDepartment (int departmentid, String departmentname, String departmentlocation) {
     this.departmentid = departmentid; this.departmentname = departmentname; this.departmentlocation = departmentlocation;
 }void Display(){
     System.out.println("Departmentid: " + departmentid); System.out.println("Departmentname: " + departmentname);
     System.out.println("Departmentlocation: " + departmentlocation);
 }
}public class university {
    public static void main (String[]args){
        Department d1 = new Department();Department d2 = new Department();
        d1.departmentid = 1;
        d1.departmentname = "Department 1";
        d1.departmentlocation = "2nd folor";
        d2.departmentid = 2;
        d2.departmentname = "Department 2";
        d2.departmentlocation = "1st folor";
        d1.Display();
        d2.Display();

    }
}
