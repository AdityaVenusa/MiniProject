package id.ac.polinema.miniproject.model;

public class RegisterRequest {
    private String nama,username,password,
            alamat, NoTelp, JK;

    public RegisterRequest(String nama, String username, String password, String alamat, String notelp,
        String jk) {
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.alamat = alamat;
        this.NoTelp = notelp;
        this.JK = jk;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return username;
    }

    public void setEmail(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) { this.alamat = alamat; }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String noTelp) { this.NoTelp = noTelp; }

    public String getJK() {
        return JK;
    }

    public void setJK(String jk) { this.JK = jk; }
}
