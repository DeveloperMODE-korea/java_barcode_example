import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class BarcodeHandler {
    private final String fileName;

    public BarcodeHandler(String fileName) {
        this.fileName = fileName;
    }

    public void encoding(String data) {
        try {
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix bitMatrix = writer.encode(data, BarcodeFormat.CODE_128, 600, 300);
            Path path = Paths.get(fileName);
            MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
            System.out.println("바코드가 생성되었습니다: " + fileName);
        } catch (WriterException | IOException e) {
            System.err.println("오류 발생: " + e.getMessage());
        }
    }
}
