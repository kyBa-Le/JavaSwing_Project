import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;

public class BMIController implements ActionListener{
    private BMIView view;
    private float chieuCao;
    private float canNang;
    private float chiSoBMI;
    private String ketLuan;
    public BMIController(BMIView view){
        this.view = view;
        view.getTinhKetQua().addActionListener(this);
        view.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(1);
            }
        });
    }
    private void tinhBMI(float chieuCao, float canNang){
        chiSoBMI = canNang/(chieuCao*chieuCao);
        if(chiSoBMI<18.5){
            ketLuan = "Bạn hơi gầy, hãy ăn nhiều hơn.";
        }else if(chiSoBMI<24.9){
            ketLuan = "Cơ thể của bạn khá cân đối, hãy duy trì.";
        }else if(chiSoBMI<29.9){
            ketLuan = "Bạn hơi thừa cân một chút, hãy tập luyện nhé.";
        }else if(chiSoBMI<34.9){
            ketLuan = "Bạn đã ở mức béo phì cấp 1, hãy chú ý!";
        }else if(chiSoBMI<39.9){
            ketLuan = "Bạn đã bị béo phì cấp độ 2, hãy gặp bác sĩ!";
        }else{
            ketLuan = "Bạn đã bị béo phì cấp độ 3, hãy chú ý đến sức khỏe!";
        }
    }
    private boolean validateChieuCao(){
        boolean isValid = false;
        try{
            if(!view.getNhapChieuCao().getText().equals("")){
                chieuCao = Float.parseFloat(view.getNhapChieuCao().getText());
                isValid = true;
            }else{
                JOptionPane.showMessageDialog(view, "Vui lòng nhập chiều cao!");
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(view, "Chiều cao nhập vào không hợp lệ!");
        }
        return isValid;
    }
    private boolean validateCangNang(){
        boolean isValid = false;
        try{
            if(!view.getNhapCanNang().getText().equals("")){
                canNang = Float.parseFloat(view.getNhapCanNang().getText());
                isValid = true;
            }else{
                JOptionPane.showMessageDialog(view, "Vui lòng nhập chiều cao!");
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(view, "Chiều cao nhập vào không hợp lệ!");
        }
        return isValid;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(validateCangNang()&&validateChieuCao()){
            tinhBMI(chieuCao, canNang);
            view.getChiSoBMI().setText(""+chiSoBMI);
            view.getTraKetLuan().setText(ketLuan);
        }else{
            view.getChiSoBMI().setText("");
            view.getTraKetLuan().setText("Hãy nhập chiều cao và cân nặng để có kết luận nào!");
        }
    }
    
    
}
