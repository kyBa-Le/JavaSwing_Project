
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BMIView extends JFrame{
    private JTextField nhapChieuCao;
    private JTextField nhapCanNang;
    private JTextArea chiSoBMI;
    private JTextArea traKetLuan;
    private JButton tinhKetQua;
    public BMIView() {
        setTitle("Tính chỉ số BMI");
        setLayout(null);
        JLabel chieuCao = new JLabel("Chieu cao (m):");
        JLabel canNang = new JLabel("Can nang (kg):");
        JLabel chiSo = new JLabel("--> Chỉ số BMI:");
        JLabel ketLuan = new JLabel("Kết luận:");
        canNang.setBounds(20, 70, 100, 20);
        chieuCao.setBounds(20, 20, 100, 20);
        chiSo.setBounds(80,200,90,20);
        ketLuan.setBounds(20,270,80,20);


        traKetLuan = new JTextArea();
        nhapChieuCao = new JTextField();
        nhapCanNang = new JTextField();
        chiSoBMI = new JTextArea();
        nhapCanNang.setBounds(120, 70, 200, 30);
        nhapChieuCao.setBounds(120, 20, 200, 30);
        chiSoBMI.setBounds(180,200,50,30);
        traKetLuan.setBounds(100,270,250,100);
        traKetLuan.setBackground(Color.LIGHT_GRAY);
        traKetLuan.setWrapStyleWord(true);
        traKetLuan.setLineWrap(true);

        tinhKetQua = new JButton("Tính toán");
        tinhKetQua.setBounds(250,120,100,40);
        
        add(chieuCao);
        add(canNang);
        add(nhapChieuCao);
        add(nhapCanNang);
        add(chiSo);
        add(chiSoBMI);
        add(tinhKetQua);
        add(traKetLuan);
        add(ketLuan);
        setSize(400, 500);
        setVisible(true);
    }
    public JTextField getNhapChieuCao(){
        return this.nhapChieuCao;
    }
    public void setNhapChieuCao(JTextField nhapChieuCao){
        this.nhapChieuCao = nhapChieuCao;
    }
    public JTextField getNhapCanNang(){
        return this.nhapCanNang;
    }
    public void setNhapCanNang(JTextField nhapCanNang){
        this.nhapCanNang = nhapCanNang;
    }
    public JTextArea getChiSoBMI(){
        return this.chiSoBMI;
    }
    public void setChiSoBMI(JTextArea chiSoBMI){
        this.chiSoBMI = chiSoBMI;
    }
    public JButton getTinhKetQua(){
        return this.tinhKetQua;
    }
    public void setTinhKetQua(JButton tinhKetQua){
        this.tinhKetQua = tinhKetQua;
    }
    public JTextArea getTraKetLuan(){
        return this.traKetLuan;
    }
    public void setTraKetLuan(JTextArea traKetLuan){
        this.traKetLuan = traKetLuan;
    }
}

