package w4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriterEx {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        FileWriter fout = null;
        int c;
        try{
            fout = new FileWriter("../proj0328/test2.txt");
            // 버퍼 스트림 추가 -> 성능 개선
            BufferedWriter bfout = new BufferedWriter(fout);
            // 알아서 test.txt 생성됨.
            while(true){
                String line = scanner.nextLine();
                if(line.length() == 0)
                    break;
//                fout.write(line, 0, line.length());
//                fout.write("\r\n", 0, 2);
                // 한 줄을 띄기 위해 \r\n을 파일에 저장
                // \r : 캐리지 리턴, 맨 앞으로 커서 이동
                // \r\n로 인해 다음 줄 맨 앞으로 커서가 이동한다.
                // \r\n은 이스케이프 문자이기에 하나로 친다.
                bfout.write(line, 0, line.length());
                bfout.write("\r\n", 0, 2);
            }
            bfout.close();
            fout.close();
        } catch (IOException e){
            System.out.println("입출력 오류");
        }
        scanner.close();
    }
}
