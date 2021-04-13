public class main {
    public static void main(String[] args) {
        maneger employee = new maneger();
            nhanVien nhanVien1[] = new nhanVien[5];
        nhanVien1[0] = new nhanVienFullTime(111,"long5",25,132,"123",5,1,10);
        nhanVien1[1] = new nhanVienFullTime(112,"long4",25,132,"123",6,1,10);
        nhanVien1[2] = new nhanVienFullTime(113,"long3",25,132,"123",8,1,10);
        nhanVien1[3] = new nhanVienFullTime(114,"long2",25,132,"123",8,1,10);
        nhanVien1[4] = new nhanVienFullTime(115,"long1",25,132,"123",7,1,10);

    employee.setNhanViens(nhanVien1);
        System.out.println(employee.getFullTimeTB());

    }
}
