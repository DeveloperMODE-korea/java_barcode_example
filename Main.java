
import java.util.Scanner;

public class Main {    public static void main(String[] args) {
        String path = "./data/";
        String fileName = "barcode128.png";
        Scanner scanner = new Scanner(System.in);
        String data;
        
        try {
            while (true) { 
                System.out.print("Barcode-128용 Data 입력 : ");
                data = scanner.next();
                if (!data.isEmpty()) {
                    break;
                }
            }
            
            // 여기서 path와 fileName을 사용하여 바코드 생성 로직을 추가할 수 있습니다
            System.out.println("입력된 데이터: " + data);
            System.out.println("저장 경로: " + path + fileName);
              } finally {
            scanner.close();
        }
        
        BarcodeHandler barcodeHandler = new BarcodeHandler(path + fileName);
        barcodeHandler.encoding(data);
    }
}