public class nhanVienFullTime extends nhanVien {
    private int tienThuong;
    private int tienPhat;
    private int luongCung;

    public nhanVienFullTime(int manhanvien, String hoten, int tuoi, int soDienThoai, String email, int tienThuong, int tienPhat, int luongCung) {
        super(manhanvien, hoten, tuoi, soDienThoai, email);
        this.tienThuong = tienThuong;
        this.tienPhat = tienPhat;
        this.luongCung = luongCung;
    }

    public int getTienThuong() {
        return tienThuong;
    }

    public void setTienThuong(int tienThuong) {
        this.tienThuong = tienThuong;
    }

    public int getTienPhat() {
        return tienPhat;
    }

    public void setTienPhat(int tienPhat) {
        this.tienPhat = tienPhat;
    }

    public int getluongCung() {
        return luongCung;
    }

    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }
    public int getlongThuclinh() {
        return ( getluongCung()+(getTienThuong()-getTienPhat()));
    }
    public String showNhanVien() {
        return  (getManhanvien()+" "+ getHoten()+" "+getSoDienThoai()+" "+getTuoi()+" " +getEmail());
    }
}
