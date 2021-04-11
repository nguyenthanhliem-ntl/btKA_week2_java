public class nhanVienParttime extends nhanVien {
    int gioLam;

    public nhanVienParttime(int manhanvien, String hoten, int tuoi, int soDienThoai, String email, int gioLam) {
        super(manhanvien, hoten, tuoi, soDienThoai, email);
        this.gioLam = gioLam;
    }

    public int getGioLam() {
        return gioLam;
    }

    public void setGioLam(int gioLam) {
        this.gioLam = gioLam;
    }
    public int luongThucLinhpt(){
        return getGioLam()*100000;
    }
    public String showNhanVienpt() {
        return  (getManhanvien()+" "+ getHoten()+" "+getSoDienThoai()+" "+getTuoi()+" " +getEmail());
    }
}
