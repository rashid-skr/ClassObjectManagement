
public class Test {
    public static void main(String[] args){
        Teacher teacher1=new Teacher();
        teacher1.Name="Shamim Hossen";
        teacher1.Gender="male";
        teacher1.Address="Mirpur";
        teacher1.Phone=734212342;
        teacher1.HouseN=152;
            System.out.println("Name:"+teacher1.Name);
            System.out.println("Gender:"+teacher1.Gender);
            System.out.println("Address:"+teacher1.Address);
            System.out.println("Phone:"+teacher1.Phone);
            System.out.println("HouseN:"+teacher1.HouseN);
            Teacher teacher2=new Teacher();
        teacher2.Name="Raju";
        teacher2.Gender="male";
        teacher2.Address="Mirpur";
        teacher2.Phone=735212342;
        teacher2.HouseN=152/2;
            System.out.println("Name:"+teacher2.Name);
            System.out.println("Gender:"+teacher2.Gender);
            System.out.println("Address:"+teacher2.Address);
            System.out.println("Phone:"+teacher2.Phone);
            System.out.println("HouseN:"+teacher2.HouseN); 
    }
}
